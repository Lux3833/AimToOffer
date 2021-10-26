/**
 * @title: ATO_50_第一个只出现一次的字符
 * @Author: Lux_er
 * @Date: 2021/10/22 0022 上午 10:29
 * @Description:在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * 示例 1:
 * 输入：s = "abaccdeff"
 * 输出：'b'
 *
 * 示例 2:
 * 输入：s = ""
 * 输出：' '
 */
public class ATO_50_第一个只出现一次的字符 {
    public static void main(String[] args) {

    }
}
class Solution50{
    public char firstUniqChar(String s){
        char[] ch = s.toCharArray();
        int[] counts = new int[26];
        for (int i = 0; i < ch.length; i++) {
            counts[ch[i] - 'a']++;
        }
        for (int i = 0; i < ch.length; i++) {
            if(counts[ch[i]] == 1)
              return ch[i];
        }
        return ' ';
    }
}