
abstract class Figure {// ���г��󷽷����Գ�Ϊ������
	public abstract double calculateArea();// ���󷽷�

	public void showArea() {
		double area = calculateArea();
		System.out.println("��ͼ�ε����Ϊ" + area);
	}
}

class Rectangular extends Figure {
	private double length;
	private double width;

	public Rectangular(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {// ʵ�ֳ��󷽷�
		double area = length * width;
		return area;
	}
}

public class AbstractExtends {

	public static void main(String[] args) {
		Figure f = new Rectangular(5, 6);// �������Ͷ���(��̬)
		// ����Rectangular���󲢰��������÷��ص�Figure�͵ı�����
		f.showArea();
		Rectangular r = new Rectangular(7, 8);
		r.showArea();
	}
}
// Java����������������ֻ�з������������ṩʵ�ֵĳ��󷽷�,����һ���������󷽷������Ϊ������
// ������Ҳ����û�г��󷽷�,������ֹʵ��������
// �����಻�ܱ�ʵ����
// ��Ϊû��ʵ�����Գ���ֻ��������ͨ�������������ھ�̬�����͹��췽��