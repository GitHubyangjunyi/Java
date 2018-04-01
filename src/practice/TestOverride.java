package practice;

	class Mammal {
		public Mammal(int legs) {
			System.out.println("ÎÒÊÇÒ»Ö»"+legs+"ÍÈµÄ²¸Èé¶¯Îï!");
	}

		public void call() {
			System.out.println("²¸Èé¶¯ÎïÊÇ»á½ĞµÄ!");
	}
}

	class Cat extends Mammal{
		public Cat(int legs) {
			super(legs);
		}

		public void call() {
			super.call();
			System.out.println("Ã¨ßäß÷ß÷½Ğ!");
		}
	}

	class Dog extends Mammal{
		public Dog(int legs) {
			super(legs);
		}

		public void call() {
			super.call();
			System.out.println("¹·¹·ÍôÍô½Ğ!");
		}
	}

	class Sheep extends Mammal{
		public Sheep(int legs) {
			super(legs);
		}
		
		public void call() {
			super.call();
			System.out.println("ÑòÊÇßãßã½Ğ!");
		}
	}
	
	public class TestOverride{
		
		public static void main(String[] args) {
			Cat cat=new Cat(4);
			System.out.println("Ã¨ßäµÄ½ĞÉù!");
			cat.call();
			System.out.println("----¹·µÄ½ĞÉùÃèÊö----");
			Dog dog=new Dog(4);
			System.out.println("¹·¹·µÄ½ĞÉù!");
			dog.call();
			System.out.println("----ÑòµÄ½ĞÉùÃèÊö----");
			Sheep sheep=new Sheep(4);
			System.out.println("ÑòµÄ½ĞÉù!");
			sheep.call();
			
		}
	}