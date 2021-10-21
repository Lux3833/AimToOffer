import java.util.Stack;

/**
 * @title: ATO_30_包含min函数的栈
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 上午 10:19
 * @Description:定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * 示例:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 */
public class ATO_30_包含min函数的栈 {
    public static void main(String[] args) {

    }
}
class MinStack{
    Stack<Integer> A,B;
    public MinStack(){
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x){
        A.push(x);
        if(B.isEmpty() || B.peek() >= x){ //这里要加 = 号,防止最小值被弹出
            B.push(x);
        }
    }
    public void pop(){
        int popA = A.pop();
        if(popA == B.peek()){
            B.pop();
        }
    }
    public int top(){
        return A.peek();
    }
    public int min(){
        return B.peek();
    }
}
