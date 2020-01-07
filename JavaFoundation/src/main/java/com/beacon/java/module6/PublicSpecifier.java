package com.beacon.java.module6;

public class PublicSpecifier {
	
	public String str = "This is a public demo";
	private int value = 10;
	protected String protectedStr = "protected";
	String defStr = "default string";
	
	public void showPublic() {
		System.out.println(str);
	}
	
	private void showPrivate() {
		System.out.println(value);
	}
	
	protected void showProtected() {
		System.out.println(protectedStr);
	}
	
	void showDefaultStr() {
		System.out.println(defStr);
	}

}
