package 二;

import java.io.*;
import java.util.*;  
//使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
public class Home {
 
   public static final void main(String[] args) {   
       try {   
           File f = new File("src/二/exp.txt");
           if(!f.exists()) {   
               f.createNewFile();   
           }   
           RandomAccessFile raf = new RandomAccessFile(f,"rw");   
           String str = new String();   
           System.out.println("请输入你想要输出的字母：");
           str = new Scanner(System.in).next();   
           for(int i=0; i<str.length(); i++) {   
               raf.write(str.charAt(i));   
           }   
           raf.writeUTF(str);   
           long len = str.length();   
           while(0 != len--) {   
               raf.seek(len);   
               char ch = (char)raf.read();   
               System.out.print(ch+" ");   
           }   
           raf.close();   
       } catch(IOException e) {   
           e.printStackTrace();   
       }   
   }   
}