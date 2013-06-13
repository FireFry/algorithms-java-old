package com.firefrydev.algorithms.orderstatistics;

import java.util.Random;

public class OrderStatisticsWithoutDuplicates {
	private static final Random random = new Random();

	public static int find(int[] a, int k) {
		return doFind(a, 0, a.length - 1, k - 1);
	}

	private static int doFind(int[] a, int p, int r, int k) {
		if (p == r) {
			if (k != 0) {
				throw new IllegalStateException("k == " + k);
			}
			return a[p];
		}
		int q = randPartition(a, p, r);
		int l = q - p;
		if (l == k) {
			return a[q];
		}
		if (l > k) {
			return doFind(a, p, q - 1, k);
		} else {
			return doFind(a, q + 1, r, k - l - 1);
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
