package com.firefrydev.algorithms.structures;

import com.firefrydev.algorithms.sorting.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class PriorityQueueTester extends Assert {

    @Test
    public void test1() {
        int a[] = new int[10];
        int heapsize = 0;
        PriorityQueue.insert(a, heapsize++, 10);
        PriorityQueue.insert(a, heapsize++, 4);
        assertEquals(10, PriorityQueue.extractMaximum(a, heapsize--));
        PriorityQueue.insert(a, heapsize++, 6);
        assertEquals(6, PriorityQueue.maximum(a));
        PriorityQueue.insert(a, heapsize++, 1);
        PriorityQueue.insert(a, heapsize++, 4);
        PriorityQueue.insert(a, heapsize++, 3);
        assertEquals(6, PriorityQueue.extractMaximum(a, heapsize--));
        assertEquals(4, PriorityQueue.extractMaximum(a, heapsize--));
        assertEquals(4, PriorityQueue.extractMaximum(a, heapsize--));
        assertEquals(3, PriorityQueue.extractMaximum(a, heapsize--));
        assertEquals(1, PriorityQueue.extractMaximum(a, heapsize--));
    }

    @Test
    public void test2() {
        int a[] = new int[1000];
        int heapsize = 0;
        int b[] = new int[1000];
        Random random = new Random();

        for (int i = 0; i < b.length; i++) {
            int key = random.nextInt(100);
            PriorityQueue.insert(a, heapsize++, key);
            b[i] = key;
        }

        InsertionSort.sort(b);
        for (int i = b.length - 1; i >= 0; i--) {
            assertEquals(b[i], PriorityQueue.extractMaximum(a, heapsize--));
        }
    }

    //TODO add increaseKey() test

}
