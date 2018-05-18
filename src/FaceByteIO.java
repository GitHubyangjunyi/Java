import java.io.*;
//��ȡӲ���ϵ�һ���ļ�������,���临�Ƶ���һ�ļ���,Ч�ʵ�
public class FaceByteIO {
    public static void main(String[] args) {
        String from = "./targetfile/in.txt";
        String to="./targetfile/out.txt";
        FileInputStream in=null;//�������ļ����������
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
// InputStream������Щ�Ӳ�ͬ����Դ�����������
// ��Щ����Դ����:
//              �ڴ��е��ֽ�����
//              String����
//              �ļ�
//              �ܵ�
//              ������������ɵ�����
//              ��������Դ,����������
// ������������Դ������Ӧ��InputStream������
// InputStream��Ϊ���������ֽڵ��������ĸ���,ӵ����Ϊread()�Ļ�����������������̳�
// ����һ�����ʹ��,����ʹ���������ṩ����������
// InputStream������
// ��                       ����                                   ʹ�÷���
//ByteArrayInputStream      �����ڴ�Ļ���������InputStream       �ṩһ���ֽ�������Ϊ����������
//StringBufferInputStream   ����һ���ַ���ת����InputStream       �ַ�����Ϊ�������Ĳ���
//FileInputStream           ���ļ��ж�ȡ��Ϣ                       �������Ĳ�����һ����ʾ�ļ������ַ���
//PipedInputStream          �������߳��е����������,ʵ�ֹܵ�        �������Ĳ�����PipedOutputStream��ʵ��
//FilterInputStream         ������,���ṩһ���ӿ�����˵��Ϊ����      ������Ĺ������һ��������InputStream���ʵ��   
//                          InputStream�ṩ��Щ���õĹ���
//FileInputStream��Ҳ��InputStream���һ������,�ļ�������
//FileInputStream(String name):���������ļ����������
//FileInputStream(File file):Ϊ��File����ָ�����ļ��������
//�ڶ��ַ����������ļ���ȡǰ���з�������,�����ļ��Ƿ����
//
//OutputStream�����ΪӦ�ó����ṩ�����������
// OutputStream������
// ��                       ����                                   ʹ�÷���
//ByteArryOutputStream     �����ڴ�Ļ���������OutputStream       �ṩһ���ֽ�������Ϊ����������
//FileOutputStream           ����Ϣд���ļ�                        �������Ĳ�����һ����ʾ�ļ������ַ���
//PipedOutputStream          �������߳��е�����������,ʵ�ֹܵ�        �������Ĳ�����PipedInputStream��ʵ��
//FilterOutputStream         ������,���ṩһ���ӿ�����˵��Ϊ����      ������Ĺ������һ��������OutputStream���ʵ��   
//                          OutputStream�ṩ��Щ���õĹ���
//FileOutputStream(String name):���������ļ����������
//FileOutputStream(File file):Ϊ��File����ָ�����ļ��������
//����FileInputStream��˵,���ܴ�һ�������ڵ��ļ��ж�ȡ��Ϣ,������ͬһ�ļ����������ϴ���������������
//��FileOutputStream���Դ�һ�������ڵ��ļ�,�����������������ͬʱ