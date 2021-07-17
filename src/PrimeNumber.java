import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.prime1();
				 
		 }
			 

	public void prime1()
	{
		int num=100;
		for (int i=1; i<num; i++) {
			boolean isPrime=true;
			{
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						isPrime= false;
						
					}
				
				}
				if(isPrime)
				{
					System.out.println(i);
				}
			}
			
		}
	}

}
