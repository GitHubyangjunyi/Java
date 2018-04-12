
class StaticTest {
    static int a = 23;
    static int b = 27;
    static int y = returny();
    public int publicint = 1;
    static private int privateint = 2;

    static int returny() {
        System.out.println("returny()执行!");
        return 55;
    }

    static void displaya() {
        System.out.println("a=" + a);
    }

    static void displayy() {
        System.out.println("y=" + y);
    }

    public void displayprivateint() {
        System.out.println("privateint=" + privateint);//类内可见
    }

    static {//static模块
        System.out.println("static block执行");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        //以下是第一种测试方法
        StaticTest.displaya();
        System.out.println("b=" + StaticTest.b);
        StaticTest.displayy();
        StaticTest sc = new StaticTest();//这句放最前面static也会进行有且仅有的一次初始化
        sc.publicint = 10;
        sc.displayprivateint();
        //sc.privateint=20;//不可见
        //以下是第二种测试方法
        //StaticTest sc=new StaticTest();
        //以下测试控制实例对象个数
        NetConnection nc1 = NetConnection.getNetConnection();
        System.out.println("nc1 " + nc1.getClass());
        NetConnection nc2 = NetConnection.getNetConnection();
        System.out.println("nc2 " + nc2.getClass());
        NetConnection nc3 = NetConnection.getNetConnection();
        System.out.println("nc3 " + nc3.getClass());
        NetConnection nc4 = NetConnection.getNetConnection();
        System.out.println("nc4 " + nc4.getClass());
        NetConnection nc5 = NetConnection.getNetConnection();
        System.out.println("nc5 " + nc5.getClass());
        NetConnection nc6 = NetConnection.getNetConnection();
        System.out.println("nc6 " + nc6.getClass());
        NetConnection nc7 = NetConnection.getNetConnection();
        System.out.println("nc7 " + nc7.getClass());
        NetConnection nc8 = NetConnection.getNetConnection();
        System.out.println("nc8 " + nc8.getClass());
        NetConnection nc9 = NetConnection.getNetConnection();
        System.out.println("nc9 " + nc9.getClass());
        NetConnection nc10 = NetConnection.getNetConnection();
        System.out.println("nc10 " + nc10.getClass());
        //NetConnection nc11 = NetConnection.getNetConnection();
        //System.out.println("nc11 " + nc11.getClass());
        //NetConnection nc12 = NetConnection.getNetConnection();
        //System.out.println("nc12 " + nc12.getClass());
    }
}

//使用static修饰类的成员使他们成为静态成员
//静态成员存储于类的存储区,属于整个类不属于具体的类对象
//被所有该类的对象所共有,在不同的类对象中访问静态成员,访问的时同一个
//静态成员的限制:
//1.只能调用其他static方法和属性
//2.不能使用this或super关键字
//3.static代码块将只被执行一次
//输出结果表明,在访问static成员时会发生static成员初始化过程,并且在建立对象时初始化过程不会重复
//也就是说当以任何方式第一次使用类时类初始化过程将会发生并只发生一次
//有时候类初始化不仅需要初始化静态成员还需执行一些其他代码,如果放在构造函数中则只会在创建对象时才会执行
//且每次实例化对象都会执行一次,没必要,所以采取加入static模块这种方式
//有时候视图控制某个类的对象个数,可以把构造方法定义为private类型
//这样只能在当前类中创建对象
class NetConnection {
    private final static int MAX_CONNECTION_NUM = 10;
    private static int connectionNum = 0;

    private NetConnection() {
        connectionNum++;
    }

    public static NetConnection getNetConnection() {
        if (connectionNum >= MAX_CONNECTION_NUM) {
            return null;
        } else {
            return new NetConnection();
        }
    }

    public void release() {
        connectionNum--;
    }
}