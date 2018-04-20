
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

	public Cat(String name, String catname) {//����ʽ���ø��๹�췽��
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
		Cat cat = new Cat();//ʵ����ʱ����ø���Ĺ��췽��
		//������Ϊ���û����ȷʹ��super�ؼ���,���๹�췽���л���ʽʹ��super()���ø����Ĭ�Ϲ��췽�����ҵ�һ��ִ��
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
//������Լ̳и����з���Ȩ������Ϊpublic/protected/default�ĳ�Ա���Ժͳ�Ա����
//�����ܼ̳�Ȩ��δprivate��˽�г�Ա���Ժͳ�Ա����,�Ҳ��ܼ̳и���Ĺ��췽��
//��������Լ������˹��췽��,��û��ʹ��Ĭ�ϵĹ��췽��,���಻��ʹ�ø���Ĺ��췽��
//��һ������ʹ��super()ʱ���ǵ���ֱ�Ӹ�����޲����Ĺ��췽��
//���಻�ܼ̳и���Ĺ��췽��,Ҫ���ø���Ĺ��췽�����������๹�췽���������һ��ʹ��super()
//super�������ñ��������صĸ����Ա
//�������ø���Ĺ��췽��
//ֻ�е����෽���ǿɷ��ʵ�,���������д�÷���,��������д����ʱȨ�޲�����С,��������д���������׳����쳣