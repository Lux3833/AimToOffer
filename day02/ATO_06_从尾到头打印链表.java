import java.util.List;
import java.util.Stack;

/**
 * @title: ATO_06_从尾到头打印链表
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 上午 11:10
 * @Description:输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */

// 算法流程：
// 入栈： 遍历链表，将各节点值 push 入栈。（Python 使用 append() 方法，Java借助 LinkedList 的addLast()方法）。
// 出栈： 将各节点值 pop 出栈，存储于数组并返回。（Python 直接返回 stack 的倒序列表，Java 新建一个数组，通过 popLast() 方法将各元素存入数组，实现倒序输出）。
// 复杂度分析：
// 时间复杂度 O(N)： 入栈和出栈共使用 O(N) 时间。
// 空间复杂度 O(N)： 辅助栈 stack 和数组 res 共使用 O(N) 的额外空间。

public class ATO_06_从尾到头打印链表 {
    public static void main(String[] args) {

    }
}
// 用栈的方法存储链表数据,再从头输出栈顶到栈底的信息给数组,返回这个数组就行
class Solution06{
    public int[] reversePrint(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }
}