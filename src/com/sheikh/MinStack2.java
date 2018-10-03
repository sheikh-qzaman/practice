package com.sheikh;

import java.util.LinkedList;

class MinStack2 {
    private int minElem;
    private LinkedList<Integer> list;

    public MinStack2() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        if (list.size() == 0) {
            list.addFirst(0);
            this.minElem = x;
        } else if (x >= minElem){
            list.addFirst(x - minElem);
        } else {
            list.addFirst(x - minElem);
            minElem = x;
        }
    }

    public void pop() {
        if (list.size() == 0) return;
        Integer top = list.peek();
        if (top < 0) {
            int elem = list.pop();
            minElem -= elem;
        } else list.pop();
    }

    public int top() {
        if (list.size() == 0) return Integer.MIN_VALUE;
        Integer top = list.peek();
        if (top <= 0) {
            return minElem;
        } else {
            return top + minElem;
        }
    }

    public int getMin() {
        return minElem;
    }

    public static void main(String[] args) {
        MinStack2 minStack2 = new MinStack2();
        minStack2.push(3);
        minStack2.push(5);
        minStack2.push(8);
        minStack2.push(2);
        minStack2.push(4);

        System.out.println(minStack2.minElem);
        System.out.println(minStack2.top());
        minStack2.pop();
        minStack2.pop();
        System.out.println(minStack2.minElem);
    }
}