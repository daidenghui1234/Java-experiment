package 一.分析成绩单;

import java.io.*;

public class AnalysisResult {
    public static void main(String args[]) {
        File fRead = new File("src/一/分析成绩单/score.txt");
        File fWrite = new File("src/一/分析成绩单/socreAnalysis.txt");
        try{
            Writer out = new FileWriter(fWrite, true);//以尾加方式创建指向文件fWrite的out流
            BufferedWriter bufferWrite = new BufferedWriter(out);//创建指向out的bufferWrite流
            Reader in = new FileReader(fRead);//创建指向文件fRead的in流
            BufferedReader bufferRead =new BufferedReader(in);//创建指向in的bufferRead流
            String str = null;
            while((str=bufferRead.readLine())!=null) {
                double totalScore=Fenxi.getTotalScore(str);
                str = str+" 总分:"+totalScore;
                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferRead.close();
            bufferWrite.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
    }
}


