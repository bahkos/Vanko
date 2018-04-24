import java.util.Scanner;

public class Training3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    double[] numbers = new double[5];
	     

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextDouble();
	    }
	    
	    System.out.println("Min Value : " + min);
		System.out.println("Second Max value : " + max);
	    	    	  
	}
	
	public static double getTheGreatestNumber(double numbers[]) {
		double min = numbers[0]; 
		double max = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) 
		{
			if (numbers[i] > max) 
			{
				max = numbers[i];
			}
			if (numbers[i] < min) 
			{
				min = numbers[i];
			}
		}
		
		
		return min;
		
	   }
	
	
}


