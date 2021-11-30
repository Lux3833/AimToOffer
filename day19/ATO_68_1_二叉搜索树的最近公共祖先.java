import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @title: ATO_68_1_二叉搜索树的最近公共祖先
 * @Author: Lux_er
 * @Date: 2021/11/22 0022 下午 10:26
 * @Description:给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 例如，给定如下二叉搜索树: root = [6,2,8,0,4,7,9,null,null,3,5]
 *
 * 示例 1:
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 输出: 6
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 *
 * 示例 2:
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * 输出: 2
 * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
 */
// 递推工作：
// 当 p, q 都在 root 的 右子树 中，则开启递归 root.right 并返回；
// 否则，当 p, q 都在 root 的 左子树 中，则开启递归 root.left 并返回；
// 返回值： 最近公共祖先 root 。

public class ATO_68_1_二叉搜索树的最近公共祖先 {
    public static void main(String[] args) {

    }
}
class Solution68_1{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right,p,q);
        }
        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p, q);
        }
        return root;
    }


}