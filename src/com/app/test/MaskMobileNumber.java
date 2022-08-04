package com.app.test;

public class MaskMobileNumber {
	public static void main(String[] args) {
		String mobileNo="9966809955";
		
		String replaceAll = mobileNo.replaceAll("\\d(?=\\d{4})","X");
		
		System.out.println(replaceAll);

	}


}
