package st.exp2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkRecord {
	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver=new FirefoxDriver();
		
		String baseUrl="http://103.120.226.190/selenium-demo/git-repo";
		driver.get(baseUrl);
		
		String testUserName="";
		String testPassWord="";
		String filePath=System.getProperty("user.dir")+"/src/resources/SeleniumLab2020.xlsx";
		try {
			FileInputStream fileInputStream = new FileInputStream(filePath);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			XSSFWorkbook workbook = new XSSFWorkbook(bufferedInputStream);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int lastRowIndex = sheet.getLastRowNum();
			//System.out.println(lastRowIndex);
			for (int i = 0; i <= lastRowIndex; i++) {
				XSSFRow row = sheet.getRow(i);
				if (row == null) { break; }
				WebElement userNumber=driver.findElement(By.name("user_number"));
				WebElement passWord=driver.findElement(By.name("password"));
				WebElement queryButton=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
				WebElement queryResult=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[4]/code"));
				
				short lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum; j++) {
					//String cellValue = row.getCell(j).getStringCellValue();
					if(j==1) {
						testUserName = row.getCell(j).getStringCellValue();
					}
					if(j==2) {
						testPassWord = row.getCell(j).getStringCellValue();
					}
				}
				if(testUserName.length()<=1||testPassWord.length()<=1) {
					break;
				}
				userNumber.sendKeys(testUserName);
				passWord.sendKeys(testPassWord);
				queryButton.click();
				//String queryString = queryResult.getText();
				String queryString=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code")).getText();
				assertEquals(testPassWord,queryString);
				System.out.println("Case "+(i+1)+", 原密码："+testPassWord+"  获取数据："+queryString);
			}
			System.out.println("测试完成");
			bufferedInputStream.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
