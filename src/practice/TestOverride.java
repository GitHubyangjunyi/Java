package practice;

	class Mammal {
		public Mammal(int legs) {
			System.out.println("我是一只"+legs+"腿的哺乳动物!");
	}

		public void call() {
			System.out.println("哺乳动物是会叫的!");
	}
}

	class Cat extends Mammal{
		public Cat(int legs) {
			super(legs);
		}

		public void call() {
			super.call();
			System.out.println("猫咪喵喵叫!");
		}
	}

	class Dog extends Mammal{
		public Dog(int legs) {
			super(legs);
		}

		public void call() {
			super.call();
			System.out.println("狗狗汪汪叫!");
		}
	}

	class Sheep extends Mammal{
		public Sheep(int legs) {
			super(legs);
		}
		
		public void call() {
			super.call();
			System.out.println("羊是咩咩叫!");
		}
	}
	
	public class TestOverride{
		
		public static void main(String[] args) {
			Cat cat=new Cat(4);
			System.out.println("猫咪的叫声!");
			cat.call();
			System.out.println("----狗的叫声描述----");
			Dog dog=new Dog(4);
			System.out.println("狗狗的叫声!");
			dog.call();
			System.out.println("----羊的叫声描述----");
			Sheep sheep=new Sheep(4);
			System.out.println("羊的叫声!");
			sheep.call();
			
		}
	}