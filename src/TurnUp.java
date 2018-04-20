import java.util.*;

interface Shape1 {
	public void erase();
}

class Circlr1 implements Shape1 {
	@Override
	public void erase() {
		System.out.println("Circlr1.erase");
	}
}

class Line1 implements Shape1 {
	@Override
	public void erase() {
		System.out.println("Line1.erase");
	}
}

class Eraser {
	void cleanBoard(Shape1 s) {// ����ʱ��
		s.erase();
	}
}

public class TurnUp {
	public static void main(String[] args) {
		Eraser eraser = new Eraser();
		Line1 line1 = new Line1();
		Circlr1 circlr1 = new Circlr1();
		eraser.cleanBoard(line1);
		eraser.cleanBoard(circlr1);
		System.out.println("����ת�ʹ���������");
		PrivateOveride po = new PublicOveride();
		// po.fm();//fm���ɼ�
		po.f();
		System.out.println("���ڰ�");
		System.out.println("������Ҫ����U�̵��ַ���");
		USB usb1 = new USB();
		Device d1 = new Upan();
		Device d2 = new MP3();
		usb1.readdata(d1);
		usb1.readdata(d2);
	}

}

// ���ڼ̳й�ϵ�Ĵ���,����ȿ�����Ϊ�Լ����������ʹ��,Ҳ������Ϊ������ʹ��
// ���ֽ������������Ϊ���丸���������õ�������Ϊ����ת��
// ʹ������ת��,�����ж��ٸ���ʵ����Shape1�Ľӿ�,������Ҫ�޸�Eraser��,ʵ�ֶ�̬
// ������һ��Line1��,Ҳʵ����Shape1�Ľӿ�,������Ҫ�Ķ�Eraser��
// ����ת��Ҳ���ܴ�������,����
class PrivateOveride {
	private void fm() {// private�����Զ���Ϊ����final����,��������д,���������е�fm()��һ��ȫ�µķ���
		System.out.println("PrivateOveride private fm");// ����ת�͵�������ķ����ͻ����
	}

	protected void f() {
		fm();
		System.out.println("PrivateOveride public f");
	}
}

class PublicOveride extends PrivateOveride {
	public void fm() {
		System.out.println("PublicOveride public fm");
	}

	@Override
	protected void f() {
		fm();
		super.f();
		System.out.println("PublicOveride public f");
	}
}

// private�����Զ���Ϊ����final����,��������д,���������е�fm()��һ��ȫ�µķ���
// ����ת�͵�������ķ����ͻ����
// ��̬�����ͬһ����̳�����������֮���ܹ����ݷ�����Ϊ�Ĳ�ͬʵ�ֶ����ֳ��˴˵�����
// ���Խ��Ӹ���̳������Ķ�������������Ϊͬһ��������������,�ο�Shape1�Լ�InterfaceImplements2.java
// ��һ����������ͬһ�������������������Ϊ��
// ���ڳ���ִ��ǰ���а󶨳�Ϊǰ�ڰ�,�ɱ�������������ʵ��,�������������Ĭ�ϵİ󶨷�ʽ
abstract class Device {
	String data;

	public abstract void dataread();
}

// class Camera extends Device {
// public void dataread() {
// Scanner in = new Scanner(System.in);
// String data = in.next();
// System.out.println("Camera��������Ϊ:" + data);
// }
// }

class MP3 extends Device {
	@Override
	public void dataread() {
		Scanner in = new Scanner(System.in);
		String data = in.next();
		in.close();// ��������쳣ע�͵�
		System.out.println("MP3��������Ϊ:" + data);
	}
}

class Upan extends Device {
	@Override
	public void dataread() {
		Scanner in = new Scanner(System.in);
		String data = in.next();
		in.close();// ��������쳣ע�͵�
		System.out.println("Upan��������Ϊ:" + data);
	}
}

class USB {
	public void readdata(Device d) {
		d.dataread();
	}
}
// Java�г���static��final����֮��,���Ǻ��ڰ󶨵�,�����Զ�����