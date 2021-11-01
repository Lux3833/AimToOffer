import java.util.Arrays;
import java.util.Collections;

/**
 * @title: ATO_58_翻转单词顺序
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 上午 11:31
 * @Description:输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 示例 1：
 * 输入: "the sky is blue"
 * 输出:"blue is sky the"
 *
 * 示例 2：
 * 输入: " hello world! "
 * 输出:"world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 *
 * 示例 3：
 * 输入: "a good example"
 * 输出:"example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class ATO_58_翻转单词顺序 {
    public static void main(String[] args) {

    }
}
class Solution58_1 {
    public String reverseWords(String s){
        s = s.trim(); // 去除原字符串的头尾部分的空格
        int first,second;
        first = second = s.length()-1;
        StringBuffer sb = new StringBuffer();
        while(first >= 0){
            while(first >= 0 && s.charAt(first) != ' '){
                first--;
            }
            sb.append(s.substring(first+1, second+1)+" ");
            while(first >= 0 && s.charAt(first) == ' '){
                first--;
            }
            second = first;
        }
        return sb.toString().trim();
    }
}