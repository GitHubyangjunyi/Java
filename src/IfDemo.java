import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("��������ķ���:");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if (num >= 60) {
            System.out.println("�ɼ�����!");
        } else {
            System.out.println("�ɼ�������!");
        }
        input.close();
    }
}