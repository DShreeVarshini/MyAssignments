package week1.day2;

public class Car {
	
	
	public int getRegistrationNumber() {
		return 1111;
	}
	private String getOwnerName() {
		return "ShreeVarshini";
	}
	void printModelName(String modelName) {
		System.out.println("Model Name - "+modelName);
	}
	public boolean isPunctured() {
		return true;
	}
	public int subtractTwoNumbers(int a, int b) {
		return (a-b);
	}
	public int multiplyThreeNumbers(int a, int b, int c) {
		return (a*b*c);
	}
	public int divideTwoNumbers(int a, int b) {
		return (a/b);
	}
	public static void main(String[] args) {
		Car obj= new Car();
		System.out.println("Registration Number-"+obj.getRegistrationNumber());
		System.out.println("Owner Name-"+obj.getOwnerName());
		obj.printModelName("Toyota Etios");
		System.out.println("Is Punctured-"+obj.isPunctured());
		System.out.println("Owner Name-"+obj.getOwnerName());
		System.out.println("Difference-"+obj.subtractTwoNumbers(10, 5));
		System.out.println("Product-"+obj.multiplyThreeNumbers(2,2,2));
		System.out.println("Division-"+obj.divideTwoNumbers(10, 5));
	}
}
