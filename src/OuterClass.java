
public class OuterClass {
    private int count = 6;

    public void doInner(final int finalint) {
        int size = 33;//临时局部变量size
        class InnerClass {
            public String output() {//对局部变量size访问非法
                return ("外部类count=" + count + "\n" + "局部变量size=" + size + "\n" +"参数finalint=" + finalint);//局部变量能访问到书上说访问不了???
            }
        }
        InnerClass inner = new InnerClass();
        System.out.println(inner.output());
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.doInner(9);
    }
}
//外部类语句块中定义的内部类访问语句块中的局部变量示例
//内部类可以在外部类的一个方法体中定义,这时内部类可以访问方法体中的局部变量
//但只限于在该语句块运行期内,当该方法结束运行时,内部类的对象将不能访问
//在外部类方法块中定义的内部类只能用于定义它的语句块中创建内部类的对象
//对应内部类的类名不能出现在定义它的语法块之外