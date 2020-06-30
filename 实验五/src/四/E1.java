package 四;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//方法一：
public class E1 {
    public static void main(String[] args) {
        String s = "数学87分， 物理76分，英语96分";
        String re = "[1234567890.]+" ;
        Pattern p = Pattern.compile(re) ;
        Matcher m = p.matcher(s) ;
        double sum = 0 ;
        while (m.find()) {
            String item = m.group() ;
            System.out.println(item) ;
            sum=sum+Double.parseDouble(item) ;
        }
        System.out.println("总成绩："+sum+"平均成绩为"+sum/3) ;
    }

}