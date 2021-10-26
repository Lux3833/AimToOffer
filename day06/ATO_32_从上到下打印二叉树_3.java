import java.util.*;

/**
 * @title: ATO_32_从上到下打印二叉树_3
 * @Author: Lux_er
 * @Date: 2021/10/25 0025 上午 9:49
 * @Description:请实现一个函数按照之字形顺序打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * 例如:
 * 给定二叉树:[3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
public class ATO_32_从上到下打印二叉树_3 {
}
class Solution32_3{
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        boolean needReverse = false;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            if(needReverse){ // 也可以这么实现: res.size() % 2 == 1
                Collections.reverse(list);
            }
            res.add(list);
            needReverse = !needReverse;
        }
        return res;
    }
}