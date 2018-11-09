package com.sheikh;

import java.util.List;

public class Utils {
	public static boolean isPalindrome(String s){
		char[] ca = s.toCharArray();
		for(int i=0, j=s.length()-1; i <= j; i++, j--){
			//System.out.println(ca[i] + " " + ca[j]);
			if(ca[i] != ca[j]){
				return false;
			}
		}
		return true;
	}
	// A utility function to get max of two integers
	public static int max (int ... items) {
		StringBuilder sb = new StringBuilder();
		int max = Integer.MIN_VALUE;
		for (int item : items) {
			sb.append(item + " ");
			max = item > max ? item : max;
		}
		//System.out.println("Max of " + sb.toString());
		return max;
	}

	public static int min(int ... items) {
		int min = Integer.MAX_VALUE;
		for(int item : items) {
			if(item < min) min = item;
		}
		return min;
	}
	public static void main(String[] args){
		isPalindrome("abccba");
	}

	public static String printArray(int[] n) {
		StringBuilder sb = new StringBuilder();
		for (int i : n) {
			sb.append(i + " ");
		}
		return sb.toString();
	}

	public static String printArray(int[][] matrix) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sb.append(matrix[i][j] + "\t");
			}
			sb.append("\n\n");
		}
		return sb.toString();
	}

	public static void printList(List<List<Integer>> lists) {
		StringBuilder ret = new StringBuilder();
		for (List<Integer> list : lists) {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i : list) {
				sb.append(i + ", ");
			}
			sb.append("]");
			ret.append(sb.toString() + "\n");
		}

		System.out.println(ret.toString());
	}

	public static int[][] genMatrix(int n) {
		int[][] matrix = new int[n][n];

		for (int i = 0, num = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
			    matrix[i][j] = num++;
			}
		}

		return matrix;
	}
}
