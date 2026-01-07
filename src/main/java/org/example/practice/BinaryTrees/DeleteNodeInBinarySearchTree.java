package org.example.practice.BinaryTrees;

import org.example.implementTreeNode.TreeNode;

public class DeleteNodeInBinarySearchTree {
    public static TreeNode solution(TreeNode root, int key) {
        if (key < root.getVal()) {
            root.setLeft(solution(root.getLeft(), key));
        } else if (key > root.getVal()) {
            root.setRight(solution(root.getRight(), key));
        } else {
            if (root.getLeft() == null && root.getRight() == null) {
                root = null;
                return root;
            } else if (root.getLeft() != null && root.getRight() == null) {
                return root.getLeft();
            } else if (root.getRight() != null && root.getLeft() == null) {
                return root.getRight();
            } else {
                TreeNode inOrderSuccessor = findInOrderSuccessor(root);
                int succVal = inOrderSuccessor.getVal();

                // copy successor value into current node
                root.setVal(succVal);

                // delete successor node from the right subtree
                root.setRight(solution(root.getRight(), succVal));

                return root;
            }
        }

        return root;
    }


    public static TreeNode findInOrderSuccessor(TreeNode root) {
        TreeNode successor = root.getRight();

        while (successor.getLeft() != null) {
            successor = successor.getLeft();
        }

        return successor;
    }
}
