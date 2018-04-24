import java.util.Scanner;

class Training4 { 
 
  public static void main(String args[]){
	  
	  Scanner input = new Scanner(System.in);
	    double[] numbers = new double[5];
 
	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextDouble();
	    }
    
    double max = getTheGreatestNumber(numbers);
    System.out.println("Maximum Value is: "+max);
 
    
    double min = getTheSmallestNumber(numbers);
    System.out.println("Minimum Value is: "+min);
    
    double max1 = getTheSecondGreatestNumber(numbers);
    System.out.println("Maximum Value is: "+max);
 
    
    double min1 = getTheSecondSmallestNumber(numbers);
    System.out.println("Minimum Value is: "+min);
    
  }
 
  
  public static double getTheGreatestNumber(double[] inputArray){ 
    double maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
 
  public static double getTheSmallestNumber(double[] inputArray){ 
	  double minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
    
  } 
  public static double getTheSecondGreatestNumber(double[] inputArray){ 
	  double maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	 
	  public static double getTheSecondSmallestNumber(double[] inputArray){ 
		  double minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
}