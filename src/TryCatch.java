
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
            System.out.println("�����쳣");
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("����Խ���쳣");
        } catch (Exception ex3) {
            System.out.println(ex3.getMessage());
        }
        finally{//���������쳣����ִ��,��tyr-catch�����е�returnҲ�Ͳ��������Ӻ���������,��ɽ�����Ȩת��finally����
            System.out.println("finally��ִ��");
        }
    }
}
