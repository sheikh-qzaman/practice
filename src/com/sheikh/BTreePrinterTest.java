package com.sheikh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTreePrinterTest {

    private static TreeNode2<Integer> test1() {
        TreeNode2<Integer> root = new TreeNode2<Integer>(2);
        TreeNode2<Integer> n11 = new TreeNode2<Integer>(7);
        TreeNode2<Integer> n12 = new TreeNode2<Integer>(5);
        TreeNode2<Integer> n21 = new TreeNode2<Integer>(2);
        TreeNode2<Integer> n22 = new TreeNode2<Integer>(6);
        TreeNode2<Integer> n23 = new TreeNode2<Integer>(3);
        TreeNode2<Integer> n24 = new TreeNode2<Integer>(6);
        TreeNode2<Integer> n31 = new TreeNode2<Integer>(5);
        TreeNode2<Integer> n32 = new TreeNode2<Integer>(8);
        TreeNode2<Integer> n33 = new TreeNode2<Integer>(4);
        TreeNode2<Integer> n34 = new TreeNode2<Integer>(5);
        TreeNode2<Integer> n35 = new TreeNode2<Integer>(8);
        TreeNode2<Integer> n36 = new TreeNode2<Integer>(4);
        TreeNode2<Integer> n37 = new TreeNode2<Integer>(5);
        TreeNode2<Integer> n38 = new TreeNode2<Integer>(8);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;
        n12.left = n23;
        n12.right = n24;

        n21.left = n31;
        n21.right = n32;
        n22.left = n33;
        n22.right = n34;
        n23.left = n35;
        n23.right = n36;
        n24.left = n37;
        n24.right = n38;

        return root;
    }

    private static TreeNode2<Integer> test2() {
        TreeNode2<Integer> root = new TreeNode2<Integer>(2);
        TreeNode2<Integer> n11 = new TreeNode2<Integer>(7);
        TreeNode2<Integer> n12 = new TreeNode2<Integer>(5);
        TreeNode2<Integer> n21 = new TreeNode2<Integer>(2);
        TreeNode2<Integer> n22 = new TreeNode2<Integer>(6);
        TreeNode2<Integer> n23 = new TreeNode2<Integer>(9);
        TreeNode2<Integer> n31 = new TreeNode2<Integer>(5);
        TreeNode2<Integer> n32 = new TreeNode2<Integer>(8);
        TreeNode2<Integer> n33 = new TreeNode2<Integer>(4);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;

        n12.right = n23;
        n22.left = n31;
        n22.right = n32;

        n23.left = n33;

        return root;
    }

    public static void main(String[] args) {

        BTreePrinter.printNode(test1());
        BTreePrinter.printNode(test2());

    }
}


class BTreePrinter {

    public static <T extends Comparable<?>> void printNode(TreeNode2<T> root) {
        int maxLevel = BTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<TreeNode2<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<TreeNode2<T>> newNodes = new ArrayList<TreeNode2<T>>();
        for (TreeNode2<T> node : nodes) {
            if (node != null) {
                System.out.print(node.val);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T extends Comparable<?>> int maxLevel(TreeNode2<T> node) {
        if (node == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}