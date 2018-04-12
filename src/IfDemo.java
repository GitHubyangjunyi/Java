import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("请输入你的分数:");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if (num >= 60) {
            System.out.println("成绩及格!");
        } else {
            System.out.println("成绩不及格!");
        }
        input.close();
    }
}