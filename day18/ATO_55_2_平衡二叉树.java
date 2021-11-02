/**
 * @title: ATO_55_2_平衡二叉树
 * @Author: Lux_er
 * @Date: 2021/11/22 0022 下午 9:45
 * @Description:输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。

 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
// 算法流程：
// recur(root) 函数：
// 返回值：
// 当节点root 左 / 右子树的深度差 ≤1 ：则返回当前子树的深度，即节点 root 的左 / 右子树的深度最大值 +1 （ max(left, right) + 1 ）；
// 当节点root 左 / 右子树的深度差 > 2 ：则返回 −1 ，代表 此子树不是平衡树 。
// 终止条件：
// 当 root 为空：说明越过叶节点，因此返回高度 0 ；
// 当左（右）子树深度为 -1 ：代表此树的 左（右）子树 不是平衡树，因此剪枝，直接返回 -1 ；
// isBalanced(root) 函数：
// 返回值： 若 recur(root) != -1 ，则说明此树平衡，返回 true ； 否则返回 false 。

public class ATO_55_2_平衡二叉树 {
    public static void main(String[] args) {

    }
}
class Solution_55_2{
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}