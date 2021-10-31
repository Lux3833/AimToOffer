/**
 * @title: ATO_18_删除链表的节点
 * @Author: Lux_er
 * @Date: 2021/10/31 0031 上午 10:18
 * @Description:给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * 注意：此题对比原题有改动
 * 示例 1:
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 * 示例 2:
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为1的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 */
public class ATO_18_删除链表的节点 {
    public static void main(String[] args) {

    }
}
class Solution18{
    public ListNode deleteNode(ListNode head, int val){
        if(head == null) return null;
        if (head.val == val) {
            head = head.next;
            return head;
        }
        ListNode first = head;
        ListNode next = head.next;
        while(next.val != val && next != null){
            first = next;
            next = next.next;
        }
        first.next = next.next;
        return head;
    }
}