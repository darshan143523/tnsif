package com.tnsif.day4;

public class Base {

	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	void defaultMethod()
	{
	    System.out.println("Default variable" +varDefault);
	    System.out.println("default method");
	}
		
	void publicMethod()
	{
	    System.out.println("Public variable" +varPublic);
	    System.out.println("public method");
	}
	void privateMethod()
	{
	    System.out.println("Private variable" +varPrivate);
	    System.out.println("private method");
	}
	void protectedMethod()
	{
	    System.out.println("Protected variable" +varProtected);
	    System.out.println("protected method");
	}
			

}
