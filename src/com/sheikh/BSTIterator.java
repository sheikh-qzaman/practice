package com.sheikh;

import java.util.Stack;
import com.sheikh.TreePractice.TreeNode;

public class BSTIterator {
    private Stack<TreePractice.TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        this.pushAll(root);
    }

    public boolean hasNext() {
        return stack.isEmpty() ? false : true;
    }

    public int next() {
        TreeNode node = stack.pop();
        this.pushAll(node.right);

        return node.val;
    }

    public void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
