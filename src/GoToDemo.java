public class GoToDemo {
	public static void main(String[] args) {
		mxl: for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				if (j % 2 == 0) {
					System.out.println(j + "\t");
				} else {
					break mxl;
				}
			}
		}
		mxl: for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				if (j % 2 == 0) {
					System.out.println(j + "\t");
				} else {
					break mxl;
				}
			}
		}
	}
}
// ��չ����break���break lable;
// lable�Ǳ�ʾ�����ı�ǩ,��������ʽ��breakִ��ʱ,���Ʊ����ݳ�ָ���Ĵ����
// ���ӱ�ǩ�Ĵ��������Χbreak���,������ֱ�Ӱ�Χ����˳�һϵ�е�Ƕ��,������ʹ��break��佫����Ȩ���ݵ�������break���Ĵ����
// ��ǩ����ͬ��,ֻ�����������Լ��Ĵ����,���޷�������ı�ǩ