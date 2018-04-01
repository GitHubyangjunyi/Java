package practice;

public class Brunch {
	public static void main(String[] args) {
		int score=Integer.parseInt(args [0]);
		String str = null;
		if(score>1){
			str="大于一";
		}
		else{
			str="小于一";
		}
		System.out.print(str);
	}
}