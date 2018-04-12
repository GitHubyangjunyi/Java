package practice;

public class SwitchTwoNumberWithoutTemp {
    public static void main(String[] args) {
        int a = 10, b = 100;
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }

}