
public class ThrowsTest {
	public static boolean testEx() throws Exception {
		int b = 12;
		for (int i = 2; i >= 0; i--) {
			int c = b / i;
			System.out.println(c);
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			testEx();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
// �ؼ���throws��������һ�����������׳����쳣,������쳣���������������׳��쳣�ķ�ʽ,throws�Ǳ��������쳣�ķ�ʽ
// �����׳����쳣��throws�Ӿ���ָ�����쳣������������
// ��Error���RuntimeException�������� �������쳣����Ҫ�ڷ���������ָ��,�������쳣����Java������쳣,�޷���Ԥ
// Java������һ���쳣�Ǽ���쳣,���ڳ�����Ӧ�ñ�������쳣,���������ȫ������쳣,��������쳣
// ��throws�쳣˵������ָ���п��ܷ�����Ҫ�����쳣
// testEx()��û�д����쳣,����ͨ��throws���쳣�׸�������,��Ϊ�����ߵ�main()���������쳣