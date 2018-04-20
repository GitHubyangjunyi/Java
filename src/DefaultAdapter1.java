interface Target {
	void f1();

	void f2();

	void f3();

	void f4();

	void f5();
}

class DefaultAdapter implements Target {
	@Override
	public void f1() {
	}

	@Override
	public void f2() {
	}

	@Override
	public void f3() {
	}

	@Override
	public void f4() {
	}

	@Override
	public void f5() {
	}
}

class MyInteresting extends DefaultAdapter {
	@Override
	public void f5() {
		System.out.println("只实现第五的方法");
	}
}

public class DefaultAdapter1 {

	public static void main(String[] args) {
		MyInteresting obj = new MyInteresting();
		obj.f5();
		obj.f1();
	}
}
//默认适配器模式:
//声明方法的任务由接口承担,同时给出一个抽象类,且空实现这个接口的所有方法
//而其他同属于这个抽象类型的具体类可以选择实现这个接口
//也可以选择继承这个抽象类重写实现若干方法
//实际应用中可以将接口放在最底层,在抽象类中实现接口的各个方法,进而让子类继承实现