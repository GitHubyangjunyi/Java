
public class InnerClass {

	private int count;

	public class Student {
		String name;

		public Student(String str) {
			name = str;
			count++;
		}

		public void introduce() {
			System.out.println("�ҵ�������" + this.name);
		}
	}

	public void recognize(String name) {
		Student stu = new Student(name);
		stu.introduce();
		System.out.println("count=" + this.count);
	}

	public static void main(String[] args) {
		InnerClass depart = new InnerClass();
		depart.recognize("yyy");
	}
}
// ��Java1.1�淶ǰ,��֧�������ж���Ƕ����,��ֻ���ǰ��еĳ�Ա����������ĳ�Ա
// Java1.1����ʹ���ڲ����������
// �ڲ��������
// һ��ֻ���ڶ��������������֮��,���ⲿ������ʱ������������ⲿ�����������޶���
// ���ڲ�������ֲ������ⲿ��������ͬ
// �����ǳ�����
// ��������Ϊprivate/protected
// ��������Ϊstatic,��ʱ�ڲ����Ϊ������,�൱�ڷ������沢�Ҳ������ڲ���,�Ҳ��������ⲿ��Ķ���
// ����ڲ���������static��Ա,���ڲ����������Ϊstatic
// ����ʹ���ⲿ��ľ�̬��Ա������ʵ����Ա����
// ���Զ������ⲿ��ĳ�Ա������,�÷����ľֲ����������ֻ����final����ʱ�ſ��Ա��ڲ���ʹ��