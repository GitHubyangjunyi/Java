
public class ArrayDemo {
    public static void main(String[] args) {
        Wee[] a = new Wee[] { new Wee(), new Wee() };
        Wee[] b = new Wee[4];
        Wee[] c = new Wee[3];
        Wee[] d = { new Wee(), new Wee(), new Wee() };
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new Wee();
            }
        }
        System.out.println("a.length=" + a.length);
        System.out.println("b.length=" + b.length);
        System.out.println("c.length=" + c.length);
        System.out.println("d.length=" + d.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
        a = d;//��仰ע�͵�a��d��ָ��Ͳ�һ����
        System.out.println("a.length=" + a.length);
        System.out.println("d.length=" + d.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "]=" + c[i]);
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "]=" + d[i]);
        }
    }

}

class Wee {

}
//����ʹ����������,�����ʶ����ֻ��һ������,ָ���ڶ��д�����һ����ʵ�Ķ���
//����������Ա���ָ���������������
//Ψһ������Ƕ������鱣���������,���������͵����鱣����ǻ������͵�ֵ