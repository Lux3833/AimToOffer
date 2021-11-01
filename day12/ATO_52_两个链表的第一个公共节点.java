/**
 * @title: ATO_52_两个链表的第一个公共节点
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 下午 8:37
 * @Description:输入两个链表，找出它们的第一个公共节点。
 *
 * 示例:
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，
 * 链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *
 */
public class ATO_52_两个链表的第一个公共节点 {
    public static void main(String[] args) {

    }
}
// 使用双指针需要考虑如下情况:
// 考虑构建两个节点指针 A , B 分别指向两链表头节点 headA , headB ，做如下操作：
// 指针 A 先遍历完链表 headA ，再开始遍历链表 headB ，当走到 node 时，共走步数为：a + (b - c)
// 指针 B 先遍历完链表 headB ，再开始遍历链表 headA ，当走到 node 时，共走步数为：b + (a - c)
//
//如下式所示，此时指针 A , B 重合，并有两种情况：a + (b - c) = b + (a - c)

//若两链表 有 公共尾部 (即 c > 0 ) ：指针 A , B 同时指向「第一个公共节点」node。
//若两链表 无 公共尾部 (即 c = 0 ) ：指针 A , B 同时指向 null。
//因此返回 A 即可。
//
class Solution52{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        ListNode A = headA;
        ListNode B = headB;
        while (A != B) {
            A = A != null ? A.next : headB; //学习代码风格
            B = B != null ? B.next : headA;
        }
        return A;
    }
}
