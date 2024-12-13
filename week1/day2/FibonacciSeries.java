package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iteration = 10;
		int first = 0, second=1;
		System.out.println("Fibonacci series of "+iteration);
		for(int i =0;i< iteration ;++i) {
			//0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
			System.out.println(first);//1-0,2-1,3-1,4-2,5-3,6-5,7-8,8-13,9-21,10-34
			int sum = first + second;//1 2 3 5 8 13 21 34 89
			first = second;//1 1 2 3 5 8 13 21 34 55
			second = sum;//1 2 3 5 8 13 21 34 55 89
		}

	}

}
