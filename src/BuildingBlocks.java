
public class BuildingBlocks { 

	
	public static void main(String[] args) {
		//Make sure you name your PROJECT 
		//lab-01-userid 
		//(where userid is your user id. 
		
		//Question 1. 
		/* Modify the following lines of code so that you print out four different messages
		 * if value is greater than 100, 
		 * if value is at most 100 but greater than 50
		 * if value is equal to 50, 
		 * or if value is less than 50
		 */
		
		int value;
		Magic.println("Please enter a value");
		value = Magic.nextInt();
		if (value ==50){
			Magic.println("value is 50");
		} else if ( value > 50 && value<=100) {
			Magic.println("Value is greater than 50, but less than or as much as 100");
		} else if (value >100 ) {
			Magic.println("value is greater than 100");
		} else {
			Magic.println("value is less than 50");
		}

		//Question 2. 
		/* Modify the for loop so that it starts when i = 10, 
		 * stops when i is equal to or greater than 50,
		 * and i increases by 3 each iteration.  
		 */
		
		for(int i =10;i< 50;i+=3){
			Magic.println("The value of i is "+i);
		}
		
		//Question 3
		/* Modify the WHILE loop so that it starts when i = 10, 
		 * stops when i is equal to or greater than 50,
		 * and i increases by 3 each iteration.  
		 */
		
		int loopIndex = 10;
		while (loopIndex>=50){
			Magic.println("the value of the loop index is "+loopIndex);
			loopIndex+=3;
		}
		
		//Question 4
		/* Modify the following code so that it will keep on looping as long as the user enters
		 * a number that is less than 33
		 * 
		 */
		
		int valueEntered;
		do{
			Magic.println("Please enter a non-negative number");
			valueEntered = Magic.nextInt();
			Magic.println("You entered " + valueEntered);
		} while (valueEntered <33);
		
		
		//Question 5
		/* Modify the code below so that you create an array of size 9
		 * ask the user to input values into the array
		 * calculate the average of all of the values of the array
		 * print out the average 
		 */
		
		int[] myArray = new int[9];
		for(int index = 0; index < myArray.length;index++){
			Magic.println("Please enter an integer to put into an array");
			myArray[index] = Magic.nextInt();
		}
		
		int sum=0;
		for(int index = 0; index < myArray.length; index++ ){
			sum+=myArray[index];
		}
		
		int avg = sum/myArray.length;
		Magic.println("The average is "+avg);
		
	}

}
