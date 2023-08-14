package com.bootcoding.practice.treeNode;

public class FindMax {
    public static int inOrder(TreeNode root){
        if(root ==null){
            return -1;
        }
        int value =root.data;
        int leftValue =inOrder(root.left);
        int rightValue =inOrder(root.right);
        if(leftValue>value){
            value =leftValue;
        }
        if(rightValue> value){
            value=rightValue;
        }
        return value;
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(120);
        root.left=new TreeNode(70);
        root.left.left =new TreeNode(60);
        root.left.right=new TreeNode(30);
        root.right =new TreeNode(55);
        root.right.left =new TreeNode(333);
        System.out.println(inOrder(root));
    }
}
