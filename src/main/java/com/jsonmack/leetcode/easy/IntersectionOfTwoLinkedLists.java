package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 *
 * gideon
 * corbin
 */
public class IntersectionOfTwoLinkedLists {

    public static class ListNode {

        private int val;

        private ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;

        ListNode currentB = headB;

        do {
            do {
                if (currentA == currentB) {
                    return currentA;
                }
            } while ((currentB = currentB.next) != null);

            currentB = headB;
        } while ((currentA = currentA.next) != null);

        return null;
    }

}
