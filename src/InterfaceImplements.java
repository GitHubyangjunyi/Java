
interface Action {
	String name = "A person";//��ʽ����Ϊpublic static final,���Բ��ɸ�д,���Ա�Person��ʹ��

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
		Action man = new Person();//�������Ͷ���(��̬)
		//Action.name = "xx";//��ʽ����Ϊpublic static final,���Բ��ɸ�д
		man.walk();
		man.run();
	}
}
//�ӿ�����
//�ӿ��еķ��������в����б�ͷ���ֵ,���������κ�ʵ��
//�ӿ��п��԰�������,���ǻᱻ��ʽ����Ϊpublic static final,�洢�ڸýӿڵľ�̬�洢����,�����ڸýӿ�
//�ӿ��еķ�������publicҲ���Բ�����Ϊpublic,���ᰴpublic����
//���û��ʵ�ֽӿ��е����з���,��ô�����Ļ��ǽӿ�,�ӿڼ̳нӿ�(ʹ��extends)
//һ���ӿڿ��Լ̳ж���ӿ�,һ��������ڼ̳и����ͬʱʵ�ֶ���ӿ�
//�ӿ��еķ��������ǳ��󷽷�
//һ���������ʵ��ֻ�����������,���ʵ�����Լ̳�Ϊ������,����Java���̳�,�����о�����
//�ӿھ��ж��ؼ̳е�����,ʹ���κ�һ��ʵ�ֽӿڵ���,���ɿ���������ӿڵ�����
//��һ�������ʵ�ֶ���ӿ�,�Ӷ������Ϳ��Կ�����������