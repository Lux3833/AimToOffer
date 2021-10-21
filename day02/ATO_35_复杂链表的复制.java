import java.util.HashMap;
import java.util.Map;

/**
 * @title: ATO_35_复杂链表的复制
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 下午 2:22
 * @Description:请实现 copyRandomList 函数，复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 * 示例1:
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 *
 * 示例2:
 * 输入：head = [[1,1],[2,1]]
 * 输出：[[1,1],[2,1]]
 *
 * 示例3:
 * 输入：head = [[3,null],[3,0],[3,null]]
 * 输出：[[3,null],[3,0],[3,null]]
 *
 * 示例4:
 * 输入：head = []
 * 输出：[]
 * 解释：给定的链表为空（空指针），因此返回 null。
 */
public class ATO_35_复杂链表的复制 {
    public static void main(String[] args) {

    }
}
class Solution35{
    Map<Node,Node> cachedNode = new HashMap<Node,Node>();
    public Node copyRandomList(Node head){
        if(head == null){
            return null;
        }
       if(!cachedNode.containsKey(head)){
           Node headNew = new Node(head.val);
           cachedNode.put(head,headNew);
           headNew.next = copyRandomList(head.next);
           headNew.random = copyRandomList(head.random);
       }
       return cachedNode.get(head);
    }
}