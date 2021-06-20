package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        swap(root);

        return root;
    }

    public void swap(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temporary = node.left;

        node.left = node.right;
        node.right = temporary;

        swap(node.left);
        swap(node.right);
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
    }

}
