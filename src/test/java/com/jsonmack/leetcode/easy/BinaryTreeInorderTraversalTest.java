package com.jsonmack.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jsonmack.leetcode.easy.BinaryTreeInorderTraversal.*;

/**
 * @author Jason MacKeigan
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void assertOrder() {
        TreeNode root = new TreeNode(1, null,
                new TreeNode(2, new TreeNode(3, null, null), null));

        Integer[] inorderTraversed = new BinaryTreeInorderTraversal()
                .inorderTraversal(root)
                .toArray(new Integer[0]);

        Assertions.assertEquals(3, inorderTraversed.length);
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 2 }, inorderTraversed);

    }
}
