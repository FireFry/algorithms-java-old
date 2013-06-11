package com.firefrydev.algorithms.sorting;

public class RadixSort {

	public static void sort(int[] a) {
		sort(a, 10);
	}

	public static void sort(int[] a, int maxDigits) {
		int[] c = new int[10];
		int[] b = new int[a.length];
		int x = 1;
		for (int i = 0; i < maxDigits; i++) {
			for (int j = 0; j < c.length; j++) {
				c[j] = 0;
			}
			for (int j = 0; j < a.length; j++) {
				int digit = (a[j] / x) % 10;
				c[digit]++;
				b[j] = a[j];
			}
			for (int j = 1; j < c.length; j++) {
				c[j] += c[j - 1];
			}
			for (int j = b.length - 1; j >= 0; j--) {
				int digit = (b[j] / x) % 10;
				c[digit]--;
				a[c[digit]] = b[j];
			}
			x *= 10;
		}
	}
}
