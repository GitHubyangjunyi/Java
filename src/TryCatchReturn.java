
class TestReturn {
    @SuppressWarnings("finally")
	public String xy() {
        try {
            int array[] = { 1, 2, 3 };
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�쳣:����Խ��");
            return "xxx";
        } finally {
            System.out.println("finally��ִ��");
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
}//���������쳣����ִ��,��try-catch�����е�returnҲ�Ͳ��������Ӻ���������,��ɽ�����Ȩת��finally����
//������ʹ��System.exit(0);�˳�try�����ִ��finally