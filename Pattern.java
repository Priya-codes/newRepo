package javabasics;

public class Pattern {

	public static void main(String[] args) {
	String name="Priya Bisht";
	int length=name.length();
	String reverse1="";
	for(int i=length-1; i>=0; i--)
	{
		 reverse1=reverse1+name.charAt(i);
	}
		System.out.println(reverse1);
	

}

	
}