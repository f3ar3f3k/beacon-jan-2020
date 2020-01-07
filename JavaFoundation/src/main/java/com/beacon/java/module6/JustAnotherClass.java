package com.beacon.java.module6;

public class JustAnotherClass {

	public static void main(String[] args) {
		PublicSpecifier pub = new PublicSpecifier();
		String s = pub.protectedStr;
		pub.showProtected();
		
		String a = pub.defStr;
		pub.showDefaultStr();
	}
	
}
