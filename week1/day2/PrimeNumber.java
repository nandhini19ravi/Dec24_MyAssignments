package week1.day2;

public class PrimeNumber {
	public void numPrime(int n)
	{
		if(n <= 1) {
			System.out.println(n+" is not a prime number");
		}
		for (int i=2; i<n;i++) 
			if(n%i == 0) 
				System.out.println(n+" is not a prime number");
		System.out.println(n+" is a prime number");	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber num = new PrimeNumber();
		num.numPrime(11);
		num.numPrime(55);
		num.numPrime(90);
		num.numPrime(3);
			
	}

}
