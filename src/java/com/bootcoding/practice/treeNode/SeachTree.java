package com.bootcoding.practice.treeNode;

public class SeachTree {

    public static void insert(int values) {
        TreeNode  root;

       // TreeNode root =new TreeNode(50);
     // root=  insertNode(root ,values);
    }
    public  static  TreeNode insertNode(TreeNode root, int values){
        // If the tree is empty, create a new node and return it as the root
        if(root ==null){
            return new TreeNode(values);
        }
        // If the value is less than the root's value, go to the left subtree
        if(values <root.data){
            root.left =insertNode(root.left ,values);
        }
        // If the value is greater than the root's value, go to the right subtree
       else {

           root.right = insertNode(root.right, values);
        }
        return  root;
    }

    public static void main(String[] args) {
       SeachTree st = new SeachTree();
      // st.insert=
    }
}
