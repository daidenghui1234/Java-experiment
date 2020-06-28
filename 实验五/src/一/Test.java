package 一;

import java.util.Scanner;

/**
 * @Created : 代登辉
 * @Date : 2020/6/28 18:18
 * @Description : 调试
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IdCard idCard1 = new IdCard();
        IdCard idCard2 = new IdCard();
        System.out.println("请输入两个身份证，中间用空格隔开");
        idCard1.setID_Card(in.next());
        idCard2.setID_Card(in.next());
        if(idCard1.equals(idCard2)) {
            System.out.println("两个身份证相同");
            System.out.println("所在城市："+idCard1.getCity());
            System.out.println("性别："+idCard1.getGender());
            System.out.println("生日："+idCard1.getBirthday());
        }else {
            System.out.println("两个身份证不相同");
            System.out.println("第一个身份证"+idCard1.getID_Card());
            System.out.println("所在城市："+idCard1.getCity());
            System.out.println("性别："+idCard1.getGender());
            System.out.println("生日："+idCard1.getBirthday());

            System.out.println("第二个身份证"+idCard2.getID_Card());
            System.out.println("所在城市："+idCard2.getCity());
            System.out.println("性别："+idCard2.getGender());
            System.out.println("生日："+idCard2.getBirthday());
        }

    }
}
