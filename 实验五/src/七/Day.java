package 七;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Day {
 
    public static void main(String[] args) throws ParseException {
        String s1 = "2017-03-09";
        String s2 = "2008-08-08";
 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 
        //把字符串时间解析为Date对象
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);
 
        //分别获得两个日期的long类型毫秒数
        long date1 = d1.getTime();
        long date2 = d2.getTime();
 
        long d = date1 - date2;//两个时间相隔的毫秒数
 
        final long day = 86400000;//一天的毫秒数
 
        System.out.println(s1+"与"+s2+"相隔"+(d / day)+"天，相隔"+(d/day/7)+"周");//相隔多少天
    }
}