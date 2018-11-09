package com.sheikh;

import java.util.EmptyStackException;

public class MyQueue<T> {
	private static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public T dequeue() {
		if(first == null) throw new EmptyStackException();
		T item = first.data;
		first = first.next;
		return item;
	}
	
	public void queue(T item) {
		QueueNode<T> node = new QueueNode<T>(item);
		if(last != null) last.next = node;
		last = node;
		if(first == null) first = node;
	}
	
	public T peek() {
		if(first == null) throw new EmptyStackException();
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		QueueNode<T> cursor = first;
		while(cursor != null) {
			sb.append(cursor.data + "\n");
			cursor = cursor.next;
		}
		return sb.toString();
	}
}
