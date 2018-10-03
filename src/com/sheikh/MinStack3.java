package com.sheikh;

import java.util.Stack;

public class MinStack3 {
    public Stack<StackItem> stack;
    private int curMinElem = Integer.MAX_VALUE;

    private class StackItem {
        private int prevMinElem;
        private int value;

        public StackItem(int value) {
            if (value < curMinElem) {
                int tmp = curMinElem;
                curMinElem = value;
                prevMinElem = tmp;
            } else prevMinElem = curMinElem;
            this.value = value;
        }
    }

    public MinStack3() {
        stack = new Stack<>();
    }

    public void push(int x) {
       stack.push(new StackItem(x));
    }

    public void pop() {
        this.curMinElem = stack.pop().prevMinElem;
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return this.curMinElem;
    }
}
