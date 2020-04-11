package st.exp4;

import org.junit.Assert;
import org.junit.Test;

import st.exp4.BackPack;

public class TestBackPack {
	
	@Test
	public void testBackPack1() {
		int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int row = c.length;
        int col = c[0].length;
        int except = 11;
        Assert.assertEquals(except,c[row-1][col-1]);
	}
	
	@Test
	public void testBackPack2() {
		int m = 2;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int row = c.length;
        int col = c[0].length;
        int except = 0;
        Assert.assertEquals(except,c[row-1][col-1]);
	}
	
	@Test
	public void testBackPack3() {
		int m = 10;
        int n = 0;
        int w[] = {};
        int p[] = {};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int row = c.length;
        int col = c[0].length;
        int except = 0;
        Assert.assertEquals(except,c[row-1][col-1]);
	}
	
	@Test
	public void testBackPack4() {
		int m = 100;
        int n = 5;
        int w[] = {77,22,29,50,99};
        int p[] = {92,22,87,46,90};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int row = c.length;
        int col = c[0].length;
        int except = 133;
        Assert.assertEquals(except,c[row-1][col-1]);
	}
	
	@Test
	public void testBackPack5() {
		int m = 200;
        int n = 8;
        int w[] = {79,58,86,11,28,62,15,68};
        int p[] = {83,14,54,79,72,52,48,62};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int row = c.length;
        int col = c[0].length;
        int except = 334;
        Assert.assertEquals(except,c[row-1][col-1]);
	}
}