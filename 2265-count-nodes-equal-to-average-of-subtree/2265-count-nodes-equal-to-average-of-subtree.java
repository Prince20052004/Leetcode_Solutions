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
    int result;
    class SubTreeData{
        int sum;
        int count;
        SubTreeData(int sum, int count){
            this.sum=sum;
            this.count=count;
        }
    }
    public SubTreeData solve(TreeNode root){
        if(root==null){
            return new SubTreeData(0, 0);
        }
        SubTreeData p1=solve(root.left);
        SubTreeData p2=solve(root.right);
        int totalsum=p1.sum+p2.sum+root.val;
        int totalcount=p1.count+p2.count+1;
        int avg=totalsum/totalcount;
        if(avg==root.val){
            result+=1;
        }
        return new SubTreeData(totalsum, totalcount);
    }
    public int averageOfSubtree(TreeNode root) {
        result=0;
        solve(root);
        return result;
    }
}