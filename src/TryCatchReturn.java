
class TestReturn {
    @SuppressWarnings("finally")
	public String xy() {
        try {
            int array[] = { 1, 2, 3 };
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常:数组越界");
            return "xxx";
        } finally {
            System.out.println("finally块执行");
            return "yyy";
        }
    }
}

public class TryCatchReturn {
    @SuppressWarnings("finally")
	public static void main(String[] args) {
        TestReturn r = new TestReturn();
        String s = r.xy();
        System.out.println(s);
        try {
            System.out.println("x");
            return;

        } catch (Exception e) {
            System.out.println("y");
            return;
        } finally {
            System.out.println("z");
            return;
        }
    }
}//无论有无异常都会执行,在try-catch语句块中的return也就不会真正从函数中跳出,变成将控制权转到finally块中
//但可以使用System.exit(0);退出try块而不执行finally