package com.sheikh;

/**
 * Created by squmruzz on 7/24/17.
 */
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) {
        this.val = x;
    }

    public static ListNode getListNode(int[] items) {
        ListNode listNode = null;
        ListNode nextNode = null;

        for (int i : items) {
            if (listNode == null) nextNode = listNode = new ListNode(i);
            else {
                nextNode.next = new ListNode(i);
                nextNode = nextNode.next;
            }
        }

        return listNode;
    }

    public String toString() {
        return "" + this.val;
    }

    public static String toString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            if (node.next != null) sb.append(" -> ");
            node = node.next;
        }
        return sb.toString();
    }
}
