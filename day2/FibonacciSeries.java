package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum =0, secondNum = 1, sum =0;
		System.out.println("Fibonacci series");
		for(int i=1;i<=11;i++) {
			System.out.println(firstNum);
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
		}
		
	}
    
}
