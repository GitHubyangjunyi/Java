
class TestReturn {
    public String xy() {
        try {
            int array[] = { 1, 2, 3 };
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�쳣:����Խ��");
            return "xxx";
        } finally {//���������쳣����ִ��,��tyr-catch�����е�returnҲ�Ͳ��������Ӻ���������,��ɽ�����Ȩת��finally����
            System.out.println("finally��ִ��");
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