package com.sheikh;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class TreePractice {
    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }

        public String toString() {
            return "" + this.val;
        }
    }

    public TreePractice() {
        TreeNode r1 = createTree(new int[] {1, 2, 6, 4, 5}, 0);
        TreeNode r2 = createTree(new int[] {}, 0);

        //System.out.println(isSameTree(r1, r2));
        //System.out.println(isSameTreeRecur(r1, r2));

        /*Balanced Binary Tree
        //TreeNode root = createTree(new int[] {1,-1,2,-1,-1,3}, 0);
        //TreeNode root = createTree(new int[] {5,6,-1,3}, 0);
        TreeNode root = createTree(new int[] {1,2,3,4,5,-1,6,7,-1,-1,-1,-1,8}, 0);
        System.out.println("Height: " + height(root));
        System.out.println(isBalanced(root));
        */

        /*Convert sorted array to BST
        int[] arr = {1,2,3,4,-1,-1,5};
        TreeNode root = createBST(arr, 0, arr.length - 1);
        */

        /*Symmetric Tree
        //int[] arr = {1,2,2,3,4,4,3};
        int[] arr = {1, 2, 3};
        //int[] arr = {1,2,3,3,-1,2,-1};
        TreeNode root = createTree(arr, 0);
        System.out.println(isSymmetric(root));
        //List<Integer> list = inorderIter(root);

        //inorder(root);
        */

        //System.out.println(height(r1.right));
        //System.out.println(diameterOfBinaryTree(r2));
        //System.out.println(hasPathSum(r2, 2));
        //System.out.println(DFS(r1, ""));
        //binaryTreePaths(r1).forEach(str -> System.out.println(str));
        //List<List<Integer>> lists = pathSum(r1, 7);
        //List<Integer> list = inorderTraversal(r1);
        //List<List<Integer>> list = permute(new int[] {1, 2, 3});
        //trieTest();
        //bstIteratorTest();
        /*Lowest Common Ancestor of a Binary Tree*/
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        root.left = n2;
        root.right = n3;
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n2.left = n4;
        n2.right = n5;
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n5.left = n6;
        n5.right = n7;
        TreeNode n8 = new TreeNode(8);

        System.out.println(searchNode(root, n7));
        System.out.println(lowestCommonAncestor(root, n4, n7).val);
        /**/
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return p == root ? p : q;
        else {
            boolean pL = searchNode(root.left, p);
            boolean qL = searchNode(root.left, q);
            if (pL  && qL)
                return lowestCommonAncestor(root.left, p, q);
        else if (!pL && !qL)
                return lowestCommonAncestor(root.right, p, q);
            else return root;
        }
    }

    public boolean searchNode(TreeNode root, TreeNode node) {
        if (root == null) return false;
        else if (root.val == node.val) return true;
        else {
            return searchNode(root.left, node) || searchNode(root.right, node);
        }
    }

    public void bstIteratorTest() {
        //int[] bst = new int[] {1, -1, 2};
        int[] bst = new int[] {4, 2, 5, 1, 3};
        TreeNode root = createTree(bst, 0);

        BSTIterator iter = new BSTIterator(root);

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void trieTest() {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("help");
        trie.insert("helper");
        trie.insert("world");

        System.out.println(trie.search("hello"));
        System.out.println(trie.search("help"));
        System.out.println(trie.search("hell"));
        System.out.println(trie.startsWith("hells"));
    }

    public List<List<Integer>> permute(int[] nums) {
        return permuteHelper(new ArrayList<>(), new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()), -1);
    }

    public List<List<Integer>> permuteHelper(List<List<Integer>> res, List<Integer> list, List<Integer> inp, int l) {
        if (l != -1) inp.remove(l);
        if (inp.size() == 0) {
            res.add(list);
            return res;
        }
        for (int i = 0; i < inp.size(); i++) {
            list = new ArrayList<>();
            list.add(inp.get(i));
            permuteHelper(res, list, inp, i);
        }

        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new LinkedList<>();
        return inoderHelper(root, new LinkedList<>());
    }

    public List<Integer> inoderHelper(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        else if (root.left == null && root.right == null) list.add(root.val);
        else {
            inoderHelper(root.left, list);
            list.add(root.val);
            inoderHelper(root.right, list);
        }

        return list;
    }

    public List<List<Integer>> pathSum3(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        pathSumHelper3(root, sum, new ArrayList<>(), lists);
        return lists;
    }

    public void pathSumHelper3(TreeNode root, int sum, List<Integer> list, List<List<Integer>> lists) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) lists.add(new ArrayList<>(list));
            return;
        } else {
            if (root.left != null) {
                pathSumHelper3(root.left, sum - root.val, list, lists);
                list.remove(list.size() - 1);
            }
            if (root.right != null) {
                pathSumHelper3(root.right, sum - root.val, list, lists);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        pathSumHelper(root, sum, new ArrayList<>(), lists);
        return lists;
    }

    public void pathSumHelper(TreeNode root, int sum, List<Integer> list, List<List<Integer>> lists) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) lists.add(new ArrayList<>(list));
            return;
        } else {
            if (root.left != null) {
                pathSumHelper(root.left, sum - root.val, list, lists);
                list.remove(list.size() - 1);
            }
            if (root.right != null) {
                pathSumHelper(root.right, sum - root.val, list, lists);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        return BTPHelper(root, "", new LinkedList<>());
    }

    public List<String> BTPHelper(TreeNode root, String str, List<String> list) {
        if (root == null) return new LinkedList<>();
        else if (root.left == null && root.right == null) {
            list.add(str.concat(root.val + ""));
        } else {
            BTPHelper(root.left, str.concat(root.val + "->"), list);
            BTPHelper(root.right, str.concat(root.val + "->"), list);
        }

        return list;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return pathSumHelper(root, sum, 0);
    }

    public boolean pathSumHelper(TreeNode root, int sum, int curSum) {
        if (root == null) return false;
        else if (root.left == null && root.right == null ) {
            if (root.val + curSum == sum) return true;
            else return false;
        } else return pathSumHelper(root.left, sum, root.val + curSum) || pathSumHelper(root.right, sum, root.val + curSum);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxD = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int diameter = 0;
            if (node.left != null) {
                queue.add(node.left);
                diameter += 1 + this.height(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
                diameter += 1 + this.height(node.right);
            }

            maxD = diameter > maxD ? diameter : maxD;
        }
        return maxD;
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null ? false : isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode n1, TreeNode n2) {
        if ((n1 == null || n2 == null)) {
            if (n1 == n2) return true;
            else return false;
        } else if (n1.val != n2.val) return false;

        return isSymmetricHelper(n1.left, n2.right) && isSymmetricHelper(n1.right, n2.left);
    }

    public void inorderRecur(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) inorderRecur(node.left, list);
        else list.add(-1);
        list.add(node.val);
        if (node.right != null) inorderRecur(node.right, list);
        else list.add(-1);
    }

    public List<Integer> inorderIter(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if (n.left != null) stack.push(n.left);
            else list.add(n.val);
            if (n.right != null) stack.push(n.right);
        }

        return list;
    }

    public int height(TreeNode node) {
        if (node == null) return -1;
        else return 1 + Math.max(height(node.left), height(node.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);

        return  (Math.abs((lh - rh)) <= 1 && isBalanced(root.left) && isBalanced(root.left));
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) return root;
        else if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }

    public boolean isSameTreeRecur(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else return (p.val == q.val) && isSameTreeRecur(p.left, q.left) && isSameTreeRecur(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) return true;

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();

            if (n1 == null || n2 == null) {
                if (n1 != n2) return false;
                continue;
            }

            if (n1.val != n2.val) return false;
            else {
                q1.add(n1.left);
                q1.add(n1.right);

                q2.add(n2.left);
                q2.add(n2.right);
            }
        }

        return true;
    }

    public TreeNode createBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        else if (start == end) {
            return new TreeNode(arr[start]);
        }
        else {
            int mid = start + ((end - start) / 2);
            TreeNode root = new TreeNode(arr[mid]);
            root.left = createBST(arr, start, mid - 1);
            root.right = createBST(arr, mid + 1, end);
            return root;
        }
    }

    public TreeNode createTree(int[] arr, int indx) {
        if (indx >= arr.length || arr[indx] == -1) return null;
        TreeNode node = new TreeNode(arr[indx]);
        node.left = createTree(arr, indx * 2 + 1);
        node.right = createTree(arr, indx * 2 + 2);
        return node;
    }

    public static void main(String[] args) {
        new TreePractice();
    }
}
