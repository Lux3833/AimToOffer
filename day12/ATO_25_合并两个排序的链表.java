/**
 * @title: ATO_25_合并两个排序的链表
 * @Author: Lux_er
 * @Date: 2021/11/22 0022 下午 8:05
 * @Description:输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class ATO_25_合并两个排序的链表 {
    public static void main(String[] args) {

    }
}
class Solution25{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while(l1.next != null || l2.next != null){
            if(l1.val < l2.val){
                tmp.next = l1;
                l1 = l1.next;
            }else{
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
       tmp.next = l1 == null ? l2 : l1;
        return res.next;
    }
}