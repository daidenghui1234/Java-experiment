package 四;

public class E {
      public static void main (String args[ ]) {
        String str = "ab123you你是谁？";
        String regex = "\\D+";
        str = str.replaceAll(regex,"");
        System.out.println(str);
      }
}