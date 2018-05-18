import java.io.*;
//读取硬盘上的一个文件的内容,将其复制到另一文件中,效率低
public class FaceByteIO {
    public static void main(String[] args) {
        String from = "./targetfile/in.txt";
        String to="./targetfile/out.txt";
        FileInputStream in=null;//按给定文件名构造对象
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
// InputStream表述那些从不同数据源产生输入的类
// 这些数据源包括:
//              内存中的字节数组
//              String对象
//              文件
//              管道
//              其他种类流组成的序列
//              其他数据源,如网络连接
// 对于上述数据源都有相应的InputStream的子类
// InputStream作为所有面向字节的输入流的父类,拥有名为read()的基本方法被所有子类继承
// 但是一般很少使用,而是使用其子类提供的其他方法
// InputStream的子类
// 类                       功能                                   使用方法
//ByteArrayInputStream      允许将内存的缓冲区当作InputStream       提供一个字节数组作为构造器参数
//StringBufferInputStream   允许将一个字符串转换成InputStream       字符串作为构造器的参数
//FileInputStream           从文件中读取信息                       构造器的参数是一个表示文件名的字符串
//PipedInputStream          与其他线程中的输出流相连,实现管道        构造器的参数是PipedOutputStream的实例
//FilterInputStream         抽象类,仅提供一个接口用于说明为其他      其子类的构造参数一般是其他InputStream类的实例   
//                          InputStream提供哪些有用的功能
//FileInputStream类也是InputStream类的一种子类,文件输入流
//FileInputStream(String name):按给定的文件名构造对象
//FileInputStream(File file):为以File对象指定的文件构造对象
//第二种方法可以在文件读取前进行分析工作,如检查文件是否存在
//
//OutputStream输出流为应用程序提供数据输出功能
// OutputStream的子类
// 类                       功能                                   使用方法
//ByteArryOutputStream     允许将内存的缓冲区当作OutputStream       提供一个字节数组作为构造器参数
//FileOutputStream           将信息写入文件                        构造器的参数是一个表示文件名的字符串
//PipedOutputStream          与其他线程中的输入流相连,实现管道        构造器的参数是PipedInputStream的实例
//FilterOutputStream         抽象类,仅提供一个接口用于说明为其他      其子类的构造参数一般是其他OutputStream类的实例   
//                          OutputStream提供哪些有用的功能
//FileOutputStream(String name):按给定的文件名构造对象
//FileOutputStream(File file):为以File对象指定的文件构造对象
//对于FileInputStream来说,不能从一个不存在的文件中读取信息,但对于同一文件可以在其上打开两个以上输入流
//而FileOutputStream可以打开一个不存在的文件,但是两个输出流不能同时