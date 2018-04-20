
abstract class Figure {// 含有抽象方法所以称为抽象类
	public abstract double calculateArea();// 抽象方法

	public void showArea() {
		double area = calculateArea();
		System.out.println("此图形的面积为" + area);
	}
}

class Rectangular extends Figure {
	private double length;
	private double width;

	public Rectangular(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {// 实现抽象方法
		double area = length * width;
		return area;
	}
}

public class AbstractExtends {

	public static void main(String[] args) {
		Figure f = new Rectangular(5, 6);// 上溯造型对象(多态)
		// 生成Rectangular对象并把它的引用返回到Figure型的变量中
		f.showArea();
		Rectangular r = new Rectangular(7, 8);
		r.showArea();
	}
}
// Java中允许在类中声明只有方法声明而不提供实现的抽象方法,含有一个或多个抽象方法的类称为抽象类
// 抽象类也可以没有抽象方法,用来防止实例化对象
// 抽象类不能被实例化
// 因为没有实现所以抽象只能用于普通方法而不能用于静态方法和构造方法