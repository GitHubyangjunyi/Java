
public class MathTest {
    public static int intAbs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static double doubleAbs(double x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static boolean isPrime(int x) {
        if (x<2) 
            return false;
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) 
                return false;
        }
        return true;
    }
}