// import java.util.Scanner;

// public class ExceptionSelfDefined {
// public static void main(String[] args) {
//     try {
//         Scanner in=new Scanner(System.in);
//         int length=in.nextInt();
//         int width=in.nextInt();
//         in.close();
//         if (length<=3||length>=10||width<=2||width>=6) {
//             throw new InputException("输入数值不在指定范围内");
//         }
//         System.out.println("面积为:"+length*width);
//     } catch (NumberFormatException nfe) {
//         System.out.println("你输入的是字符,请重新输入数值");
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
//自定义异常不可能靠系统自动抛出,必须通过throw语句抛出
//程序自定义了异常类,通过构造方法初始化错误提示信息