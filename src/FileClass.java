import java.io.*;

public class FileClass {
    public static void main(String[] args) {
        // 文件类的几种构造方法
        File file1 = new File("C:/Users/12090/JavaSource/Java/targetfile/delete.txt");
        File dir1 = new File("C:/Users/12090/JavaSource/Java/targetfile");
        File file2 = new File(dir1, "a.txt");
        System.out.println(file2.exists() + "\n");
        if (file1.exists()) {
            file1.delete();
        } else {
            try {
                file1.createNewFile();
            } catch (Exception e) {
            }
        }
        if (dir1.exists()) {
            File[] files = dir1.listFiles();
            for (int i = 0; i < files.length; i++) {
                File f = files[i];
                if (f.isFile()) {
                    System.out.println("文件名：" + f.getAbsolutePath());
                    System.out.println("长度：" + f.length());
                    System.out.println("可写：" + f.canWrite());
                } else {
                    System.out.println("目录名：" + f.getAbsolutePath());
                }
            }
        } else {
            System.out.println("target dir doesn't exist!");
        }
    }

}
// 文件夹只是一种特殊的文件,里面保存了一组文件的名字
// 一个File类对象可以指向一个文件或文件夹,不管存不存在