package com.sheikh;

import java.util.*;

/**
 * Created by squmruzz on 8/31/17.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    public String toString() {
        return val + "";
    }

    public int getHeight(TreeNode node) {
        if (node == null) return 0;
        Queue<TreeNode> q = new java.util.LinkedList<>();
        q.add(node);
        int level = -1;

        while (!q.isEmpty()) {
            int elemNums = q.size();
            for (int i = 0; i < elemNums; i++) {
                if (q.peek().left != null) q.add(q.peek().left);
                if (q.peek().right != null) q.add(q.peek().right);
                q.poll();
            }
            level++;
        }

        return level;
    }
}
