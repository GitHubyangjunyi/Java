//可以网上搜索下Java内部类的意义
//知乎上有
class Output {
	private static int count = 0;

	public static class Count {// 内部类
		void show() {
			System.out.println("学生数量为" + count);
		}
	}

	public class Student {// 内部类
		String name;

		public Student(String str) {
			name = str;
			count++;
		}

		public void show() {
			System.out.println("我的名字是" + name);
			System.out.println("学生数量为" + count);
		}
	}

	public void display() {
		Student stu = new Student("xxx");
		stu.show();
	}

	public void fun() {
		class Funclass {// 局部类
			void show() {
				System.out.println("局部类的方法");
			}
		}
		Funclass fc = new Funclass();
		fc.show();
	}
}

public class InnerClass2 {
	public static void main(String[] args) {
		Output.Student stud = new Output().new Student("yyy");// 双new法实例化对象
		stud.show();
		Output.Count cou = new Output.Count();
		cou.show();
		Output ou = new Output();
		ou.display();
		ou.fun();
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