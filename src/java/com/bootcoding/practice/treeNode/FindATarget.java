package com.bootcoding.practice.treeNode;

public class FindATarget {
    public static boolean search(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if (target == root.data) {


            return true;
        }
         boolean res =search(root.left,target);
        if(res){
            return true;
        }
        return search(root.right,target);
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(50);
        root.left = new TreeNode(30);
        root.right =new TreeNode(40);
        root.right.left =new TreeNode(35);
        root.left.left =new TreeNode(60);
        System.out.println(search(root,10));
    }
}
