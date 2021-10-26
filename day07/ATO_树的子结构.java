/**
 * @title: ATO_树的子结构
 * @Author: Lux_er
 * @Date: 2021/10/25 0025 上午 10:13
 * @Description:输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * 例如:
 * 给定的树 A:
 *     3
 *    / \
 *   4  5
 *  / \
 * 1  2
 * 给定的树 B：
 *   4
 *  /
 * 1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 示例 1：
 * 输入：A = [1,2,3], B = [3,1]
 * 输出：false
 * 示例 2：
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 */
public class ATO_树的子结构 {
}
class Solution26{
    // isSubStructure(A,B)函数
    // 特例处理: 当树A为空 或 树B为空时,返回false
    // 返回值: 若树B是树A的子结构,一定以下三种情况之一,用 || 连接
    // (1)以节点A为根节点的子树,包含B.对应recur(A,B)
    // (2)树B是树A左子树的子结构,对应 isSubStructrue(A.left, B)
    // (3)树B是树A右子树的子结构,对应 isSubStructrue(A.right, B)
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    // recur()函数
    // 终止条件:(1)当节点B为空,说明B匹配完成,返回true
    //         (2)当节点A为空:说明已经越过树A叶子节点,匹配失败,返回false
    //         (3)当节点A和B的值不同,说明匹配失败,返回false
    // 返回值: (1)判断A和B的左子节点是否相等,即recur(A.left, B.left)
    //         (2)判断A和B的右子节点是否相等,即recur(A.right, B.right)
    boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}