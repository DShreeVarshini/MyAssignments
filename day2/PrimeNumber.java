package week1.day2;

public class PrimeNumber {
public static void main(String[] args) {
	int n=53,flag=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
			flag=0;
		else
			flag=1;
	}
	if(flag==0)
		System.out.println(n+" is not a prime number.");
	else
		System.out.println(n+" is a prime number.");
}
}
