package practice;

public class Score {
	public static void main(String[] args) {
		int score=Integer.parseInt(args [0])/10;
		String str;
		switch(score){
		case 10:
		case 9: str="����";
		break;
		case 8: str="����";
		break;
		case 7: str="����";
		break;
		case 6: str="����";
		break;
		default: str="������";
		break;
		}
		System.out.println(str);
	}
}