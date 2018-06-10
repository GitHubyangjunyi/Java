
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
			System.out.println(MontePI(100));// 百
			System.out.println(MontePI(1000));// 千
			System.out.println(MontePI(10000));// 万
			System.out.println(MontePI(100000));// 十万
			System.out.println(MontePI(1000000));// 百万
			System.out.println(MontePI(10000000));// 千万
			System.out.println(MontePI(100000000));// 亿
			System.out.println(MontePI(1000000000));// 十亿
			System.out.println("\n");
		}
	}
}
// 蒙特卡洛求PI,结果不够精确,可能吧
// 模拟随机在面积为一的正方形里投点,落在内切扇形里的点数和总点数之比为sum/n=PI/4