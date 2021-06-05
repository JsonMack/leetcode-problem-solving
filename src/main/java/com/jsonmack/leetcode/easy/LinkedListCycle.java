package com.jsonmack.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jason MacKeigan
 */
public class LinkedListCycle {

    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }
    }

    public boolean hasCycle(ListNode head) {
        return hasCycle(head, new HashSet<>());
    }

    public boolean hasCycle(ListNode head, HashSet<Integer> passed) {
        if (head == null) {
            return false;
        }
        ListNode next = head.next;

        if (next == null) {
            return false;
        }
        int hashCode = next.hashCode();

        if (passed.contains(hashCode)) {
            return true;
        }
        passed.add(hashCode);

        return hasCycle(next, passed);
    }

}
