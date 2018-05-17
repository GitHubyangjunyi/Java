import java.io.*;

public class FileClass {
    public static void main(String[] args) {
        // �ļ���ļ��ֹ��췽��
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
                    System.out.println("�ļ�����" + f.getAbsolutePath());
                    System.out.println("���ȣ�" + f.length());
                    System.out.println("��д��" + f.canWrite());
                } else {
                    System.out.println("Ŀ¼����" + f.getAbsolutePath());
                }
            }
        } else {
            System.out.println("target dir doesn't exist!");
        }
    }

}
// �ļ���ֻ��һ��������ļ�,���汣����һ���ļ�������
// һ��File��������ָ��һ���ļ����ļ���,���ܴ治����