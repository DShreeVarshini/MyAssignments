package w3d1.assignment5;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strSplit = text.split(" ");
		for(int i=0;i<strSplit.length;i++)   
		{
	      if(strSplit[i]!=null)
	      {
	      
	      for(int j=i+1;j<strSplit.length;j++)          
	      {
	        
	      if(strSplit[i].equals(strSplit[j]))          
	      {
	    	  strSplit[j]=null;      
	    	  }
	      }
	      }
	    }
	    for(int k=0;k<strSplit.length;k++)    
	    {
	      if(strSplit[k]!=null)
	      {
	        System.out.print(strSplit[k] + " ");
	      }
	      
	    } 
	}

}
