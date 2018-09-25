interface PCI {// 接口定义

	public void start();

	public void stop();

}

class SoundCard implements PCI {// SoundCard实现PCI接口

	public void start() {
		System.out.println("SoundCardstart");
	}

	public void stop() {
		System.out.println("SoundCardstop");
	}
}

class GraphicsCard implements PCI {// GraphicsCard实现PCI接口
	public void start() {
		System.out.println("GraphicsCardstart");
	}

	public void stop() {
		System.out.println("GraphicsCardstop");
	}
}

public class AnonymousClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoundCard sc = new SoundCard();

		GraphicsCard ggc = new GraphicsCard();

		PCI AnonymousClassObj = new PCI() {// 匿名内部类实现，对象AnonymousClassObj
			public void start() {
				System.out.println("AnonymousClass");
			}

			public void stop() {
				System.out.println("AnonymousClass");
			}
		};

		ss(AnonymousClassObj);
		ss(sc);
		ss(ggc);
	}

	static void ss(PCI i) {
		i.start();
		i.stop();
	}
}
// 匿名类是不能有名称的类,所以没有办法直接引用,必须在创建时作为new语句的一部分来声明匿名类
// new<类或接口><类的主体>
// 这种形式的new语句床架一个新的匿名类,它对一个给定的类进行扩展或者实现一个接口
// 它还创建一个匿名类的实例并作为语句的结果返回
// 需要注意的是,匿名类的声明是在编译时进行的,实例化是在运行时进行的这意味着for循环
// 中的一个new语句会创建相同匿名类的几个实例,而不是创建几个不同匿名类的一个实例
// 匿名类可以视为非静态的内部类,因为它们具有和方法内部声明的非静态内部类一样的权限和限制
