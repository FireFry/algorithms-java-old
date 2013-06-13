package com.firefrydev.algorithms.orderstatistic;

import com.firefrydev.algorithms.sorting.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class OrderStatisticsTester extends Assert {
    private final Random random = new Random();

    @Test
    public void test1() {
        test(10, 3);
    }

    @Test
    public void test2() {
        test(10, Integer.MAX_VALUE);
    }

    @Test
    public void test3() {
        test(100, 10);
    }

    @Test
    public void test4() {
        test(100, Integer.MAX_VALUE);
    }

    @Test
    public void test5() {
        test(100000, 100);
    }

    @Test
    public void test6() {
        test(100000, Integer.MAX_VALUE);
    }

    protected void test(int n, int maxValue) {
        int[] original = createRandomArray(n, maxValue);
		int[] sorted = Arrays.copyOf(original, original.length);
		sort(sorted);
		int tests = Math.min(1000, n);
        for (int i = 0; i < tests; i++) {
			int r = random.nextInt(n) + 1;
            assertEquals(sorted[r - 1], OrderStatistics.find(Arrays.copyOf(original, original.length), r));
        }
    }

    protected void sort(int[] a) {
		QuickSort.sort(a);
	}

    private int[] createRandomArray(int n, int maxValue) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(maxValue);
        }
        return a;
    }

}
