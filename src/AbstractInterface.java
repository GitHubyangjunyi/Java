
interface Figure1 {// 含有抽象方法所以称为抽象类
	public abstract double calculateArea();// 抽象方法

	public void showArea();
}

class Rectangular1 implements Figure1 {
	private double length;
	private double width;

	public Rectangular1(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {// 实现抽象方法
		double area = length * width;
		return area;
	}

	@Override
	public void showArea() {
		double area = calculateArea();
		System.out.println("此图形的面积为" + area);
	}
}

public class AbstractInterface {

	public static void main(String[] args) {
		Figure1 f = new Rectangular1(5, 6);// 上溯造型对象(多态)
		// 生成Rectangular对象并把它的引用返回到Figure型的变量中
		f.showArea();
		Rectangular1 r = new Rectangular1(7, 8);
		r.showArea();
	}
}
// Java中允许在类中声明只有方法声明而不提供实现的抽象方法,含有一个或多个抽象方法的类称为抽象类
// 抽象类也可以没有抽象方法,用来防止实例化对象
// 抽象类不能被实例化
// 因为没有实现所以抽象只能用于普通方法而不能用于静态方法和构造方法
// 接口中的方法必须是抽象方法
// 一个抽象类的实现只能由子类给出,这个实现是以继承为基础的,由于Java单继承,所有有局限性
// 接口具有多重继承的优势,使得任何一个实现接口的类,都可看作是这个接口的类型
// 而一个类可以实现多个接口,从而这个类就可以看作多种类型