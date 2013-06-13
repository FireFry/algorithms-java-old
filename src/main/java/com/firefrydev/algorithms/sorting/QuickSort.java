package com.firefrydev.algorithms.sorting;

import java.util.Random;

public class QuickSort {
	private static final Random random = new Random();

    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = randPartition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

	private static int randPartition(int[] a, int p, int r) {
		int i = p + random.nextInt(r - p + 1);
		swap(a, r, i);
		return partition(a, p, r);
	}


	private static int partition(int[] a, int p, int r) {
        int key = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] <= key) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, r);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        int z = a[i];
        a[i] = a[j];
        a[j] = z;
    }

}
