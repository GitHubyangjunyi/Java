//��������������Java�ڲ��������
//֪������
class Output {
	private static int count = 0;

	public static class Count {// �ڲ���
		void show() {
			System.out.println("ѧ������Ϊ" + count);
		}
	}

	public class Student {// �ڲ���
		String name;

		public Student(String str) {
			name = str;
			count++;
		}

		public void show() {
			System.out.println("�ҵ�������" + name);
			System.out.println("ѧ������Ϊ" + count);
		}
	}

	public void display() {
		Student stu = new Student("xxx");
		stu.show();
	}

	public void fun() {
		class Funclass {// �ֲ���
			void show() {
				System.out.println("�ֲ���ķ���");
			}
		}
		Funclass fc = new Funclass();
		fc.show();
	}
}

public class InnerClass2 {
	public static void main(String[] args) {
		Output.Student stud = new Output().new Student("yyy");// ˫new��ʵ��������
		stud.show();
		Output.Count cou = new Output.Count();
		cou.show();
		Output ou = new Output();
		ou.display();
		ou.fun();
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