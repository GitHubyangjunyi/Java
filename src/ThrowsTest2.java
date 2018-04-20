
public class ThrowsTest2 {
    static int x=0;
    static int y=0;
    public static void testEx() throws ArithmeticException {
        if (x!=0) {
            y=100/x;
        }
        else{
            throw new ArithmeticException("除数为零的异常");
        }
    }
        public static void main(String[] args) {
            try {
                testEx();
                System.out.println("xxxx");//这一语句不会执行
            } catch (ArithmeticException e) {
                System.out.println("除数不能为零");
            }
        }
    }
//关键字throws用来标明一个方法可能抛出的异常,大多数异常处理程序采用主动抛出异常的方式,throws是被动处理异常的方式
//方法抛出的异常是throws子句中指定的异常类或其子类对象
//从Error类和RuntimeException类中派生出来的异常不需要在方法声明中指定,这两类异常属于Java不检查异常,无法干预
//Java中另外一类异常是检查异常,即在程序中应该被处理的异常,程序可以完全避免的异常,比如除零异常
//而throws异常说明必须指定有可能发生的要检查的异常
//testEx()并没有处理异常,而是通过throws将异常抛给调用者,作为调用者的main()方法处理异常