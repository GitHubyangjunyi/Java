package practice;

public class Month {
	public static void main(String[] args) {
		int m=Integer.parseInt(args [0]);
		String str = null;
		switch(m) {
		case 1:str="一月";
		break;
		case 2:str="二月";
		break;
		case 3:str="三月";
		break;
		case 4:str="四月";
		break;
		case 5:str="五月";
		break;
		case 6:str="六月";
		break;
		case 7:str="七月";
		break;
		case 8:str="八月";
		break;
		case 9:str="九月";
		break;
		case 10:str="十月";
		break;
		case 11:str="十一月";
		break;
		case 12:str="十二月";
		break;
		}
		System.out.print(str);
	}
}