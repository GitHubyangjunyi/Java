// import java.util.Scanner;

// public class ExceptionSelfDefined {
// public static void main(String[] args) {
//     try {
//         Scanner in=new Scanner(System.in);
//         int length=in.nextInt();
//         int width=in.nextInt();
//         in.close();
//         if (length<=3||length>=10||width<=2||width>=6) {
//             throw new InputException("������ֵ����ָ����Χ��");
//         }
//         System.out.println("���Ϊ:"+length*width);
//     } catch (NumberFormatException nfe) {
//         System.out.println("����������ַ�,������������ֵ");
//     }
//     catch (InputException ipe) {
//         System.out.println(ipe.getMessage());
//     }
// }
// }

// class InputException extends Exception{
//     public InputException(){

//     }

//     public InputException(String str){
//         super(str);
//     }
// }
//�Զ����쳣�����ܿ�ϵͳ�Զ��׳�,����ͨ��throw����׳�
//�����Զ������쳣��,ͨ�����췽����ʼ��������ʾ��Ϣ