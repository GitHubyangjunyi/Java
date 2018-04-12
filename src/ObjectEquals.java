
class ObjectA {
    private int i;

    public ObjectA(int n) {
        i = n;
    }

    public boolean equals(Object o) {//重写判断规则
        if (o instanceof ObjectA) {//instanceof关键字,o是不是ObjectA的对象
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
        System.out.println("r1,r2为同一对象时");
        System.out.println("r2==r1:" + (r2 == r1));
        System.out.println("r2.equals(r1):" + (r2.equals(r1)));
        r2 = new ObjectA(1);
        System.out.println("r1不变,r2为i=1的新对象时");
        System.out.println("r2==r1:" + (r2 == r1));
        System.out.println("r2.equals(r1):" + (r2.equals(r1)));
        r2 = new ObjectA(2);
        System.out.println("r1不变,r2为i=2的新对象时");
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
//引用是否相等和对象是否相等是两个不同的概念
//引用是否相等的判断标准是两个引用是否指向同一个对象,判断方法为"引用1==引用2"
//如果两个引用指向同一个对象,表达式"引用1==引用2"为true
//两个对象是否相等则一般依据equals()方法
//Java中的类都继承Object类的方法,在Object类中有一个重要的方法public boolean equals(Object o)
//该方法的作用是判断目标o所引用的对象是否与本对象相等,相等返回true
//在设计类的时候可以重新定义该方法以实现判断规则,否则按上述判断规则执行
//instanceof关键字的作用是判断某个对象是否符合某个类型,符合返回true