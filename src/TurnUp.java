import java.util.*;

interface Shape1 {
	public void erase();
}

class Circlr1 implements Shape1 {
	@Override
	public void erase() {
		System.out.println("Circlr1.erase");
	}
}

class Line1 implements Shape1 {
	@Override
	public void erase() {
		System.out.println("Line1.erase");
	}
}

class Eraser {
	void cleanBoard(Shape1 s) {// 运行时绑定
		s.erase();
	}
}

public class TurnUp {
	public static void main(String[] args) {
		Eraser eraser = new Eraser();
		Line1 line1 = new Line1();
		Circlr1 circlr1 = new Circlr1();
		eraser.cleanBoard(line1);
		eraser.cleanBoard(circlr1);
		System.out.println("向上转型带来的问题");
		PrivateOveride po = new PublicOveride();
		// po.fm();//fm不可见
		po.f();
		System.out.println("后期绑定");
		System.out.println("请输入要读入U盘的字符串");
		USB usb1 = new USB();
		Device d1 = new Upan();
		Device d2 = new MP3();
		usb1.readdata(d1);
		usb1.readdata(d2);
	}

}

// 由于继承关系的存在,对象既可以作为自己本身的类型使用,也可以作为父类型使用
// 这种将对象的引用视为对其父类类型引用的做法称为向上转型
// 使用向上转型,不管有多少个类实现了Shape1的接口,都不需要修改Eraser类,实现多态
// 增加了一个Line1类,也实现了Shape1的接口,但不需要改动Eraser类
// 向上转型也可能带来问题,如下
class PrivateOveride {
	private void fm() {// private方法自动认为就是final方法,不允许重写,所以子类中的fm()是一个全新的方法
		System.out.println("PrivateOveride private fm");// 向上转型调用子类的方法就会出错
	}

	protected void f() {
		fm();
		System.out.println("PrivateOveride public f");
	}
}

class PublicOveride extends PrivateOveride {
	public void fm() {
		System.out.println("PublicOveride public fm");
	}

	@Override
	protected void f() {
		fm();
		super.f();
		System.out.println("PublicOveride public f");
	}
}

// private方法自动认为就是final方法,不允许重写,所以子类中的fm()是一个全新的方法
// 向上转型调用子类的方法就会出错
// 多态允许从同一父类继承下来的子类之间能够根据方法行为的不同实现而表现出彼此的区别
// 可以将从父类继承下来的多种子类类型视为同一父类类型来处理,参考Shape1以及InterfaceImplements2.java
// 将一个方法调用同一个方法主体关联起来称为绑定
// 若在程序执行前进行绑定称为前期绑定,由编译器和链接器实现,是面向过程语言默认的绑定方式
abstract class Device {
	String data;

	public abstract void dataread();
}

// class Camera extends Device {
// public void dataread() {
// Scanner in = new Scanner(System.in);
// String data = in.next();
// System.out.println("Camera读入数据为:" + data);
// }
// }

class MP3 extends Device {
	@Override
	public void dataread() {
		Scanner in = new Scanner(System.in);
		String data = in.next();
		in.close();// 避免出现异常注释掉
		System.out.println("MP3读入数据为:" + data);
	}
}

class Upan extends Device {
	@Override
	public void dataread() {
		Scanner in = new Scanner(System.in);
		String data = in.next();
		in.close();// 避免出现异常注释掉
		System.out.println("Upan读入数据为:" + data);
	}
}

class USB {
	public void readdata(Device d) {
		d.dataread();
	}
}
// Java中除了static和final方法之外,都是后期绑定的,而且自动发生