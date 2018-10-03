package com.sheikh;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by squmruzz on 10/23/17.
 */
public class MinStack {
    private int minElem;
    private LinkedList<Integer> list;

    public MinStack() {
        list = new LinkedList<>();
        this.push(2);
        this.push(5);
        this.push(1);
        this.pop();
        this.pop();
        this.pop();
    }

    public void push(int x) {
        if (list.size() == 0) {
            list.addFirst(0);
            this.minElem = x;
        } else {
            list.addFirst(x - minElem);
            if (x < minElem) minElem = x;
        }

        System.out.println("Pushed: " + x);
        System.out.println("Stack: " + this.printStack());
        System.out.println("Top: " + this.top());
        System.out.println("Min: " + this.getMin());
    }

    public void pop() {
        if (list.size() == 0) return;
        Integer top = list.peek();
        if (top > 0) {
            list.remove();
        } else if (top == 0 ) {
            list.remove();
            if (list.size() == 0) minElem = 0;
        }
        if (top < 0) {
            int elem = list.remove();
            minElem = minElem - elem;
        }

        System.out.println("Popped: ");
        System.out.println("Stack: " + this.printStack());
        System.out.println("Top: " + this.top());
        System.out.println("Min: " + this.getMin());
    }

    public int top() {
        if (list.size() == 0) return Integer.MAX_VALUE;
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

    public String printStack() {
        LinkedList<Integer> tmp = list;
        StringBuilder sb = new StringBuilder();
        ListIterator<Integer> iter = list.listIterator();

        while (iter.hasNext()) {
            sb.append(" " + iter.next());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        new MinStack();
    }
}
