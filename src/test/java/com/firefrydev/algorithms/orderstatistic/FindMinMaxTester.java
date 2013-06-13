package com.firefrydev.algorithms.orderstatistic;

import org.junit.Assert;
import org.junit.Test;

public class FindMinMaxTester extends Assert {

	@Test
	public void test1() {
		doTest(new int[] {4, 2, 1, 7, 3}, new int[] {1, 7});
	}

	@Test
	public void test2() {
		doTest(new int[] {1, 2, 3, 4}, new int[] {1, 4});
		doTest(new int[] {1, 2, 4, 3}, new int[] {1, 4});
		doTest(new int[] {1, 3, 2, 4}, new int[] {1, 4});
		doTest(new int[] {1, 3, 4, 2}, new int[] {1, 4});
		doTest(new int[] {1, 4, 2, 3}, new int[] {1, 4});
		doTest(new int[] {1, 4, 3, 2}, new int[] {1, 4});

		doTest(new int[] {2, 1, 3, 4}, new int[] {1, 4});
		doTest(new int[] {2, 1, 4, 3}, new int[] {1, 4});
		doTest(new int[] {2, 3, 1, 4}, new int[] {1, 4});
		doTest(new int[] {2, 3, 4, 1}, new int[] {1, 4});
		doTest(new int[] {2, 4, 1, 3}, new int[] {1, 4});
		doTest(new int[] {2, 4, 3, 1}, new int[] {1, 4});
		doTest(new int[] {2, 1, 3, 4}, new int[] {1, 4});

		doTest(new int[] {3, 2, 4, 1}, new int[] {1, 4});
		doTest(new int[] {3, 1, 2, 4}, new int[] {1, 4});
		doTest(new int[] {3, 1, 4, 2}, new int[] {1, 4});
		doTest(new int[] {3, 4, 2, 1}, new int[] {1, 4});
		doTest(new int[] {3, 4, 1, 2}, new int[] {1, 4});
		doTest(new int[] {3, 1, 3, 4}, new int[] {1, 4});

		doTest(new int[] {4, 2, 1, 3}, new int[] {1, 4});
		doTest(new int[] {4, 3, 2, 1}, new int[] {1, 4});
		doTest(new int[] {4, 3, 1, 2}, new int[] {1, 4});
		doTest(new int[] {4, 1, 2, 3}, new int[] {1, 4});
		doTest(new int[] {4, 1, 3, 2}, new int[] {1, 4});
	}

	@Test
	public void test3() {
		doTest(new int[] {1, 3}, new int[] {1, 3});
	}

	@Test
	public void test4() {
		doTest(new int[] {4, 2}, new int[] {2, 4});
	}

	@Test
	public void test5() {
		doTest(new int[] {1, 2, 3}, new int[] {1, 3});
		doTest(new int[] {1, 3, 2}, new int[] {1, 3});
		doTest(new int[] {2, 1, 3}, new int[] {1, 3});
		doTest(new int[] {2, 3, 1}, new int[] {1, 3});
		doTest(new int[] {3, 1, 2}, new int[] {1, 3});
		doTest(new int[] {3, 2, 1}, new int[] {1, 3});
	}

	private static void doTest(int[] a, int[] expected) {
		assertArrayEquals(expected, FindMinMax.find(a));
	}

}
