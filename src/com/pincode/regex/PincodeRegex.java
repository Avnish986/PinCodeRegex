package com.pincode.regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PincodeRegex {

	public static void main(String[] args) {
		System.out.println("Pincode validation");
		Pattern patt = Pattern.compile("^[0-9]{3}\\s{0,1}[0-9]{3}$");
		Scanner sc = new Scanner(System.in);
		String pinCode = sc.nextLine();
		Matcher matcher = patt.matcher(pinCode); //use 12345 matches starts and end with num
		boolean found=matcher.find();
		if(found)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	

	}

}
