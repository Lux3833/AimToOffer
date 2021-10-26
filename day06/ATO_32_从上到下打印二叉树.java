
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title: ATO_32_从上到下打印二叉树
 * @Author: Lux_er
 * @Date: 2021/10/25 0025 上午 8:56
 * @Description:从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 例如:
 * 给定二叉树:[3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [3,9,20,15,7]
 */
public class ATO_32_从上到下打印二叉树 {
}
// 通过队列先进先出来实现,将队列中的头部元素弹出,看其是否存在左右子节点,若存在则依次加入队列尾,直至队列为空
class Solution32{
    public int[] levelOrder(TreeNode root){
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arrList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            arrList.add(temp.val);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        int[] res = new int[arrList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrList.get(i);
        }
        return res;
    }
}

