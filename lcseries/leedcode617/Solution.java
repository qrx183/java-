package com.qrxedu.leedcode617;

import sun.reflect.generics.tree.Tree;

/**
 * @author qiu
 * @version 1.8.0
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root;
        if(root1 == null && root2 == null){
            root =  null;
        }else if(root1 == null){
            root = root2;
        }else if(root2 == null){
            root = root1;
        }else{
            root = new TreeNode(root1.val + root2.val);;
            root.left = mergeTrees(root1.left,root2.left);
            root.right = mergeTrees(root1.right,root2.right);
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
