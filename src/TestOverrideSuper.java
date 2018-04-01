
	class Mammal {
		public  String name="Mamal";
		public Mammal(int legs) {
			System.out.println("Mammal hava "+legs+" legs");
	}
		public void call() {
			System.out.println("Mammal.call");
	}
}

	class Cat extends Mammal{
		private String name;
		public Cat(String name,String catname,int legs) {
			super(legs);
			super.name=name;
			this.name=catname;
		}
		public void call() {
			super.call();
			System.out.println("super.name:"+super.name+"    "+"this.name:"+this.name);
		}
	}

	class Dog extends Mammal{
		private String name;
		public Dog(String name,String dogname,int legs) {
			super(legs);
			super.name=name;
			this.name=dogname;
		}
		public void call() {
			super.call();
			System.out.println("super.name:"+super.name+"    "+"this.name:"+this.name);
		}
	}

	class Sheep extends Mammal{
		private String name;		
		public Sheep(String name,String sheepname,int legs) {
			super(legs);
			super.name=name;
			this.name=sheepname;
		}
		
		public void call() {
			super.call();
			System.out.println("super.name:"+super.name+"    "+"this.name:"+this.name);
		}
	}
	
	public class TestOverrideSuper{
		
		public static void main(String[] args) {
			System.out.println("----Cat----");
			Cat cat=new Cat("mname1","catname1",4);
			cat.call();
			System.out.println("----Dog----");
			Dog dog=new Dog("mname2","dogname2",4);
			dog.call();
			System.out.println("----Sheep----");
			Sheep sheep=new Sheep("mname3","sheepname3",4);
			sheep.call();
			
		}
	//用来调用父类的构造方法
	}
	//之类不能继承父类的构造方法,要调用父类的构造方法必须在子类构造方法方法体第一行使用super()
	//super用来调用被子类隐藏的父类成员