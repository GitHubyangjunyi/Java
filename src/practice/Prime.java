package practice;

public class Prime {
	public static void main(String[] args) {
		int i, j, k;
		int num = 0;
		for (i = 1; i <= 100; i++) {//���ѭ��i����1��100
			k = (int) Math.sqrt((double) i);//���i��ƽ����k
			for (j = 2; j <= k; j++) {//��2���γ���k���������������������
				if (i % j == 0) {
					break;
				}
			}
			if (j >= k + 1) {
				num++;
				System.out.print(i + "\t");
				if (num % 5 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("����" + num + "������");
	}
}
