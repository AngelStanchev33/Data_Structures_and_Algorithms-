package org.example.practice.BinaryTrees;

import org.example.implementTreeNode.TreeNode;

public class InsertIntoBinarySearchTree {

    public static TreeNode solution(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.getVal()) {
            root.setLeft(solution(root.getLeft(), val));
        } else if (val > root.getVal()) {
            root.setRight(solution(root.getRight(), val));
        }

        return root;
    }
}

