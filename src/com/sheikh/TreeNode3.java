package com.sheikh;

import java.util.*;
import java.util.LinkedList;

public class TreeNode3{
    public List<TreeNode3> children = null;
    public int val;
    public TreeNode3(int val) {
        this.val = val;
        children = new LinkedList<>();
    }

    public void addChild(TreeNode3 child) {
        this.children.add(child);
    }

    public List<TreeNode3> getChildren() {
        return this.children;
    }

    public String toString() {
        return "" + this.val;
    }
}