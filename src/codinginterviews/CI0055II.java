package src.codinginterviews;


import src.algorithms.baseclass.TreeNode;

/**
 *
 * 剑指 Offer 55 - II. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 *  
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class CI0055II {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return recur(root) != -1;
        }

        private int recur(TreeNode node) {
            if (node == null)
                return 0;
            int left = recur(node.left);
            if (left == -1) return -1;
            int right = recur(node.right);
            if (right == -1) return -1;
            return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
        }
    }
}
