package com.sheikh;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by squmruzz on 8/22/17.
 */
public class TreeTest {
    public TreeTest() {
        /*Validate Binary Search Tree*/
        //int[] bst = {2, 2, 5, -1, -1, 4, 6, -1, -1, -1, -1, 3};
        //int[] bst = {10, 5, 15, -1, -1, 8, 20};
        //List<Integer> list = inorderTraversal(root);
        //System.out.println(inorderBST(root, new Ref<Integer>(Integer.MIN_VALUE)));
        /**/

        /*Symmetric Tree
        int[] tree = {1,2,2,3,-1,-1,3};
        TreeNode2 root = createTree(tree, 0);
        System.out.println(symTree(root));
        */



        /*Max depth of binary tree
        //int[] tree = {3, 9, 20, -1, -1, 15, 7, -1, 17, -1, -1, 16};
        int[] tree = {3, 9, 20, -1, -1, 15, 7};
        //int[] tree = {3, 9, -1, 4, -1, -1, -1, 5};
        //int[] tree = {3, 9, -1, 4};
        TreeNode root = createTree(tree, 0);
        //new TreeGUI(root);
        System.out.println(maxDepth(root));
        System.out.println(maxDepth2(root));
        */

        /*Flatten Binary Tree
        int[] tree = {1,2,3,4,5};
        TreeNode2<Integer> root = createTree2(tree, 0);
        BTreePrinter.printNode(root);
        flatten(root);
        BTreePrinter.printNode(root);
        */

        /*Invert Binary Tree
        int[] tree = {1,2,3,4,5};
        TreeNode root = createTree(tree, 0);
        root = invertTree(root);
        */

        /*Merge Two Binary Trees
        int[] t1 = {1, 3, 2, 5};
        int[] t2 = {2, 1, 3, -1, 4, -1 , 7};
        TreeNode node = mergeTrees(createTree(t1, 0), createTree(t2, 0));
        */

        /*Same Tree*/
        /**/

        //int[] bst = {1, 5, 15, -1, -1, 6, 20};
        //int[] bst = {2, 1, 4, -1, -1, 3, 5};
        //int[] bst = {5, 1, 4, -1, -1, 3, 6};
        int[] bst = {};
        //TreeNode root = createTree(bst, 0);
        //System.out.println(isValidBST(root));
        //List<Integer> list = inorderTraversal(root);

        /*Level order traversing*/
        int[] tree = {3,9,20,-1,-1,15,7};
        //int[] tree = {1, 2, 3, 4, 5};
        //int[] tree = {};
        TreeNode root = createTree(tree, 0);
        //List<List<Integer>> lists = levelOrder(root);
        List<List<Integer>> lists = zigzagLevelOrder(root);
        /**/
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        //inorderT(root, list);
        list = inorderIter(root);
        Integer prev = null;
        for(Integer i : list) {
            if (prev == null)
                prev = i;
            else if (prev.intValue() >= i.intValue())
                return false;
            else prev = i;
        }

        return true;
    }

    public List<Integer> inorderT(TreeNode t, List<Integer> list) {
        if (t == null) return null;

        inorderT(t.left, list);
        list.add(t.val);
        inorderT(t.right, list);

        return list;
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) return t1 == null ? t2 : t1;

        t1.val += t2.val;

        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public TreeNode2 flatten(TreeNode2 root) {
        System.out.println("Entering Function...");
        System.out.println("Root: " + (root != null ? root.val : null));
        BTreePrinter.printNode(root);
        if (root == null) return root;
        TreeNode2 rtree = root.right;
        System.out.println("Right Tree...");
        BTreePrinter.printNode(rtree);
        if (root.left != null) {
            root.right = root.left;
            root.left = null;
            root = flatten(root.right);
        }
        if (rtree != null) {
            root.right = rtree;
            root = flatten(root.right);
        }
        return root;
    }


    public LinkedList<Integer> preorderTraversal(TreeNode root, LinkedList<Integer> list) {
        if (list == null) {
            list = new LinkedList<>();
        }
        if (root == null) return null;
        else {
            list.add(root.val);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
        }
        return null;
    }

    public void flatten2(TreeNode root) {
        root = flattenTree(root, null,null);
    }

    public TreeNode flattenTree(TreeNode root, TreeNode newRoot, TreeNode cur) {
        if (root == null) return null;
        if (newRoot == null) {
            newRoot = new TreeNode(root.val);
            cur = newRoot;
        }
        else {
            cur.right = new TreeNode(root.val);
            cur = cur.right;
        }
        flattenTree(root.left, newRoot, cur);
        flattenTree(root.right, newRoot, cur);
        return newRoot;
    }

    public int maxDepth2(TreeNode node) {
        if (node == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
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

    public int maxDepth(TreeNode node) {
        if (node == null) return 0;
        else return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> lists = null;
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        boolean fromStack1 = true;

        while (!stack2.isEmpty() || !stack1.isEmpty()) {
            TreeNode node = null;
            if (fromStack1) {
                node = stack1.pop();
                if (node.left != null) stack2.push(node.left);
                if (node.right != null) stack2.push(node.right);
            } else {
                node = stack2.pop();
                if (node.right != null) stack1.push(node.right);
                if (node.left != null) stack1.push(node.left);
            }

            list.add(node.val);
            if ((!fromStack1 && stack2.isEmpty()) || (fromStack1 && stack1.isEmpty())) {
                if (lists == null)
                    lists = new LinkedList<>();
                lists.add(list);
                list = new LinkedList<>();
                fromStack1 = stack2.isEmpty();
            }
        }

        return lists;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> lists = null;
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                if (q.size() != 0) q.add(null);
                if (lists == null)
                    lists = new LinkedList<>();
                lists.add(list);
                list = new LinkedList<>();
            } else {
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                list.add(node.val);
            }
        }

        return lists;
    }

    public boolean symTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int maxChild = (int) Math.pow(2, level);
            List<TreeNode> treeNodes = new ArrayList<>();
            for (int i = 0; i < maxChild; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
                treeNodes.add(node);
            }
            if (level++ == 0) continue;
            for (int l = 0, m = maxChild - 1; l <= m; l++, m--) {
                if ((treeNodes.get(l) == null && treeNodes.get(m) == null) || (treeNodes.get(l).val == treeNodes.get(m).val)) {
                    continue;
                }else {
                    return false;
                }
            }
        }

        return true;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        //return inorderRecur(root, null);
        return inorderIter(root);
    }

    public List<Integer> inorderIter(TreeNode root) {
        if (root == null) return new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode node = stack.pop();
                list.add(node.val);
                current = node.right;
            }
        }

        return list;
    }

    public List<Integer> inorderRecur(TreeNode root, List<Integer> list) {
        if (list == null) {
            list = new LinkedList<>();
        }
        if (root == null) return null;
        else {
            inorderRecur(root.left, list);
            list.add(root.val);
            inorderRecur(root.right, list);
        }
        return list;
    }

    public boolean inorderBST(TreeNode root, Ref<Integer> cur) {
        if (root == null) return true;
        else {
            inorderBST(root.left, cur);
            if (root.val < cur.value) {
                return false;
            } else {
                cur.value = root.val;
            }
            inorderBST(root.right, cur);
        }
        return true;
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        else if (root.left != null && root.left.val >= root.val) return false;
        else if (root.right != null && root.right.val <= root.val) return false;
        else return isValidBST2(root.left) && isValidBST2(root.right);
    }

    public TreeNode createTree(int[] tree, int i) {
        TreeNode node = null;
        if (i >= tree.length) return null;
        else if (tree[i] == -1) return null;
        else {
            node = new TreeNode(tree[i]);
            node.left = createTree(tree, 2 * i + 1);
            node.right = createTree(tree, 2 * i + 2);
        }
        return node;
    }

    public TreeNode2<Integer> createTree2(int[] tree, int i) {
        TreeNode2 node = null;
        if (i >= tree.length) return null;
        else if (tree[i] == -1) return null;
        else {
            node = new TreeNode2(tree[i]);
            node.left = createTree2(tree, 2 * i + 1);
            node.right = createTree2(tree, 2 * i + 2);
        }
        return node;
    }

    public class Ref<T> {
        public T value;
        public Ref(T value) {
            this.value = value;
        }

        public String toString() {
            return value + "";
        }
    }

    public static void main(String[] args) {
        new TreeTest();
    }
}
