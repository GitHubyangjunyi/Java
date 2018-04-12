package practice;

public class Prime {
	public static void main(String[] args) {
		int i, j, k;
		int num = 0;
		for (i = 1; i <= 100; i++) {//外层循环i控制1到100
			k = (int) Math.sqrt((double) i);//求出i的平方根k
			for (j = 2; j <= k; j++) {//从2依次除到k，如果不能整除就是素数
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
		System.out.println("共有" + num + "个素数");
	}
}
