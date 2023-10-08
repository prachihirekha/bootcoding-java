package com.bootcoding.practice.treeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static List<Integer>postOrderTraversal(TreeNode root){
        List<Integer>nums= new ArrayList<>();
        postOrder(root,nums);
        return nums;
    }
    public static void postOrder(TreeNode currentNode,List<Integer>nums){
        if(currentNode==null){
            return;
        }
        postOrder(currentNode.left,nums);
        postOrder(currentNode.right,nums);
        nums.add(currentNode.data);
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(60);
       root.left =new TreeNode(50);
       root.right =new TreeNode(70);
        System.out.println(postOrderTraversal(root));
    }
}
