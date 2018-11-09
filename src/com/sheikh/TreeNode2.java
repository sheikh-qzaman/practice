package com.sheikh;

public class TreeNode2<T extends Comparable<?>> {
    public T val;
    public TreeNode2<T> left, right;

    public TreeNode2(T val) {
        this.val = val;
    }
}