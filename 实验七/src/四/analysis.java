package 四;

import java.io.*;
import java.util.*;
public class analysis {

	public static void main(String[] args) {
		RandomAccessFile file = null;
		Scanner sc = null;
		int count = 0;	//计数共有几个数字
		double sum = 0;	//总的价值
		try
		{
			file = new RandomAccessFile("src/四/test.txt","r");	//只读打开文件test.txt
			StringBuilder sb = new StringBuilder();			//定义一个字符串缓存，将字符串存放缓存中
	        String s = null;								//临时变量
	        byte b[];										//临时字符数组
	        while ((s = file.readLine()) != null) 
	        {											//逐行读取文件内容，不读取换行符和末尾的空格
	        	b = s.getBytes("iso-8859-1");			//重新编码  防止乱码
				String content = new String(b,"UTF-8");	//将字符数组转化为字符串
	            sb.append(content + "\n");				//将读取的字符串添加换行符后累加存放在缓存中
	        }
	        file.close();	//关闭文件
	        String str = sb.toString();//转化为string类型
			double price = 0;
			System.out.println("读取到文件内容为:\n\n"+str);
			sc = new Scanner(str);
			sc.useDelimiter("[^0123456789.]+");//以非数字作为分隔符
			while(sc.hasNextDouble())	//读不到double类型时结束循环
			{
				price = sc.nextDouble();//读到的double类型赋值给price，若不是自动转为double
				count++;
				sum += price;
				System.out.println(price);
			}
			double aver = sum / count;
			System.out.println("平均价格为："+aver);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
