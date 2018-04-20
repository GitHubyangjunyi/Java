
class Mammal {
	public String name = "Mamal";

	public Mammal() {
		System.out.println("Mammal StructFunction");
	}

	public Mammal(int legs) {
		System.out.println("Mammal StructFunction Mammal hava " + legs + " legs");
	}

	public void call() {
		System.out.println("Mammal.call");
	}
}

class Cat extends Mammal {
	public String name;

	public Cat() {
		System.out.println("Cat StructFunction");
	}

	public Cat(String name, String catname, int legs) {
		super(legs);
		super.name = name;
		this.name = catname;
	}

	public Cat(String name, String catname) {//会隐式调用父类构造方法
		super.name = name;
		this.name = catname;
	}

	@Override
	public void call() {
		super.call();
		System.out.println("Cat.call super.name:" + super.name + "    " + "this.name:" + this.name);
	}
}

class Dog extends Mammal {
	private String name;

	public Dog(String name, String dogname, int legs) {
		super(legs);
		super.name = name;
		this.name = dogname;
	}

	@Override
	public void call() {
		super.call();
		System.out.println("Dog.call super.name:" + super.name + "    " + "this.name:" + this.name);
	}
}

class Sheep extends Mammal {
	private String name;

	public Sheep(String name, String sheepname, int legs) {
		super(legs);
		super.name = name;
		this.name = sheepname;
	}

	@Override
	public void call() {
		super.call();
		System.out.println("Sheep.call super.name:" + super.name + "    " + "this.name:" + this.name);
	}
}

public class TestOverrideSuper {

	public static void main(String[] args) {
		System.out.println("----Cat----");
		Cat cat = new Cat();//实例化时会调用父类的构造方法
		//这是因为如果没有明确使用super关键字,子类构造方法中会隐式使用super()调用父类的默认构造方法并且第一个执行
		cat.name = "xxx";
		Cat cat1 = new Cat("mname1cat", "catname1");
		cat1.call();
		Cat cat2 = new Cat("mname11cat", "catname11");
		cat2.call();
		System.out.println("----Dog----");
		Dog dog = new Dog("mname2dog", "dogname2", 4);
		dog.call();
		System.out.println("----Sheep----");
		Sheep sheep = new Sheep("mname3sheep", "sheepname3", 4);
		sheep.call();
		Mammal c=new Cat();
		c.call();
	}
}
//子类可以继承父类中访问权限设置为public/protected/default的成员属性和成员方法
//但不能继承权限未private的私有成员属性和成员方法,且不能继承父类的构造方法
//如果父类自己定义了构造方法,即没有使用默认的构造方法,子类不能使用父类的构造方法
//当一个子类使用super()时就是调用直接父类的无参数的构造方法
//子类不能继承父类的构造方法,要调用父类的构造方法必须在子类构造方法方法体第一行使用super()
//super用来调用被子类隐藏的父类成员
//用来调用父类的构造方法
//只有当父类方法是可访问的,子类才能重写该方法,且子类重写方法时权限不能缩小,子类中重写方法不能抛出新异常