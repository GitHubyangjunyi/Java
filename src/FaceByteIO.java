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
            while ((i=in.read())!=-1) {//每次从文件读取一个字节,如果返回-1表示文件结束
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
// 任何输入类都是从InputStream类或者Reader类派生而来的,用于读取单个字节或字节数组
// 任何输出类都是从OuputStream类或者Writer类派生而来的,用于写入单个字节或字节数组