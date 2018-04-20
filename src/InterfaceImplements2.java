interface Useleg {
	void walk();

	void run();
}

interface Usemouth {
	void speak();

	void eat();
}

interface Useear {
	void hearMusic();
}

interface Useeye {
	void seeFilm();
}

class Personx implements Useleg, Usemouth, Useear, Useeye {
	String name;
	int age;
	String address;
	String ID;

	@Override
	public void run() {
		System.out.println("I am running");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void speak() {
		System.out.println("I am speaking");
	}

	@Override
	public void eat() {
		System.out.println("I am eating");
	}

	@Override
	public void hearMusic() {
		System.out.println("I am listening to music");
	}

	@Override
	public void seeFilm() {
		System.out.println("I am seeing a film");
	}
}

public class InterfaceImplements2 {

	public static void main(String[] args) {
		Personx p = new Personx();
		p.seeFilm();
		//��һ�������ʵ�ֶ���ӿ�,�Ӷ������Ϳ��Կ�����������
		//�������Ͷ���(��̬)
		Useeye px = new Personx();
		px.seeFilm();
		Useleg py = new Personx();
		py.walk();
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