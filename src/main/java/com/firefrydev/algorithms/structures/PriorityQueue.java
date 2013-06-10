package com.firefrydev.algorithms.structures;

public class PriorityQueue {

    public static void insert(int[] a, int heapsize, int key) {
        a[heapsize] = Integer.MIN_VALUE;
        heapsize++;
        increaseKey(a, heapsize, heapsize - 1, key);
    }

    public static int maximum(int[] a) {
        return a[0];
    }

    public static int extractMaximum(int[] a, int heapsize) {
        heapsize--;
        swap(a, 0, heapsize);
        heapify(a, heapsize, 0);
        return a[heapsize];
    }

    public static void increaseKey(int[] a, int heapsize, int i, int key) {
        if (a[i] > key) {
            throw new IllegalArgumentException("New value is smaller than previous one");
        }
        a[i] = key;
        int p = i >> 1;
        while (i > 0 && a[p] < a[i]) {
            swap(a, i, p);
            i = p;
            p = i >> 1;
        }
    }

    private static void heapify(int[] a, int heapsize, int i) {
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
            heapify(a, heapsize, largest);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int z = a[i];
        a[i] = a[j];
        a[j] = z;
    }

}
