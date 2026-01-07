package org.example.practice.BinaryTrees;

import org.example.implementTreeNode.TreeNode;

public class LowestCommonAncestorOfBinarySearchTree {
    public static TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        if ((p.getVal() <= root.getVal() && q.getVal() >= root.getVal()) ||
                (q.getVal() <= root.getVal() && p.getVal() >= root.getVal())) {
            return root;
        }

        if (p.getVal() > root.getVal() && q.getVal() > root.getVal()) {
            return solution(root.getRight(), p, q);
        } else if (p.getVal() < root.getVal() && q.getVal() < root.getVal()) {
            return solution(root.getLeft(), p, q);
        }

        return null;
    }
}
