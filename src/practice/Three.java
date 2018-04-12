package practice;

public class Three {
	public static void main(String[] args) {
		final int row = 5;
		final int col = 18;
		int i, x;
		for (i = 0, x = 1; i < row; i++, x++) {
			for (int j = 9 + i; j < col; j++) {
				System.out.print(" ");
			}
			for (int m = 0; m < 2 * i + 1; m++) {
				System.out.print("*");
			}
			if (x % 5 == 0) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}