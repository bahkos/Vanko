import java.util.Scanner;

class Training4 { 
 
  public static void main(String args[]){
	  
	  Scanner input = new Scanner(System.in);
	    double[] numbers = new double[10];
 
	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextDouble();
	    }
	    
	    for (int i = numbers.length; i > 0; i--) {
	    	for (int j = 0; j < i - 1; j++) {
	    		if (numbers[j] > numbers[j + 1]) {
	    			double temp = numbers[j];
	    			numbers[j] = numbers[j + 1];
	    			numbers[j + 1] = temp;
	    		}
	    	}
	    }
    
    double max = getTheGreatestNumber(numbers);
    System.out.println("Greatest Number is: "+max);
 
    
    double min = getTheSmallestNumber(numbers);
    System.out.println("Smallest Number is: "+min);
    
    double max1 = getTheSecondGreatestNumber(numbers);
    System.out.println("Second Greatest Number is: "+max1);
 
    
    double min1 = getTheSecondsecondSmallestNumber(numbers);
    System.out.println("Second Smallest Number is: "+min1);
    
    
    
  }
 
  
  public static double getTheGreatestNumber(double[] numbers){ 
   if(numbers[9] > numbers[0])
   {
	  double greatestNumber = numbers[9];
	  return greatestNumber; 
   } else {
	   double greatestNumber = numbers[0];
	   return greatestNumber; 
   }
    
  }
 
 
  public static double getTheSmallestNumber(double[] numbers){ 
	  if(numbers[9] < numbers[0])
	   {
		  double smallestNumber = numbers[9];
		  return smallestNumber; 
	   } else {
		   double smallestNumber = numbers[0];
		   return smallestNumber; 
	   } 
    
  } 
  public static double getTheSecondGreatestNumber(double[] numbers){ 
	  if(numbers[8] > numbers[1])
	   {
		  double secondGreatestNumber = numbers[8];
		  return secondGreatestNumber; 
	   } else {
		   double secondGreatestNumber = numbers[1];
		   return secondGreatestNumber; 
	   } 
  }
	 
	 
  public static double getTheSecondsecondSmallestNumber(double[] numbers){ 
	  if(numbers[8] < numbers[1])
	   {
		  double secondSmallestNumber = numbers[8];
		  return secondSmallestNumber; 
	   } else {
		   double secondSmallestNumber = numbers[1];
		   return secondSmallestNumber; 
	   } 
} 
}