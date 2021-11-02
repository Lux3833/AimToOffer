/**
 * @title: ATO_46_把数字翻译成字符串
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 下午 9:30
 * @Description:给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，
 * 11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

 * 示例 1:
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 */
public class ATO_46_把数字翻译成字符串 {
    public static void main(String[] args) {

    }
}
// 动态规划
// 状态定义： 设动态规划列表 dp ，dp[i] 代表以 x_i 为结尾的数字的翻译方案数量。
// 转移方程： 若 x_i 和 x_{i-1}组成的两位数字可以被翻译，则 dp[i] = dp[i - 1] + dp[i - 2]；否则 dp[i] = dp[i - 1]。
// 可被翻译的两位数区间：当 x_{i-1} = 0 时，组成的两位数是无法被翻译的（例如 00, 01, 02, ...），因此区间为 [10, 25] 。
//初始状态： dp[0] = dp[1] = 1 ，即 “无数字” 和 “第 1 位数字” 的翻译方法数量均为 1 ；
//返回值： dp[n]，即此数字的翻译方案数量。
class Solution46{
    public int translateNum(int num){
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            String temp = s.substring(i-2, i);
            if(temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0)
                dp[i] = dp[i-1] + dp[i-2];
            else
                dp[i] = dp[i-1];
        }
        return dp[s.length()];
    }
}
// 字符串遍历
// 为方便获取数字的各位 x_i，考虑先将数字 num 转化为字符串 s ，通过遍历 s 实现动态规划。
// 通过字符串切片 s[i - 2:i] 获取数字组合 10 x_{i-1} + x_i ，通过对比字符串 ASCII 码判断字符串对应的数字区间。
// 空间使用优化： 由于 dp[i] 只与 dp[i - 1] 有关，因此可使用两个变量 a,b 分别记录 dp[i], dp[i - 1]，两变量交替前进即可。
// 此方法可省去 dp 列表使用的 O(N) 的额外空间。
class Solution46_2{
    public int translateNum(int num){
        String s = String.valueOf(num);
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= s.length(); i++) {
            String temp = s.substring(i-2, i);
            if(temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0)
                c = a + b;
            else
                c = b;
            a = b;
            b = c;
        }
        return b;
    }
}
// 数字求余  |||||| 值得学习 ||||||
// 上述方法虽然已经节省了 dp 列表的空间占用，但字符串 s 仍使用了 O(N) 大小的额外空间。
// 空间复杂度优化：
// 利用求余运算 num % 10 和求整运算 num / 10，可获取数字 num 的各位数字（获取顺序为个位、十位、百位…）。
// 因此，可通过 求余 和 求整 运算实现 从右向左 的遍历计算。而根据上述动态规划 “对称性” ，可知从右向左的计算是正确的。
// 自此，字符串 ss 的空间占用也被省去，空间复杂度从 O(N) 降至 O(1) 。
// 复杂度分析：
// 时间复杂度 O(N) ： N 为字符串 s 的长度（即数字 num 的位数 log(num) ），其决定了循环次数。
// 空间复杂度 O(1) ： 几个变量使用常数大小的额外空间。
class Solution46_3{
    public int translateNum(int num){
        int a = 1, b = 1, x, y = num % 10;
        while(num != 0) {
            num /= 10;
            x = num % 10;
            int tmp = 10 * x + y;
            int c = (tmp >= 10 && tmp <= 25) ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}