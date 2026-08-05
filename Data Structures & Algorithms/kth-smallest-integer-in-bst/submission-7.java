/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;

        while(curr != null)
        {
            if(curr.left == null)
            {
                k--;
                if(k == 0) return curr.val;
                curr = curr.right;
            }
            else
            {
                TreeNode preNode = curr.left;

                while(preNode.right != null && preNode.right != curr)
                    preNode = preNode.right;
                    
                    if(preNode.right == null)
                    {
                        preNode.right = curr;
                        curr = curr.left;
                    }    
                    else
                    {
                        preNode.right = null;
                        k--;
                        if(k == 0) return curr.val;
                        curr = curr.right;
                    }
            }
        }

        return -1;
    }
        
    }
