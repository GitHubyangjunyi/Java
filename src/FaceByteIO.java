import java.io.*;

public class FaceByteIO {
    public static void main(String[] args) {
        String from = "./targetfile/in.txt";
        String to="./targetfile/out.txt";
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream(from);
            out=new FileOutputStream(to);
            int i=0;
            while ((i=in.read())!=-1) {//ÿ�δ��ļ���ȡһ���ֽ�,�������-1��ʾ�ļ�����
                out.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
// �κ������඼�Ǵ�InputStream�����Reader������������,���ڶ�ȡ�����ֽڻ��ֽ�����
// �κ�����඼�Ǵ�OuputStream�����Writer������������,����д�뵥���ֽڻ��ֽ�����