package com.firefrydev.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public abstract class SortingAlgorithmTester extends Assert {
    private final Random random = new Random();

    @Test
    public void test1() {
        testSorting(10, 3);
    }

    @Test
    public void test2() {
        testSorting(10, Integer.MAX_VALUE);
    }

    @Test
    public void test3() {
        testSorting(100, 10);
    }

    @Test
    public void test4() {
        testSorting(100, Integer.MAX_VALUE);
    }

    @Test
    public void test5() {
        testSorting(100000, 100);
    }

    @Test
    public void test6() {
        testSorting(100000, Integer.MAX_VALUE);
    }

    protected void testSorting(int n, int maxValue) {
        int[] a = createRandomArray(n, maxValue);
		long time = System.currentTimeMillis();
        sort(a);
		System.out.println("Sorting time: " + (System.currentTimeMillis() - time));
        for (int i = 0; i < a.length - 1; i++) {
            assertTrue(a[i] <= a[i + 1]);
        }
    }

    protected abstract void sort(int[] a);

    private int[] createRandomArray(int n, int maxValue) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(maxValue);
        }
        return a;
    }

}
