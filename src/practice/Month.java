package practice;

public class Month {
	public static void main(String[] args) {
		int m=Integer.parseInt(args [0]);
		String str = null;
		switch(m) {
		case 1:str="һ��";
		break;
		case 2:str="����";
		break;
		case 3:str="����";
		break;
		case 4:str="����";
		break;
		case 5:str="����";
		break;
		case 6:str="����";
		break;
		case 7:str="����";
		break;
		case 8:str="����";
		break;
		case 9:str="����";
		break;
		case 10:str="ʮ��";
		break;
		case 11:str="ʮһ��";
		break;
		case 12:str="ʮ����";
		break;
		}
		System.out.print(str);
	}
}