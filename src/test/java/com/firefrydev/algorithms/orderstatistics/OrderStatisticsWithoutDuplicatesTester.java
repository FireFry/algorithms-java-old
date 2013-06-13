package com.firefrydev.algorithms.orderstatistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class OrderStatisticsWithoutDuplicatesTester extends Assert {
    private final Random random = new Random();

	@Test
	public void test0() {
		assertEquals(2, OrderStatisticsWithoutDuplicates.find(new int[] {3, 2, 1}, 2));
		assertEquals(1, OrderStatisticsWithoutDuplicates.find(new int[] {3, 2, 1}, 1));
		assertEquals(3, OrderStatisticsWithoutDuplicates.find(new int[] {2, 3, 1}, 3));
	}

	@Test
	public void test1() {
		doTest(10);
	}

	@Test
	public void test2() {
		doTest(20);
	}

	@Test
	public void test3() {
		doTest(100);
	}

	@Test
	public void test4() {
		doTest(1000);
	}

	@Test
	public void test5() {
		doTest(10000);
	}

	private void doTest(int count) {
		int[] a = createArrayWithoutDuplicates(count);
		for (int i = 0; i < 100; i++) {
			int r = random.nextInt(count) + 1;
			assertEquals(r, OrderStatisticsWithoutDuplicates.find(a, r));
		}
	}

	private int[] createArrayWithoutDuplicates(int count) {
		int[] a = new int[count];
		for (int i = 1; i <= count; i++) {
			int r;
			do {
				r = random.nextInt(count);
			} while (a[r] != 0);
			a[r] = i;
		}
		return a;
	}

}
