package practice;

	class Mammal {
		public Mammal(int legs) {
			System.out.println("����һֻ"+legs+"�ȵĲ��鶯��!");
	}

		public void call() {
			System.out.println("���鶯���ǻ�е�!");
	}
}

	class Cat extends Mammal{
		public Cat(int legs) {
			super(legs);
		}

		public void call() {
			super.call();
			System.out.println("è��������!");
		}
	}

	class Dog extends Mammal{
		public Dog(int legs) {
			super(legs);
		}

		public void call() {
			super.call();
			System.out.println("����������!");
		}
	}

	class Sheep extends Mammal{
		public Sheep(int legs) {
			super(legs);
		}
		
		public void call() {
			super.call();
			System.out.println("���������!");
		}
	}
	
	public class TestOverride{
		
		public static void main(String[] args) {
			Cat cat=new Cat(4);
			System.out.println("è��Ľ���!");
			cat.call();
			System.out.println("----���Ľ�������----");
			Dog dog=new Dog(4);
			System.out.println("�����Ľ���!");
			dog.call();
			System.out.println("----��Ľ�������----");
			Sheep sheep=new Sheep(4);
			System.out.println("��Ľ���!");
			sheep.call();
			
		}
	}