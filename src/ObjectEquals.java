
class ObjectA {
    private int i;

    public ObjectA(int n) {
        i = n;
    }

    public boolean equals(Object o) {//��д�жϹ���
        if (o instanceof ObjectA) {//instanceof�ؼ���,o�ǲ���ObjectA�Ķ���
            if (i == ((ObjectA) o).i) {
                return true;
            }
        }
        return false;
    }
}

public class ObjectEquals {
    public static void main(String[] args) {
        ObjectA r1 = new ObjectA(1);
        ObjectA r2 = r1;
        System.out.println("r1,r2Ϊͬһ����ʱ");
        System.out.println("r2==r1:" + (r2 == r1));
        System.out.println("r2.equals(r1):" + (r2.equals(r1)));
        r2 = new ObjectA(1);
        System.out.println("r1����,r2Ϊi=1���¶���ʱ");
        System.out.println("r2==r1:" + (r2 == r1));
        System.out.println("r2.equals(r1):" + (r2.equals(r1)));
        r2 = new ObjectA(2);
        System.out.println("r1����,r2Ϊi=2���¶���ʱ");
        System.out.println("r2==r1:" + (r2 == r1));
        System.out.println("r2.equals(r1):" + (r2.equals(r1)));
        String s1 = "xxx";
        String s2 = "xxx";
        String s3 = new String("xxx");
        System.out.println("s1==s2:" + s1 == s2);
        System.out.println("s1==s3:" + s1 == s3);
        System.out.println("s1.equals(s3):" + s1.equals(s3));
    }

}
//�����Ƿ���ȺͶ����Ƿ������������ͬ�ĸ���
//�����Ƿ���ȵ��жϱ�׼�����������Ƿ�ָ��ͬһ������,�жϷ���Ϊ"����1==����2"
//�����������ָ��ͬһ������,���ʽ"����1==����2"Ϊtrue
//���������Ƿ������һ������equals()����
//Java�е��඼�̳�Object��ķ���,��Object������һ����Ҫ�ķ���public boolean equals(Object o)
//�÷������������ж�Ŀ��o�����õĶ����Ƿ��뱾�������,��ȷ���true
//��������ʱ��������¶���÷�����ʵ���жϹ���,���������жϹ���ִ��
//instanceof�ؼ��ֵ��������ж�ĳ�������Ƿ����ĳ������,���Ϸ���true