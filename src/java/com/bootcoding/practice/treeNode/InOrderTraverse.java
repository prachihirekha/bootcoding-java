package com.bootcoding.practice.treeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraverse {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>values=new ArrayList<>();
        inOrder(root,values);
        return values;
    }
    public static void inOrder(TreeNode currentNode, List<Integer> values){
        if(currentNode==null){
            return;
        }
        inOrder(currentNode.left,values);
        values.add(currentNode.data);
        inOrder(currentNode.right,values);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left=new TreeNode(2);
        root.right =new TreeNode(5);
        System.out.println(inorderTraversal(root));


    }
}
