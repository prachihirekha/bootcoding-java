package com.bootcoding.practice.treeNode;


import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public static List<Integer>preOrderTraversal(TreeNode root){
        List<Integer>list =new ArrayList<>();
        preOrder(root,list);
        return list;

    }
    // create method
    public static void preOrder(TreeNode  currentNode,List<Integer>list){
        if(currentNode == null){
            return;
        }
        list.add(currentNode.data);
        preOrder(currentNode.left,list);
        preOrder(currentNode.right,list);

    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(20);
        root.left =new TreeNode(10);
        root.right =new TreeNode(30);
        System.out.println(preOrderTraversal(root));
    }



}
