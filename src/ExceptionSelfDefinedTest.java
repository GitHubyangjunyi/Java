
public class ExceptionSelfDefinedTest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        try {
            if (30 <= x && x <= 80 && 30 <= y && y <= 80) {
                System.out.println(x / y);
            } else {
                throw new MyException("输入的数据超出范围,请重新输入!");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}

class MyException extends Exception {
    private static final long serialVersionUID = -1961369299450803718L;

    public MyException() {

    }

    public MyException(String str) {
        super(str);
    }
}