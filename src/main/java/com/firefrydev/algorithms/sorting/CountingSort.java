package com.firefrydev.algorithms.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void sort(int[] a, int maxValue) {
        int[] c = new int[maxValue];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        int[] b = Arrays.copyOf(a, a.length);
        for (int i = b.length - 1; i >= 0; i--) {
            c[b[i]]--;
            a[c[b[i]]] = b[i];
        }
    }

}
