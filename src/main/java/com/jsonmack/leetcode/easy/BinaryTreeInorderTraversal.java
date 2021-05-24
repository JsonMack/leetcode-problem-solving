package com.jsonmack.leetcode.easy;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 *
 * @author Jason MacKeigan
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return Collections.emptyList();
        }
        if (root.left != null) {
            result.addAll(inorderTraversal(root.left));
        }
        result.add(root.val);

        if (root.right != null) {
            result.addAll(inorderTraversal(root.right));
        }
        return result;
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

        @Override
        public String toString() {
            return Integer.toString(val);
        }

    }



}
