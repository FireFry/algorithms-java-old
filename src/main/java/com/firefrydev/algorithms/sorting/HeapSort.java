package com.firefrydev.algorithms.sorting;

public class HeapSort {

    public static void sort(int[] a) {
        int heapsize = a.length;
        for (int i = heapsize / 2 - 1; i >= 0; i--) {
            heapify(a, i, heapsize);
        }
        while (heapsize > 1) {
            heapsize--;
            swap(a, 0, heapsize);
            heapify(a, 0, heapsize);
        }
    }

    private static void heapify(int[] a, int i, int heapsize) {
        int l = i << 1;
        int r = l + 1;
        int largest = i;
        if (l < heapsize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapsize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            heapify(a, largest, heapsize);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int z = a[i];
        a[i] = a[j];
        a[j] = z;
    }

}
