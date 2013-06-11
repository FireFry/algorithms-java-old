package com.firefrydev.algorithms.sorting;

public class CountingSort {

    public static void sort(int[] a, int maxValue) {
        int[] c = new int[maxValue];
		int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
			b[i] = a[i];
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int i = b.length - 1; i >= 0; i--) {
            c[b[i]]--;
            a[c[b[i]]] = b[i];
        }
    }

}
