package com.firefrydev.algorithms.sorting;

public class RadixSortTester extends SortingAlgorithmTester {
    @Override
    protected void sort(int[] a) {
        RadixSort.sort(a);
    }
}
