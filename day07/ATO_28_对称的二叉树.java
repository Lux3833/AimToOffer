/**
 * @title: ATO_28_对称的二叉树
 * @Author: Lux_er
 * @Date: 2021/10/30 0030 下午 3:52
 * @Description:请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 例如，二叉树[1,2,2,3,4,4,3] 是对称的。
 *   1
 *  / \
 *  2  2
 * / \ / \
 * 3 4 4 3
 *
 * 但是下面这个[1,2,2,null,3,null,3] 则不是镜像对称的:
 *   1
 *  / \
 *  2  2
 *  \  \
 *  3  3
 * 示例 1：
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 *
 * 示例 2：
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 */
public class ATO_28_对称的二叉树 {
    public static void main(String[] args) {

    }
}
// 解析
// 对称二叉树定义： 对于树中 任意两个对称节点 L 和 R ，一定有：
// L.val=R.val ：即此两对称节点值相等。
// L.left.val=R.right.val ：即 L 的 左子节点 和 R 的 右子节点 对称；
// L.right.val=R.left.val ：即 L 的 右子节点 和 R 的 左子节点 对称。
// 根据以上规律，考虑从顶至底递归，判断每对节点是否对称，从而判断树是否为对称二叉树。

// 算法流程：
// isSymmetric(root) ：
// 特例处理： 若根节点 root 为空，则直接返回 true 。
// 返回值： 即 recur(root.left, root.right) ;
// recur(L, R) ：
// 终止条件：
// 当 L 和 R 同时越过叶节点： 此树从顶至底的节点都对称，因此返回 true ；
// 当 L 或 R 中只有一个越过叶节点： 此树不对称，因此返回 false ；
// 当节点 L 值 /节点 R 值： 此树不对称，因此返回 false ；
// 递推工作：
// 判断两节点 L.left 和 R.right 是否对称，即 recur(L.left, R.right) ；
// 判断两节点 L.right 和 R.left 是否对称，即 recur(L.right, R.left) ；
// 返回值： 两对节点都对称时，才是对称树，因此用与逻辑符 && 连接。

class Solution28{
    public boolean isSymmetric(TreeNode root){
        return root == null ? true : recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return recur(left.left,right.right) && recur(left.right, right.left);
    }
}