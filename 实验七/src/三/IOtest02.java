package 三;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
 
public class IOtest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("src/三/Input.txt"));
			bw = new BufferedWriter(new FileWriter("src/三/Output.txt"));
			String str = "";
			int i = 1;
			while((str = br.readLine()) != null){
				bw.write(i+" ");
				bw.write(str);
				System.out.println(str);
				bw.newLine();
				i++;
			}
			bw.flush();
			bw.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到指定文件！");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}