/**
 * @title: ATO_24_反转链表
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 下午 1:56
 * @Description:定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ATO_24_反转链表 {
    public static void main(String[] args) {

    }
}
// 定义三个指针: pre|curr|next,分别用来存储节点前,当前节点和当前节点的下一个节点.用这个三个指针来逆序存储链表内容
class Solution24{
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}