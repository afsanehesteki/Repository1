import java.util.Scanner;
public class UniqueRandomNumbers {
	 static void generateRandomNumbers (int n) {
		 
		 int[] arr =new int[n]; //Actual array of numbers 	
		 boolean[] indexArray =new boolean[n]; //Index array to check generated values are unique  
		 int rand;				
		 for (int i = 0; i < n; i++) {		
			 //first random number is always unique	
			 do {
				// generates random number smaller or equal to n 		
				   rand= (int)(Math.random() * n) + 1;			
				 // If indexArray[rand] is True, it means that number(rand+1) has been already used
				   if (indexArray[rand-1] == false ){		
					   arr [i] = rand;				
					   indexArray[rand-1] = true;			
				 }		
			 } while (indexArray[rand-1] == true & arr [i] ==0);					
		 }//end of for
		 
	 for (int i = 0; i < n; i++) {
		 System.out.print( arr[i] + " " );
	 }
}
	 public static void main(String[] args) {	
		  // Reading input from keyboard provided by user    
		 Scanner scan = new Scanner(System.in);
		 int n ;
		 do {
		  System.out.print("Please enter the number: ");
		   n = scan.nextInt();
		   if (n<=0) {
			   System.out.println("Number should be bigger than 0");
		   }
		 } while (n<=0);
		//Closing scanner
		 scan.close();
		 generateRandomNumbers(n);
	 }
}
				