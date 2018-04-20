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
// 扩展过的break语句break lable;
// lable是表示代码块的标签,当这种形式的break执行时,控制被传递出指定的代码块
// 被加标签的代码块必须包围break语句,但无需直接包围便可退出一系列的嵌套,但不能使用break语句将控制权传递到不包含break语句的代码块
// 标签可以同名,只能跳到包含自己的代码块,但无法跳到别的标签