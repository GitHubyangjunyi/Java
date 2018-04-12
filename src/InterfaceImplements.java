
interface Action {
	String name = "A person";//隐式声明为public static final,所以不可改写,可以被Person类使用

	public void walk();

	public void run();
}

class Person implements Action {
	private int age;
	private int birthday;

	/*public static void setName() {
		name = "xx";
	}*/

	public void walk() {
		System.out.println(name + "is walking");
	}

	public void run() {
		System.out.println(name + "is running");
	}

	public void show() {
		System.out.println("age:" + this.age + "birthday:" + this.birthday);
	}
}

public class InterfaceImplements {
	public static void main(String[] args) {
		Action man = new Person();//上溯造型对象(多态)
		//Action.name = "xx";//隐式声明为public static final,所以不可改写
		man.walk();
		man.run();
	}
}
//接口特性
//接口中的方法可以有参数列表和返回值,但不能有任何实现
//接口中可以包含属性,但是会被隐式声明为public static final,存储在该接口的静态存储区内,不属于该接口
//接口中的方法可以public也可以不声明为public,都会按public处理
//如果没有实现接口中的所有方法,那么创建的还是接口,接口继承接口(使用extends)
//一个接口可以继承多个接口,一个类可以在继承父类的同时实现多个接口
//接口中的方法必须是抽象方法
//一个抽象类的实现只能由子类给出,这个实现是以继承为基础的,由于Java单继承,所有有局限性
//接口具有多重继承的优势,使得任何一个实现接口的类,都可看作是这个接口的类型
//而一个类可以实现多个接口,从而这个类就可以看作多种类型