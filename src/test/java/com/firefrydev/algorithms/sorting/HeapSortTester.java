package com.firefrydev.algorithms.sorting;

public class HeapSortTester extends SortingAlgorithmTester {
    @Override
    protected void sort(int[] a) {
        HeapSort.sort(a);
    }
}
