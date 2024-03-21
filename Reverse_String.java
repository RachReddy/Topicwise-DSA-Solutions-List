package com.String.com;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str="rhea";
		
		int len=str.length();
		
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb.reverse();
		
		System.out.print(sb.toString());  //aehr
	
	}

}
