import java.util.Scanner;

public class Training2 {

	public static void main(String[] args) {
		
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
	    
	    	System.out.println(numbers[1]);
	    	System.out.println(numbers[8]);
}
}