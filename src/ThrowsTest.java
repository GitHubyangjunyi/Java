
public class ThrowsTest {
	public static boolean testEx() throws Exception {
		int b = 12;
		for (int i = 2; i >= 0; i--) {
			int c = b / i;
			System.out.println(c);
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			testEx();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
// 关键字throws用来标明一个方法可能抛出的异常,大多数异常处理程序采用主动抛出异常的方式,throws是被动处理异常的方式
// 方法抛出的异常是throws子句中指定的异常类或其子类对象
// 从Error类和RuntimeException类中派生 出来的异常不需要在方法声明中指定,这两类异常属于Java不检查异常,无法干预
// Java中另外一类异常是检查异常,即在程序中应该被处理的异常,程序可以完全避免的异常,比如除零异常
// 而throws异常说明必须指定有可能发生的要检查的异常
// testEx()并没有处理异常,而是通过throws将异常抛给调用者,作为调用者的main()方法处理异常