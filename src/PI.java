
public class PI {
	static double MontePI(double n) {
		double PI;
		double x, y;
		double i, sum;
		sum = 0;
		for (i = 1; i <= n; i++) {
			x = Math.random();
			y = Math.random();
			if (x * x + y * y <= 1) {
				sum++;
			}
		}
		PI = 4.0 * sum / n;
		return PI;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(MontePI(100));// ��
			System.out.println(MontePI(1000));// ǧ
			System.out.println(MontePI(10000));// ��
			System.out.println(MontePI(100000));// ʮ��
			System.out.println(MontePI(1000000));// ����
			System.out.println(MontePI(10000000));// ǧ��
			System.out.println(MontePI(100000000));// ��
			System.out.println(MontePI(1000000000));// ʮ��
			System.out.println("\n");
		}
	}
}
// ���ؿ�����PI,���������ȷ,���ܰ�
// ģ����������Ϊһ����������Ͷ��,��������������ĵ������ܵ���֮��Ϊsum/n=PI/4