package st.exp1;

import java.util.ArrayList;
import java.util.List;

public class Judge {
	Integer[] nums= {1,1,1,2,3};
	Integer[] money= {50,20,10,5,1};
	
	public boolean judgeX(int x) {
		for(int a=0;a<=nums[0];a++) {
			for(int b=0;b<=nums[1];b++) {
				for(int c=0;c<=nums[2];c++) {
					for(int d=0;d<=nums[3];d++) {
						for(int e=0;e<=nums[4];e++) {
							if(money[0]*a+money[1]*b+money[2]*c+money[3]*d+money[4]*e==x) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}
