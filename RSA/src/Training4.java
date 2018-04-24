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
 
    
    double min = getThesecondSmallestNumber(numbers);
    System.out.println("Smallest Number is: "+min);
    
    double max1 = getTheSecondGreatestNumber(numbers);
    System.out.println("Second Greatest Number is: "+max1);
 
    
    double min1 = getTheSecondsecondSmallestNumber(numbers);
    System.out.println("Second Smallest Number is: "+min1);
    
    
    
  }
 
  
  public static double getTheGreatestNumber(double[] array){ 
    double greatestNumber = array[0]; 
    for(int i=1;i < array.length;i++){ 
      if(array[i] > greatestNumber){ 
         greatestNumber = array[i]; 
      } 
    } 
    return greatestNumber; 
  }
 
 
  public static double getThesecondSmallestNumber(double[] array){ 
	  double minValue = array[0]; 
    for(int i=1;i<array.length;i++){ 
      if(array[i] < minValue){ 
        minValue = array[i]; 
      } 
    } 
    return minValue; 
    
  } 
  public static double getTheSecondGreatestNumber(double[] array){ 
	  double secondGreatestNumber = array[0]; 
	    for(int i=1;i < array.length - 1;i++){ 
	      if(array[i] > secondGreatestNumber){ 
	         secondGreatestNumber = array[i]; 
	      } 
	    } 
	    return secondGreatestNumber; 
	  }
	 
	 
  public static double getTheSecondsecondSmallestNumber(double[] array){ 
	   double secondSmallestNumber = array[1]; 
	    for(int i=1;i < array.length;i++){ 
	      if(array[i] < secondSmallestNumber){ 
	        secondSmallestNumber = array[i]; 
	      } 
	    } 
	    return secondSmallestNumber; 
	  } 
}