import java.util.ArrayList;
import java.util.List;

/**
 * @title: ATO_54_二叉搜索树的第k大节点
 * @Author: Lux_er
 * @Date: 2021/11/22 0022 上午 9:45
 * @Description:给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class ATO_54_二叉搜索树的第k大节点 {
    public static void main(String[] args) {

    }
}
class Solution54{
    public int kthLargest(TreeNode root, int k){
        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list.get(list.size()-k);
    }

    private void dfs(TreeNode cur, List<Integer> list) {
        if(cur == null) return;
        dfs(cur.left,list);
        list.add(cur.val);
        dfs(cur.right,list);
    }
}