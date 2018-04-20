
public class InnerGetOuter {
	private int count;// 外部类成员变量

	public class Citizen {
		private int count;// 内部类成员变量,为初始化默认值为0

		public void output(int count) {
			count++;// 方法参数,局部变量
			this.count++;// 内部类成员变量
			InnerGetOuter.this.count++;// 外部类成员变量
			System.out.println("output方法中局部变量count为" + count);
			System.out.println("内部类的成员变量count为" + this.count);
			System.out.println("外部类的成员变量count为" + InnerGetOuter.this.count);
		}
	}

	Citizen citizen = new Citizen();// 创建内部类对象

	public void increase(int s) {
		citizen.output(s);// 调用内部类方法
	}

	public static void main(String[] args) {
		InnerGetOuter innerGetOuter = new InnerGetOuter();
		innerGetOuter.count = 5;// 设置外部类的成员变量count为5
		innerGetOuter.increase(5);
	}
}
// 访问了三个同名不同含义的count,所以外部类成员和内部类成员可以同名
// 内部类的访问权限与普通类和接口不同,可定为public/protected/private/默认
// 而普通类只能定义为public/默认两种
// 对于在外部类之外访问内部类,引用内部类名时必须使用完整限定名
// 创建内部类对象时必须与外部类相关联