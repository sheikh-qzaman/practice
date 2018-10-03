package com.sheikh;

/**
 * Created by squmruzz on 7/10/17.
 */
public class Sort {
    private int[] arr;

    public Sort(int[] arr) {
        this.arr = arr;
    }

    public void insertionSort() {
        for(int i = 1; i < this.arr.length; i++) {
            int key = this.arr[i];
            int j = i - 1;
            while(j >= 0 && this.arr[j] > key) {
                this.arr[j+1] = this.arr[j];
                j--;
            }
            this.arr[j+1] = key;
        }
    }

    public void quickSort(int start, int end) {
        if(start < end) {
            int partition = this.qSortPartition(0, end);
            quickSort(start, partition - 1);
            quickSort(partition + 1, end);
        }
    }

    private int qSortPartition(int start, int end) {
        int pivot = this.arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++) {
            if(this.arr[j] <= pivot) {
                this.exchange(++i, j);
            }
        }
        this.exchange(++i, end);
        return i;
    }

    public void mergeSort(int start, int end) {
        if(start < end) {
            int middle = (start + end) / 2;
            mergeSort(start, middle);
            mergeSort(middle + 1, end);
            merge(start, middle, end);
        }
    }


    private void merge(int start, int middle, int end) {

    }

    private void exchange(int i, int j) {
        int tmp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = tmp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.arr.length; i++) {
            sb.append(this.arr[i] + " ");
        }
        return sb.toString();
    }
}
