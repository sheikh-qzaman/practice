package com.sheikh;

import java.util.ArrayList;

/**
 * Created by squmruzz on 7/8/17.
 */
public class BinaryHeap {
    public enum HeapType {
        MIN_HEAP,
        MAX_HEAP
    }
    private int[] arr;
    private HeapType heapType;
    private int heapSize;

    public BinaryHeap(int[] arr, HeapType type) {
        this.arr = arr;
        this.heapSize = arr.length;
        this.heapType = type;

        /*
        int[] array = {24, 2, 45, 12, 34, 8, 5, 18, 9, 11};
        buildMinHeap(array);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        System.out.println(sb.toString());
        System.out.println(extractMin(array) + "");
        sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        System.out.println(sb.toString());
        */
    }
    public int getLeft(int p) {
        return (p * 2) + 1;
    }
    public int getRight(int p) {
        return (p * 2) + 2;
    }
    public int getParent(int c) {
        return (c - 1) / 2;
    }
    public void minHeapify(int i) {
        int left = this.getLeft(i);
        int right = this.getRight(i);
        int[] array = this.arr;

        int smallest = i;
        if(left < this.heapSize && array[i] > array[left]) {
            smallest = left;
        }

        if(right < this.heapSize && array[smallest] > array[right]) {
            smallest = right;
        }

        if(smallest != i) {
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
            minHeapify(smallest);
        }
    }

    public int extractMin() {
        int min = arr[0];
        arr[0] = arr[this.heapSize - 1];
        this.heapSize--;
        this.minHeapify(0);
        return min;
    }

    public void sort() {
        for(int i = this.arr.length - 1; i > 0; i--) {
            int tmp = this.arr[i];
            this.arr[i] = this.arr[0];
            this.arr[0] = tmp;
            this.heapSize--;
            this.minHeapify(0);
        }
    }
    public void buildHeap() {
        for(int i = (this.arr.length / 2) - 1; i >= 0; i--) {
            if(this.heapType == HeapType.MAX_HEAP) {

            }else {
                minHeapify(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.arr.length; i++) {
            sb.append(this.arr[i] + " ");
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        int[] array = {24, 2, 45, 12, 34, 8, 5, 18, 9, 11};
        BinaryHeap bHeap = new BinaryHeap(array, HeapType.MIN_HEAP);
        bHeap.buildHeap();
        System.out.println(bHeap.toString());
        System.out.println(bHeap.extractMin());
        bHeap.sort();
        System.out.println(bHeap.toString());
    }
}
