
public class InnerClass {

	private int count;

	public class Student {
		String name;

		public Student(String str) {
			name = str;
			count++;
		}

		public void introduce() {
			System.out.println("我的名字是" + this.name);
		}
	}

	public void recognize(String name) {
		Student stu = new Student(name);
		stu.introduce();
		System.out.println("count=" + this.count);
	}

	public static void main(String[] args) {
		InnerClass depart = new InnerClass();
		depart.recognize("yyy");
	}
}
// 在Java1.1规范前,不支持在类中定义嵌套类,类只能是包中的成员而不能是类的成员
// Java1.1允许使用内部类和匿名类
// 内部类的特性
// 一般只用于定义它的类或语句块之间,在外部引用它时必须给出带有外部类名的完整限定名
// 且内部类的名字不必与外部类名称相同
// 可以是抽象类
// 可以声明为private/protected
// 可以声明为static,这时内部类成为顶层类,相当于放在外面并且不再是内部类,且不能引用外部类的对象
// 如果内部类声明有static成员,则内部类必须声明为static
// 可以使用外部类的静态成员变量或实例成员变量
// 可以定义在外部类的成员方法中,该方法的局部变量或参数只有是final类型时才可以被内部类使用