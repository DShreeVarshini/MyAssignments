package w3d1.assignment5;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		String test="changeme";
		char[] chArr=test.toCharArray();
		
		for(int i=0;i<chArr.length;i++) {
			if(i%2!=0) {
				chArr[i]=Character.toUpperCase(chArr[i]);
				}
			System.out.print(chArr[i]);
	}
		
		
	}
}
