package 三;

import java.util.Scanner;

/**
 * @Created : 代登辉
 * @Date : 2020/6/30 14:57
 * @Description : 取出每个单词首字母，利用其ASCLL码-32来变成大写
 */
public class E2 {
    public static void main(String[] args) {
        //方法2
        String str = null;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        String[] s = str.split(" ");//以空格为分隔符进行分割
        //用于接收转成大写的单词
        String str2 = new String();
        for (int i = 0; i < s.length; i++) {
            //toCharArray:将String类型字符串转换成字符数组
            char[] a = s[i].toCharArray();
            //取出每个单词的首字母，-32，编程对应字母的大写值的ASCII码
            a[0] = (char) (a[0]-32);
            //使用String包装类valueOf(char[] data),将字符数组转换成字符串
            s[i] = String.valueOf(a);
            if(i==s.length-1){
                str2 = str2+s[i];
            }else{
                str2 = str2+s[i]+" ";
            }
        }
        System.out.println(str2);

    }
}
