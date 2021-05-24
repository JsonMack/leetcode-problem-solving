package com.jsonmack.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason MacKeigan
 */
@SuppressWarnings("DuplicatedCode")
public class MergeTwoSortedLists {

    public static class ListNode {

        public int val;

        public ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return mergeTwoLists(l1, l2, null, null);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2, ListNode head, ListNode current) {
        if (l1 == null && l2 == null) {
            return head;
        }
        ListNode from = l1 == null ? l2
                : l2 == null ? l1
                : l1.val < l2.val ? l1 : l2;

        ListNode unchanged = from == l1 ? l2 : l1;

        ListNode remainder = from.next;

        from.next = null;

        if (current == null) {
            current = from;
            head = from;
        } else {
            current.next = from;
            current = from;
        }
        return mergeTwoLists(remainder, unchanged, head, current);
    }

}
