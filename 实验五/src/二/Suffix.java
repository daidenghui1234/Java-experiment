package 二;

        import java.io.File;

/**
 * @Created : 代登辉
 * @Date : 2020/6/30 14:44
 * @Description : 获取文件后缀
 */
public class Suffix {
    static String getFileNameExtension(String filePath){
        File file = new File(filePath);
        String fileName = file.getName();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        return suffix;
    }

    public static void main(String[] args) {
        String fileString = "E:\\课程\\Java\\实验\\实验五\\src\\二\\Suffix.java";
        System.out.println(getFileNameExtension(fileString));
    }
}
