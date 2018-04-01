package practice;

public class Score {
	public static void main(String[] args) {
		int score=Integer.parseInt(args [0])/10;
		String str;
		switch(score){
		case 10:
		case 9: str="优秀";
		break;
		case 8: str="良好";
		break;
		case 7: str="及格";
		break;
		case 6: str="及格";
		break;
		default: str="不及格";
		break;
		}
		System.out.println(str);
	}
}