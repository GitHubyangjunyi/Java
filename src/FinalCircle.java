class FinalCircle {
	private final double PI = 3.14;
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return PI * this.radius * this.radius;
	}

	public static void main(String[] args) {
		FinalCircle circle = new FinalCircle();
		circle.setRadius(2);
		System.out.println(circle.area());
	}
}
// final修饰的类不能被继承
// final修饰的值不能被修改,变量被声明为final时必须初始化
// final修饰的方法不能被重写
// 对象声明为final时该对象的引用不能被修改,但属性值可以改变