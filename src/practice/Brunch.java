package practice;

public class Brunch {
	public static void main(String[] args) {
		int score=Integer.parseInt(args [0]);
		String str = null;
		if(score>1){
			str="����һ";
		}
		else{
			str="С��һ";
		}
		System.out.print(str);
	}
}