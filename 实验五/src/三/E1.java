package 三;

import java.util.Scanner;

/**
 * @Created : 代登辉
 * @Date : 2020/6/30 14:56
 * @Description : 拆分成单独的单词，再对其每一个单词的首字母变大写
 */
public class E1 {
    public static void main(String[] args) {
        //方法1.
        String str = null;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        String[] s = str.split(" ");
        //用于接收转成大写的单词
        String str2 = new String();
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
            //将取到的第一个字符转换成大写，在在其后面拼接上其余部分
            if(i==s.length-1){
                str2 = str2+s[i];
            }else{
                str2 = str2+s[i]+" ";
            }
        }
        System.out.println(str2);
    }
}
