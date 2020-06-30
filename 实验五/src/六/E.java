package 六;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Created : 代登辉
 * @Date : 2020/6/30 15:28
 * @Description : 作用
 */
public class E {
    public static void main(String[] args) {
        //声明数据
        List<Integer> list = new ArrayList<>();
        //保存的List后续转为数组
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        ArrayList<Integer> a5 = new ArrayList<>();
        //生成随机数
        for(int i=0; i<5;i++){
            boolean flag = true;
            while(flag){
                int random = (int)Math.ceil(Math.random()*80+20);
                if(!list.contains(random)){
                    list.add(random);
                    flag = false;
                }
            }
        }
        //排序
        Collections.sort(list);
        //分别保存5个list
        for(int i=0;i<5;i++){
            if(i<5){
                a1.add(list.get(i));
            }else if(i<10){
                a2.add(list.get(i));
            }else if(i<15){
                a3.add(list.get(i));
            }else if(i<20){
                a4.add(list.get(i));
            }else if(i<25){
                a5.add(list.get(i));
            }
        }
        System.out.println(list);
        //转换数组
        Object[] array = a1.toArray();
        for(int i=0;i<5;i++){
            System.out.println(array[i]);
        }
    }
}
