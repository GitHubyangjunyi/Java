package test;

public class Test1 {
    public String name = "xxx";

    private class Ine {
        String name = "xix";

        void show() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Ine inr = new Test1().new Ine();
        System.out.println(inr.name);
        inr.show();
    }

}