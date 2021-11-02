import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @title: ATO_34_二叉树中和为某一值的路径
 * @Author: Lux_er
 * @Date: 2021/11/21 0021 下午 8:17
 * @Description:给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点
 *
 * 示例1:
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：[[5,4,11,2],[5,8,4,5]]
 *
 * 示例2:
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：[]
 *
 * 示例3:
 * 输入：root = [1,2], targetSum = 0
 * 输出：[]
 */
public class ATO_34_二叉树中和为某一值的路径 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.right = null;
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.left.left.left.left = null;
        root.left.left.left.right = null;
        root.left.left.right.left = null;
        root.left.left.right.right = null;

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.left.left = null;
        root.right.left.right = null;
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = null;
        root.right.right.right = null;
        int target = 22;
        List<List<Integer>> res = new Solution34().pathSum(root,target);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
class Solution34{
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }
    void recur(TreeNode root, int tar) {
        if(root == null) return;
        path.add(root.val);
        tar -= root.val;
        if(tar == 0 && root.left == null && root.right == null)
            res.add(new LinkedList(path));
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }
}