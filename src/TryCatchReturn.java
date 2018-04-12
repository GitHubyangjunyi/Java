
class TestReturn {
    public String xy() {
        try {
            int array[] = { 1, 2, 3 };
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常:数组越界");
            return "xxx";
        } finally {//无论有无异常都会执行,在tyr-catch语句块中的return也就不会真正从函数中跳出,变成将控制权转到finally块中
            System.out.println("finally块执行");
            //return "yyy";
        }
        return "yyy";
    }
}

public class TryCatchReturn {
    public static void main(String[] args) {
        TestReturn r = new TestReturn();
        String s = r.xy();
        System.out.println(s);
    }
}