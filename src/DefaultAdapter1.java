interface Target {
	void f1();

	void f2();

	void f3();

	void f4();

	void f5();
}

class DefaultAdapter implements Target {
	public void f1() {
	}

	public void f2() {
	}

	public void f3() {
	}

	public void f4() {
	}

	public void f5() {
	}
}

class MyInteresting extends DefaultAdapter {
	public void f5() {
		System.out.println("ֻʵ�ֵ���ķ���");
	}
}

public class DefaultAdapter1 {

	public static void main(String[] args) {
		MyInteresting obj = new MyInteresting();
		obj.f5();
		obj.f1();
	}
}
//Ĭ��������ģʽ:
//���������������ɽӿڳе�,ͬʱ����һ��������,�ҿ�ʵ������ӿڵ����з���
//������ͬ��������������͵ľ��������ѡ��ʵ������ӿ�
//Ҳ����ѡ��̳������������дʵ�����ɷ���
//ʵ��Ӧ���п��Խ��ӿڷ�����ײ�,�ڳ�������ʵ�ֽӿڵĸ�������,����������̳�ʵ��