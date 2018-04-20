
public class InnerGetOuter {
	private int count;// �ⲿ���Ա����

	public class Citizen {
		private int count;// �ڲ����Ա����,Ϊ��ʼ��Ĭ��ֵΪ0

		public void output(int count) {
			count++;// ��������,�ֲ�����
			this.count++;// �ڲ����Ա����
			InnerGetOuter.this.count++;// �ⲿ���Ա����
			System.out.println("output�����оֲ�����countΪ" + count);
			System.out.println("�ڲ���ĳ�Ա����countΪ" + this.count);
			System.out.println("�ⲿ��ĳ�Ա����countΪ" + InnerGetOuter.this.count);
		}
	}

	Citizen citizen = new Citizen();// �����ڲ������

	public void increase(int s) {
		citizen.output(s);// �����ڲ��෽��
	}

	public static void main(String[] args) {
		InnerGetOuter innerGetOuter = new InnerGetOuter();
		innerGetOuter.count = 5;// �����ⲿ��ĳ�Ա����countΪ5
		innerGetOuter.increase(5);
	}
}
// ����������ͬ����ͬ�����count,�����ⲿ���Ա���ڲ����Ա����ͬ��
// �ڲ���ķ���Ȩ������ͨ��ͽӿڲ�ͬ,�ɶ�Ϊpublic/protected/private/Ĭ��
// ����ͨ��ֻ�ܶ���Ϊpublic/Ĭ������
// �������ⲿ��֮������ڲ���,�����ڲ�����ʱ����ʹ�������޶���
// �����ڲ������ʱ�������ⲿ�������