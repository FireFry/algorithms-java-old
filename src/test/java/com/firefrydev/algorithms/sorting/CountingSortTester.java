package com.firefrydev.algorithms.sorting;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

public class CountingSortTester extends Assert {
    private final Random random = new Random();

    @Test
    public void test1() {
        testSorting(10, 3);
    }

    @Test
    public void test3() {
        testSorting(100, 10);
    }

    @Test
    public void test5() {
        testSorting(100000, 100);
    }

    protected void testSorting(int n, int maxValue) {
        int[] a = createRandomArray(n, maxValue);
        sort(a, maxValue);
        for (int i = 0; i < a.length - 1; i++) {
            assertTrue(a[i] <= a[i + 1]);
        }
    }

    protected void sort(int[] a, int maxValue) {
        CountingSort.sort(a, maxValue);
    }

    private int[] createRandomArray(int n, int maxValue) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(maxValue);
        }
        return a;
    }

}
