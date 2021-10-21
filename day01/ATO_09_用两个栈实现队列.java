import java.util.Stack;

/**
 * @title: ATO_09_用两个栈实现队列
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 上午 9:38
 * @Description:用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
 *  示例 1：
 *  输入：
 *  ["CQueue","appendTail","deleteHead","deleteHead"]
 *  [[],[3],[],[]]
 *  输出：[null,null,3,-1]

 *  示例 2：
 *  输入：
 *  ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 *  [[],[],[5],[2],[],[]]
 *  输出：[null,-1,null,null,5,2]

 */
public class ATO_09_用两个栈实现队列 {
    public static void main(String[] args) {

    }
}
class CQueue{
    Stack<Integer> A,B;
    public CQueue(){
        A = new Stack<>();
        B = new Stack<>();
    }
    public void appendTail(int value){
        A.push(value);
    }
    public int deleteHead(){
        if(B.isEmpty()){
            if(A.isEmpty()){
                return -1;
            }else{
                do{
                    B.push(A.pop());
                }while (!A.isEmpty());
            }
        }
        return B.pop();
    }
}