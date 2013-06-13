package com.firefrydev.algorithms.orderstatistics;

public class FindMinMax {

	public static int[] find(int[] a) {
		if (a.length < 1) {
			return null;
		}
		int min;
		int max;
		int i;
		if (a.length % 2 == 1) {
			min = max = a[0];
			i = 1;
		} else {
			i = 2;
			if (a[0] > a[1]) {
				min = a[1];
				max = a[0];
			} else {
				min = a[0];
				max = a[1];
			}
		}
		while (i < a.length) {
			if (a[i] > a[i + 1]) {
				min = Math.min(min, a[i + 1]);
				max = Math.max(max, a[i]);
			} else {
				min = Math.min(min, a[i]);
				max = Math.max(max, a[i + 1]);
			}
			i += 2;
		}
		return new int[] {min, max};
	}

}
