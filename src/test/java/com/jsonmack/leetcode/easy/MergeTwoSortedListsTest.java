package com.jsonmack.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static com.jsonmack.leetcode.easy.MergeTwoSortedLists.*;

/**
 * @author Jason MacKeigan
 */
public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(4, null)));

        ListNode b = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode result = new MergeTwoSortedLists().mergeTwoLists(a, b);

        assertExpectedOrder(result, 1, 1, 2, 3, 4, 4);
    }

    @Test
    public void mergeTwoVariableSizeLists() {
        ListNode a = new ListNode(5, null);

        ListNode b = new ListNode(1, new ListNode(2, new ListNode(4, null)));

        ListNode result = new MergeTwoSortedLists().mergeTwoLists(a, b);

        assertExpectedOrder(result, 1, 2, 4, 5);
    }

    @Test
    public void assertSingleEntryMerge() {
        ListNode a = new ListNode(2, null);

        ListNode b = new ListNode(1, null);

        ListNode result = new MergeTwoSortedLists().mergeTwoLists(a, b);

        assertExpectedOrder(result, 1, 2);
    }

    private void assertExpectedOrder(ListNode result, Integer... values) {
        Queue<Integer> expectedQueue = new ArrayDeque<>(Arrays.asList(values));

        do {
            Assertions.assertEquals(expectedQueue.poll(), result.val);
            result = result.next;
        } while (result != null);

        Assertions.assertTrue(expectedQueue.isEmpty());
    }

}
