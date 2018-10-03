package com.sheikh;

import java.util.Stack;

public class MinStack4 extends Stack<Integer> {
    private int minElem;

    public void push(int x) {
        super.push(x);


    }

    public int getMin() {
        return this.minElem;
    }
}
