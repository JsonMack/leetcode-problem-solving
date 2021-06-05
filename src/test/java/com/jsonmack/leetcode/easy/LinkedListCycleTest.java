package com.jsonmack.leetcode.easy;

import com.jsonmack.leetcode.easy.LinkedListCycle.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



/**
 * @author Jason MacKeigan
 */
public class LinkedListCycleTest {

    @Test
    public void assertCycleExists() {
        ListNode example1 = new ListNode(3);

        ListNode example2 = new ListNode(2);

        ListNode example3 = new ListNode(0);

        ListNode example4 = new ListNode(4);

        example1.next = example2;
        example2.next = example3;
        example3.next = example4;
        example4.next = example2;

        Assertions.assertTrue(new LinkedListCycle().hasCycle(example1));
    }

    @Test
    public void assertCycleDoesntExist() {
        ListNode example1 = new ListNode(1);

        ListNode example2 = new ListNode(2);

        example1.next = example2;
        example2.next = example1;

        Assertions.assertTrue(new LinkedListCycle().hasCycle(example1));
    }

    @Test
    public void assertFalseIfEmpty() {
        ListNode example1 = new ListNode(1);

        Assertions.assertFalse(new LinkedListCycle().hasCycle(example1));
    }

}
