package com.jsonmack.leetcode.easy;

import com.jsonmack.leetcode.easy.MaximumDepthOfBinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jason MacKeigan
 */
public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void assertDepthGreaterThanTwo() {
        Assertions.assertEquals(3, new MaximumDepthOfBinaryTree()
                .maxDepth(createDepthGreaterThanTwo()));
    }

    @Test
    public void assertDepthTwo() {

    }

    @Test
    public void assertDepthOne() {

    }

    @Test
    public void assertDepthZero() {

    }

    private TreeNode createDepthGreaterThanTwo() {
        TreeNode three = new TreeNode(3);

        TreeNode nine = new TreeNode(9);

        TreeNode twenty = new TreeNode(20);

        TreeNode fifteen = new TreeNode(15);

        TreeNode seven = new TreeNode(7);

        three.setLeft(nine);
        three.setRight(twenty);

        twenty.setLeft(fifteen);
        twenty.setRight(seven);

        return three;
    }


}
