package com.sheikh;

public class StackQueueTest {
	public StackQueueTest() {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.toString());
	}
	public static void main(String[] args) {
		new StackQueueTest();
	}
}
