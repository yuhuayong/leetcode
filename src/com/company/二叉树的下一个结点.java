package com.company;

public class 二叉树的下一个结点 {
    public static void main(String[] args) {

    }
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {      //右子树不为空，则下一个节点为右子树最左底下一个节点
            TreeLinkNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        } else {       //右子树为空，
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode)       //左子节点和路径上的父节点已经遍历，只有根节点没有遍历
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
}
