/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int countNodes(TreeNode* root) {
        if(!root)
            return 0;
        int lh=leftdepth(root);
        int rh=rightdepth(root);
        if(lh==rh)
            return (int)pow(2, lh)-1;
        else
            return 1+countNodes(root->left)+countNodes(root->right);
    }
    int rightdepth(TreeNode* root){
        int dep=0;
        while(root){
            root=root->right;
            dep++;
        }
        return dep;
    }
    int leftdepth(TreeNode* root){
        int dep=0;
        while(root){
            root=root->left;
            dep++;
        }
        return dep;
    }
};