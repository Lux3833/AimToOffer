/**
 * @title: ATO_05_替换空格
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 下午 2:47
 * @Description:请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class ATO_05_替换空格 {
    public static void main(String[] args) {

    }
}
class Solution05{
    public String replaceSpace(String s){
        StringBuffer sb = new StringBuffer();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' '){
               sb.append("%20");
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
