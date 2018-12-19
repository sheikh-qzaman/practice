package com.sheikh;

import java.util.*;
import java.util.LinkedList;

public class TreeTest2 {

    public TreeTest2() {
        int[] tree;
        TreeNode root;

        tree = new int[] {3, 9, 20, -1, -1, 15, 7};
        //tree = new int[] {4,3,5,2,6,-1,7,-1,8};
        tree = new int[] {1, -1, 2, -1, -1, -1, 3};
        tree = new int[] {1, 2, 3, 4, 5, -1, -1};
        tree = new int[] {3, 0, 4, -1, 2, -1, -1, -1, -1, 1};
        //root = TreeUtil.createTree(tree, 0);
        //List<Integer> list = inorderTraversal(root);
        //List<Integer> list = preorderTraversal(root);
        //Utils.printList(list);
        //System.out.println(isValidBST(root));
        //TreeNode node = invertTree(root);
        TreeNode p = TreeUtil.createTree(new int[] {1, 2, 1}, 0);
        TreeNode q = TreeUtil.createTree(new int[] {1, 2, 1}, 0);
        //TreeNode q = TreeUtil.createTree(new int[] {1, 1, 2}, 0);
        //System.out.println(isSameTree(p, q));
        //System.out.println(height(root));
        //System.out.println(isBalanced(root));
        tree = new int[] {3, 0, 4, -1, 2, -1, -1, -1, -1, 1};
        tree = new int[] {1, 0, 2};
        root = TreeUtil.createTree(tree, 0);
        //root = trimBST(root, 1, 2);
        tree = new int[] {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        //tree = new int[] {1,2,-1,3};
        root = TreeUtil.createTree(tree, 0);
        //root = lowestCommonAncestor(root, 6, 2);
        System.out.println(root.val);
        int[] inorder = new int[] {4, 2, 5, 1, 6, 3, 7};
        int[] preorder = new int[] {1, 2, 4, 5, 3, 6, 7};
        //int[] preorder = new int[] {3,9,20,15,7};
        //int[] inorder = new int[] {9,3,15,20,7};
        //root = buildTree(preorder, inorder);
        //tree = new int[] {1, 2, 3, 4, 5, 6, 7};
        tree = new int[] {1, 2, -1, -1, 4};
        TreeLinkNode root1 = TreeUtil.createTreeLink(tree, 0);
        //connect(root1);
        root = TreeUtil.createTree(tree, 0);
        flatten(root);
    }

    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);

        if (root.left != null) {
            TreeNode tmp = root.right;

            root.right = root.left;
            root.left = null;
            while (root.right != null)
                root = root.right;
            root.right = tmp;
        }
    }

    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeLinkNode prev = null;
            for (int i = 0; i < size; i++) {
                TreeLinkNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                if (prev == null) prev = node;
                else {
                    prev.next = node;
                    prev = prev.next;
                }
            }
            prev.next = null;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bTHelper(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode bTHelper(int pre, int start, int end, int[] preorder, int[] inorder) {
        if (start > end || pre > inorder.length - 1) return null;
        TreeNode root = new TreeNode(preorder[pre]);
        int index = findNode(inorder, root.val);
        root.left = bTHelper(pre + 1, start, index - 1, preorder, inorder);
        root.right = bTHelper(pre + index - start + 1, index + 1, end, preorder, inorder);
        return root;
    }

    public int findNode(int[] inorder, int val) {
        for (int i = 0; i < inorder.length; i++)
            if (inorder[i] == val) return i;
        return -1;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root == null || root.val == p || root.val == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        root = findRoot(root, L, R);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            node.left = findRoot(node.left, L, R);
            if (node.left != null) queue.add(node.left);
            node.right = findRoot(node.right, L, R);
            if (node.right != null) queue.add(node.right);
        }

        return root;
    }

    public TreeNode findRoot(TreeNode root, int L, int R) {
        if (root == null) return null;
        else if (root.val >= L && root.val <= R)
            return root;
        else if (root.val < L)
            return findRoot(root.right, L, R);
        else
            return findRoot(root.left, L, R);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else {
            int l = root.left == null ? -1 : height(root.left);
            int r = root.right == null ? - 1 : height(root.right);
            if (Math.abs(l - r) > 1) return false;
            else return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null)
            return 0;
        else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            return 1 + Math.max(lHeight, rHeight);
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = tmp;

        return root;
    }

    public TreeNode merge(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) return t1 == null ? t2 : t1;

        t1.val += t2.val;
        t1.left = merge(t1.left, t1.left);
        t1.right = merge(t1.right, t2.right);

        return t1;
    }

    public boolean isValidBST (TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if(pre != null && cur.val <= pre.val)
                    return false;
                pre = cur;
                cur = cur.right;
            }
        }

        return true;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        return prerderIter(root);
    }

    public List<Integer> preorderRecur(TreeNode root, List<Integer> list) {
        return null;
    }

    public List<Integer> prerderIter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        List<Integer> list = new LinkedList<>();

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) list.add(cur.val);
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                cur = cur.right;
            }
        }

        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        //return inorderRecur(root, new LinkedList<>());
        return inorderIter(root);
    }

    public List<Integer> inorderRecur(TreeNode root, List<Integer> list) {
         if (root == null) return null;
         else {
             inorderRecur(root.left, list);
             list.add(root.val);
             inorderRecur(root.right, list);
         }

         return list;
    }

    public List<Integer> inorderIter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        List<Integer> list = new LinkedList<>();

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        new TreeTest2();
    }
}
