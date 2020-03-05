package st.exp1;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

public class TestJudge {
	Judge judge;
	
	@Before
	public void setUp() {
		judge=new Judge();
	}
	
	@Test
	public void testJudgeX1() {
		assertEquals(true,judge.judgeX(0));
		assertEquals(true,judge.judgeX(23));
		assertEquals(true,judge.judgeX(93));
	}
	
	@Test
	public void testJudgeX2() {
		assertEquals(false,judge.judgeX(14));
		assertEquals(false,judge.judgeX(44));
		assertEquals(false,judge.judgeX(94));
	}
}
