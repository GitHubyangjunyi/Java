
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
        a = d;//这句话注释掉a和d的指向就不一样了
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
//无论使用那种数组,数组标识符都只是一个引用,指向在堆中创建的一个真实的对象
//数组对象用以保存指向其他对象的引用
//唯一区别就是对象数组保存的是引用,而基本类型的数组保存的是基本类型的值