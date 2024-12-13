package week1.day2;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		int a = 88;
		System.out.println("Given number is "+a);
		int b =0;
		if(a==2) {
			System.out.println(a+" is a prime number");		
		}else {
			for(int i=1; i<=a;i++) {
					if(a%i==0) {
					b++;
				}
			}
		if(b == 2) {
				System.out.println(a+" is a prime number");
				
		}else {
				System.out.println(a+" is not a prime number");
			}
		}		
		}
	}
