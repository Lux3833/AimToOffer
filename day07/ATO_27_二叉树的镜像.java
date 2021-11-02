/**
 * @title: ATO_27_二叉树的镜像
 * @Author: Lux_er
 * @Date: 2021/10/26 0026 下午 8:55
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 例如输入：
 *     4
 *   /  \
 *  2   7
 * / \  / \
 * 1  3 6  9
 * 镜像输出：
 *     4
 *   /  \
 *  7   2
 * / \  / \
 * 9  6 3 1
 *
 * 示例 1：
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 */
// 这是一道很经典的二叉树问题。显然，我们从根节点开始，递归地对树进行遍历，并从叶子节点先开始翻转得到镜像。
// 如果当前遍历到的节点 root 的左右两棵子树都已经翻转得到镜像，那么我们只需要交换两棵子树的位置，即可得到以 root 为根节点的整棵子树的镜像。

public class ATO_27_二叉树的镜像 {
    public static void main(String[] args) {

    }
}
class Solution27{
    public TreeNode mirrorTree(TreeNode root){
        if(root == null) return null;
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }
}