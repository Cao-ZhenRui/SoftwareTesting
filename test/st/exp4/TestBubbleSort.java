package st.exp4;

import org.junit.Assert;
import org.junit.Test;

import st.exp4.BubbleSort;

public class TestBubbleSort {
	
	@Test
	public void testBubbleSort1() {
		int arr[] = {5,9,62,34,1,8,3,85};
		int except[] = {1,3,5,8,9,34,62,85};
		Assert.assertArrayEquals(except, BubbleSort.BubbleSort(arr));
	}
	
	@Test
	public void testBubbleSort2() {
		int arr[] = {};
		int except[] = {};
		Assert.assertArrayEquals(except, BubbleSort.BubbleSort(arr));
	}

	@Test
	public void testBubbleSort3() {
		int arr[] = {5,6,7,1,2,3,8,0,9,4,-6,-7};
		int except[] = {-7,-6,0,1,2,3,4,5,6,7,8,9};
		Assert.assertArrayEquals(except, BubbleSort.BubbleSort(arr));
	}
}
