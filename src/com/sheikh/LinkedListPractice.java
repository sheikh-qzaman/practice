package com.sheikh;

import java.util.*;

/**
 * Created by squmruzz on 7/13/17.
 */
public class LinkedListPractice {
    ListNode head;

    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    }

    public LinkedListPractice() {
        String seq;
        String s1;
        String s2;
        ListNode l1;
        ListNode l2;
        ListNode h1;
        ListNode h2;

        /*l1 = h1 = new ListNode(4);
        l1 = l1.next = new ListNode(7);
        l1 = l1.next = new ListNode(9);
        //l1 = l1.next = new ListNode(5);
        //l1 = l1.next = new ListNode(6);

        l2 = h2 = new ListNode(2);
        l2 = l2.next = new ListNode(5);
        */

        /* Add Two numbers
        l1 = null, pl1 = null;
        pl1 = l1 = new ListNode(2);
        l1 = l1.next = new ListNode(4);
        l1.next = new ListNode(3);

        l2 = null, pl2 = null;
        pl2 = l2 = new ListNode(5);
        l2 = l2.next = new ListNode(6);
        l2.next = new ListNode(4);

        ListNode r = this.addTwoNumbers(pl1, pl2);
        */

        /*Remove N th item from back*/
        //this.printLinkedList(this.removeNthNode(ListNode.getListNode(new int[]{1, 2}), 2));
        /**/

        /*Check valid parentheses
        seq = "([)]";
        System.out.println(seq + " is" + (this.validParentheses(seq) ? "" : " not") +
                " valid parentheses");
        */

        /*Merge two sorted linked lists
        printLinkedList(this.mergeTwoLists(h1, h2));
        */

        /*Merge K sorted linked lists
        ListNode[] listNodes = new ListNode[2];
        listNodes[0] = h1;
        listNodes[1] = h2;
        ListNode head = new ListNode(-1);
        //printLinkedList(this.mergeKSortedListsIter(listNodes));
        //printLinkedList(this.mergeKSortedListsRecursive(listNodes, head));
        //printLinkedList(this.mergeKsortedList(listNodes));
        printLinkedList(this.mergeKSortedListPQ(listNodes));
        */

        /*Reverse Linked List*
        System.out.println(ListNode.toString(reverseList(ListNode.getListNode(new int[]{2, 5, 3, 7}))));
        **/

        /*Majority Element
        System.out.println(majorityElement(new int[]{2, 3, 4, 2}));
        */

        /*Linked List Cycle*/
        l1 = new ListNode(1);
        l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        //l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        l5.next = l2;

        //System.out.println(this.hasCycle(l1));
        System.out.println(this.detectCycle(l1));
        /**/

        /*Palindrome Linked List
        ListNode node = ListNode.getListNode(new int[] {1, 2, 5, 2, 1});
        head = new ListNode(-1);
        head.next = node;
        System.out.println(isPalindrome2(node));
        */

        /*Intersection of Two Linked Lists
        ListNode nodeA = new ListNode(1);
        System.out.println(getIntersectionNode(nodeA, nodeA));
        */

        /*Merge Sorted List
        ListNode p = ListNode.getListNode(new int[] {1, 2, 4});
        ListNode q = ListNode.getListNode(new int[] {1, 3, 5});
        ListNode listNode = mergeSortedList(p, q);
        */

        /*Delete Node in a Linked List*/
        //ListNode head = ListNode.getListNode(new int[] {1, 2});

        //deleteNode(head);
        //this.printLinkedList(head);
        /**/

        //this.printLinkedList(deleteDuplicates(ListNode.getListNode(new int[] {1,1,2,3,3})));
        //this.printLinkedList(removeElements(ListNode.getListNode(new int[] {}), 3));
        //this.printLinkedList(sortList(ListNode.getListNode(new int[] {2, 1, 3})));
        //this.printLinkedList(oddEvenList(ListNode.getListNode(new int[] {1, 2,3 ,4})));

        /*Copy List with Random Pointer
        RandomListNode head = new RandomListNode(1);
        RandomListNode rand = copyRandomList(head);
        RandomListNode h2 = new RandomListNode(2);
        head.next = h2;
        RandomListNode h3 = new RandomListNode(3);
        RandomListNode h4 = new RandomListNode(4);
        h2.next = h3;
        h3.next = h4;
        h4.next = null;
        head.random = h4;
        h2.random = head;
        h3.random = h4;
        //RandomListNode rand = copyRandomList(head);

        */
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fp, sp;
        fp = sp = head;

        do {
            sp = sp.next;
            if (fp.next == null) return null;
            else fp = fp.next.next;
        } while (fp != sp && fp != null);

        if (fp == null) return null;

        while (head != sp) {
            head = head.next;
            sp = sp.next;
        }

        return head;
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        Hashtable<RandomListNode, RandomListNode> table = new Hashtable<>();
        RandomListNode oldCur = head, newCur = null, newHead = null;

        // copy the linked list
        while (oldCur != null) {
            // copy each node and put it in hashtable
            RandomListNode tmp = new RandomListNode(oldCur.label);
            table.put(tmp, oldCur);

            // pointer adjustment
            if (newHead == null) newHead = newCur = tmp;
            else {
                newCur.next = tmp;
                newCur = newCur.next;
            }
            oldCur = oldCur.next;
        }

        // reassign random pointers
        newCur = newHead;
        while (newCur != null) {
            newCur.random = table.get(newCur).random;
            newCur = newCur.next;
        }

        return newHead;
    }

    public RandomListNode copyRandomList2(RandomListNode head) {
        if (head == null) return head;
        RandomListNode newHead = null, curNode = null, node;
        Hashtable<RandomListNode, RandomListNode> nodeMap = new Hashtable<>();

        while (head != null) {
            // check if the current node exists in the hashtable
            if (nodeMap.containsKey(head)) {
                node = nodeMap.get(head);
            }
            // if doesn't exists, create a new node
            else {
                node = new RandomListNode(head.label);
                nodeMap.put(head, node);
            }

            // set next pointer
            if (node.next == null) copyPointers(nodeMap, node, head.next, true);
            // set random pointer
            if (node.random == null) copyPointers(nodeMap, node, head.random, false);

            if (newHead == null) {
                newHead = curNode = node;
            }

            curNode.next = node;
            curNode = node;

            head = head.next;
        }

        return newHead;
    }

    // point to next or random pointer, if not exists in the hashtable, add first
    //
    public void copyPointers(Hashtable<RandomListNode, RandomListNode> nodeMap, RandomListNode node, RandomListNode headNext, boolean next) {
        if (headNext == null) {
            if (next) node.next = null;
            else node.random = null;
        }
        else if (!nodeMap.containsKey(headNext)) {
            RandomListNode tmpNext = new RandomListNode(headNext.label);
            nodeMap.put(headNext, tmpNext);
            if (next)node.next = tmpNext;
            else node.random = tmpNext;
        } else {
            if (next) node.next = nodeMap.get(headNext);
            else node.random = nodeMap.get(headNext);
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode odd = head;
        ListNode evenHead = head.next, even = head.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = this.getMid(head);
        return mergeTwoLists(sortList(head), sortList(mid));
    }

    public ListNode getMid(ListNode head) {
        ListNode s = head, f = head;

        if (head.next == null) return head;
        else if (head.next.next != null) {
            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }
        }

        ListNode ret = s.next;
        s.next = null;
        return ret;
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if (head == null || head.next == null) return head;

        ListNode prev = head, cur = head.next;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }

        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode cur = head, run = head.next;

        while (run != null) {
            while (run != null && cur.val == run.val) {
                run = run.next;
            }

            cur.next = run;
            cur = run;
            run = run == null ? null : run.next;
        }

        return head;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public void deleteNode2(ListNode node) {
        while (node != null) {
            node.val = node.next.val;
            if (node.next.next == null) node = node.next = null;
            else node = node.next;
        }
    }

    public ListNode mergeSortedList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val < l2.val) {
            l1.next = mergeSortedList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeSortedList(l2.next, l1);
            return l2;
        }
    }

    public ListNode mergeKSortedLists(ListNode[] lists) {
        ListNode head = null;
        for (ListNode listNode : lists) {
            head = mergeSortedList(head, listNode);
        }

        return head;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0, countB = 0;
        ListNode tmpA = headA, tmpB = headB;

        while (tmpA != null) {
            countA++;
            tmpA = tmpA.next;
        }

        while (tmpB != null) {
            countB++;
            tmpB = tmpB.next;
        }

        int diff = Math.abs(countA - countB);

        if (countA > countB)
            while (diff-- != 0) headA = headA.next;
        else if (countB > countA)
            while (diff-- != 0) headB = headB.next;

        while (headA != null || headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public boolean isPalindrome(ListNode head) {
        //return detectPalindrome(head, head);
        return false;
    }

    public boolean isPalindrome2(ListNode node) {
        if (node == null) return true;

        return isPalindrome2(node.next) && ((head = head.next) != null) && (head.val == node.val);
    }

    public ListNode detectPalindrome(ListNode head, ListNode cur) {
        if (cur.next == null) return cur;
        else detectPalindrome(head, cur.next);

        if (head.val != cur.val) return null;
        else head = head.next;

        return null;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode runner = head.next;

        while (head != null && runner != null) {
            if (head == runner) return true;
            head = head.next;
            if (runner.next != null) runner = runner.next.next;
            else return false;
        }
        return false;
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int num = 0;
        for (int i : nums) {
            if (hashMap.get(i) == null) hashMap.put(i, 1);
            else {
                int count = hashMap.get(i);
                if (count + 1 > nums.length / 2) {
                    num = i;
                    break;
                }
                hashMap.put(i, count + 1);
            }
        }
        return num;
    }

    public ListNode reverseList(ListNode head) {
        //return reverseListRecur(head);
        //return reverseListIter(head);
        return reverseListIter2(head);
    }

    public ListNode reverseListIter(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null, tmp = null;
        while ((tmp = head.next) != null) {
            head.next = prev;
            prev = head;
            head = tmp;
        }
        head.next = prev;
        return head;
    }

    public ListNode reverseListIter2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null, cur = head, next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;

           prev = cur;
           cur = next;
        }

        return prev;
    }

    public ListNode reverseListRecur(ListNode head) {
        return null;
    }

    public ListNode mergeKSortedListsIter(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode curNode = head;


        int minIndex = -1;

        int count = lists.length;
        while (count > 0) {
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i] == null) continue;
                if(lists[i].val < minValue) {
                    minValue = lists[i].val;
                    minIndex = i;
                }
            }

            curNode.next = lists[minIndex];
            curNode = curNode.next;

            if(lists[minIndex].next == null) {
                lists[minIndex] = null;
                count --;
            }else {
                lists[minIndex] = lists[minIndex].next;
            }

        }

        return head.next;
    }

    public ListNode getMinNode(ListNode[] lists) {
        if (lists[0] == null) return null;
        int minVal = Integer.MAX_VALUE;
        ListNode minNode = null;
        int minIndex = -1;
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] == null) continue;
            if (lists[i].val < minVal) {
                minNode = lists[i];
                minIndex = i;
            }
        }

        lists[minIndex] = lists[minIndex].next;
        minNode.next = null;
        return minNode;
    }

    public ListNode mergeKSortedListsRecursive(ListNode[] lists, ListNode head) {

        ListNode curNode = head;
        curNode.next = this.getMinNode(lists);

        if (curNode.next != null) {
            mergeKSortedListsRecursive(lists, curNode.next);
        }

        return head.next;
    }

    public ListNode mergeKsortedList(ListNode[] lists) {
        ListNode head = null;
        for (ListNode node : lists) {
            head = mergeTwoLists(head, node);
        }
        return head;
    }

    public ListNode mergeKSortedListPQ(ListNode[] lists) {
        PriorityQueue<ListNode> pQueue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });

        for (ListNode node : lists) {
            if (node != null) {
                pQueue.add(node);
            }
        }

        ListNode head = new ListNode(-1);
        ListNode cursor = head;

        while (! pQueue.isEmpty()) {
            cursor.next = pQueue.poll();
            cursor = cursor.next;

            if(cursor.next != null) {
                pQueue.add(cursor.next);
            }
        }

        return head.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                switch (stack.pop().charValue()){
                    case '(':
                        if (c != ')') return false;
                        break;
                    case '{':
                        if (c != '}') return false;
                        break;
                    case '[':
                        if (c != ']') return false;
                        break;
                }
            }
        }

        return stack.isEmpty();
    }

    public ListNode removeNthNode2(ListNode head, int n) {
        ListNode p1 = null, p2 = head;

        int count = 0;
        while (count < n) {
            p2 = p2.next;
            count++;
        }

        while (p2 != null) {
            if(p1 == null) p1 = head;
            else p1 = p1.next;
            p2 = p2.next;
        }

        if (p1 != null) p1.next = p1.next.next;
        else head = null;
        return head;
    }

    /**create a dummy head, which points to actual head
    * both sp and fp starts from dummy head.
    * increase fp n times, so distance between sp and fp
    * is n. Now increment both sp and fp until fp.next != null
    * sp.next will be the element to be removed.
    * will work on removing head.**/
    public ListNode removeNthNode(ListNode head, int n) {
        if (head == null) return null;
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode sp = h, fp = h;

        while (n-- != 0) fp = fp.next;

        while (fp.next != null) {
            sp = sp.next;
            fp = fp.next;
        }

        ListNode tmp = sp.next.next;
        sp.next = tmp;
        return h.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, result = null;
        head = result = new ListNode(0);
        //ListNode  = result;
        int carry = 0;
        int sum = 0;
        while(l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            result.next = new ListNode(sum % 10);
            //result = result.next;
            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;
        }
        return head;
    }

    public void printLinkedList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if(head.next != null) {
                sb.append("->");
            }
            head = head.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        new LinkedListPractice();
    }
}
