import java.util.Scanner;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class ReverseString {

	String inputString="";
	char revString;
	public void revString() {
		System.out.println("Enter the String");
		Scanner input= new Scanner(System.in);
		inputString= input.nextLine();
		int length= inputString.length();
		System.out.println(length);
		for(int i=length-1; i>=0;i--)
		{
			revString=inputString.charAt(i);
			System.out.print(revString);
		
		}
		System.out.println(" ");
	}
	public void Buffer() {
		
		StringBuffer input= new StringBuffer("Hello World");
		System.out.println("Enter the String");
	
		input.reverse();
		System.out.println(input);
	}
	
	public void Builder() {
		StringBuilder b= new StringBuilder();
		String input= "Welcome";
		b.append(input);
		b.reverse();
		System.out.println(input);
	}
	public void getInput() {
		System.out.println("Enter the String");
		Scanner input= new Scanner(System.in);
		 input.nextLine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString r= new ReverseString();
		r.revString();
		ReverseString r1= new ReverseString();
		r1.Buffer();
	}

}
