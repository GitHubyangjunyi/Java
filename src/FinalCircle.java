class FinalCircle {
	private final double PI = 3.14;
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return PI * this.radius * this.radius;
	}

	public static void main(String[] args) {
		FinalCircle circle = new FinalCircle();
		circle.setRadius(2);
		System.out.println(circle.area());
	}
}
// final���ε��಻�ܱ��̳�
// final���ε�ֵ���ܱ��޸�,����������Ϊfinalʱ�����ʼ��
// final���εķ������ܱ���д
// ��������Ϊfinalʱ�ö�������ò��ܱ��޸�,������ֵ���Ըı�