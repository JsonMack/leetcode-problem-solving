package com.jsonmack.leetcode.easy;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jason MacKeigan
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        Set<Integer> depths = new HashSet<>();

        search(root, 1, depths);

        return depths.stream()
                .max(Integer::compare)
                .orElse(0);
    }

    private void search(TreeNode node, int depth, Set<Integer> depths) {
        TreeNode left = node.left;

        TreeNode right = node.right;

        if (left == null && right == null) {
            depths.add(depth);
            return;
        }
        if (left != null) {
            search(node.left, depth + 1, depths);
        }
        if (right != null) {
            search(node.right, depth + 1, depths);
        }
    }

    public static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }
    }

}
