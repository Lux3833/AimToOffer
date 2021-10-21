/**
 * @title: ATO_58_左旋转字符串II
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 下午 6:56
 * @Description:字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * 示例 1：
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 *
 * 示例 2：
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 */
public class ATO_58_左旋转字符串II {
    public static void main(String[] args) {

    }
}
class Solution58{
    public String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        StringBuffer sb = new StringBuffer();
        if(n >= len){
            for (int i = len-1; i >= 0 ; i--) {
                sb.append(ch[i]);
            }
        }else{
            for (int j = n; j < len; j++) {
                sb.append(ch[j]);
            }
            for (int k = 0; k < n; k++) {
                sb.append(ch[k]);
            }
        }
        return sb.toString();
    }
}