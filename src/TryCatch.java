
class TryCatchTest {
    int x;
    int y;
}

public class TryCatch {
    public static void main(String[] args) {
        int z = 0;
        System.out.println(z);
        String person[] = { "zahngsan", "lishi", "wangwu" };
        try {
            TryCatchTest tryCatchTest = new TryCatchTest();
            tryCatchTest.x = 1;
            tryCatchTest.y = 1;
            if (tryCatchTest.y == 0) {
                z = 3 / tryCatchTest.x;
            } else {
                for (int i = 0; i < 6; i++) {
                    System.out.println(person[i]);
                }
            }
        } catch (ArithmeticException ex1) {
            System.out.println("除零异常");
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("数组越界异常");
        } catch (Exception ex3) {
            System.out.println(ex3.getMessage());
        }
        finally{//无论有无异常都会执行,在tyr-catch语句块中的return也就不会真正从函数中跳出,变成将控制权转到finally块中
            System.out.println("finally块执行");
        }
    }
}
