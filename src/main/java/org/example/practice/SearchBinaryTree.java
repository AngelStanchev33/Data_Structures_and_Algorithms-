package org.example.practice;

import org.example.implementTreeNode.TreeNode;

public class SearchBinaryTree {

    public static TreeNode solution(TreeNode root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.getVal()) {
            return solution(root.getLeft(), value);
        } else if (value > root.getVal()) {
            return solution(root.getRight(), value);
        } else {
            return root;
        }
    }

}
