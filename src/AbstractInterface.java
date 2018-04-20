
interface Figure1 {// ���г��󷽷����Գ�Ϊ������
	public abstract double calculateArea();// ���󷽷�

	public void showArea();
}

class Rectangular1 implements Figure1 {
	private double length;
	private double width;

	public Rectangular1(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {// ʵ�ֳ��󷽷�
		double area = length * width;
		return area;
	}

	@Override
	public void showArea() {
		double area = calculateArea();
		System.out.println("��ͼ�ε����Ϊ" + area);
	}
}

public class AbstractInterface {

	public static void main(String[] args) {
		Figure1 f = new Rectangular1(5, 6);// �������Ͷ���(��̬)
		// ����Rectangular���󲢰��������÷��ص�Figure�͵ı�����
		f.showArea();
		Rectangular1 r = new Rectangular1(7, 8);
		r.showArea();
	}
}
// Java����������������ֻ�з������������ṩʵ�ֵĳ��󷽷�,����һ���������󷽷������Ϊ������
// ������Ҳ����û�г��󷽷�,������ֹʵ��������
// �����಻�ܱ�ʵ����
// ��Ϊû��ʵ�����Գ���ֻ��������ͨ�������������ھ�̬�����͹��췽��
// �ӿ��еķ��������ǳ��󷽷�
// һ���������ʵ��ֻ�����������,���ʵ�����Լ̳�Ϊ������,����Java���̳�,�����о�����
// �ӿھ��ж��ؼ̳е�����,ʹ���κ�һ��ʵ�ֽӿڵ���,���ɿ���������ӿڵ�����
// ��һ�������ʵ�ֶ���ӿ�,�Ӷ������Ϳ��Կ�����������