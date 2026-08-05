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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        Queue<Object[]> queue = new LinkedList<>();

        queue.add(new Object[]{root, Long.MIN_VALUE, Long.MAX_VALUE});

        while( !queue.isEmpty())
        {
            Object[] currVal = queue.poll();
            TreeNode node = (TreeNode) currVal[0];
            Long minVal = (Long) currVal[1];
            Long maxVal = (Long) currVal[2];

            if( !(minVal < node.val && maxVal > node.val))
            {
                return false;
            }

            if(node.left != null)
            {
                queue.add(new Object[] {node.left, minVal,(long) node.val});
            }
            if(node.right != null)
            {
                queue.add(new Object[] {node.right, (long) node.val, maxVal});
            }
        }

        return true;
    }
}
