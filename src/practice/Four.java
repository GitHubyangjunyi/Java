package practice;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);  
	        System.out.println("请输入一个整数：");  
	        int num = sc.nextInt();  
	        String str1 = num + "";  
	        StringBuilder str2 = new StringBuilder(str1);  
	        str2.reverse();  
	        int count = 0;  
	        for (int i = 0; i < str1.length(); i++) {  
	            if (str1.charAt(i) != str2.charAt(i)) {  
	                System.out.println(str1 + "不是回文数");  
	                break;  
	            } else {  
	                count++;  
	            }  
	        }  
	        if (count == str1.length()) {  
	            System.out.println(str1 + "是回文数");  
	        }
	    }
	}