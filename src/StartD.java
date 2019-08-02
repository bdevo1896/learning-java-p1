
public class StartD {

	public static void main(String[] args) {
		int avg = 0;
		int sum = 0;
		int nums[] = new int[10];
		
		Magic.println("Please input 10 values");
		//This for loop will input all of the user input numbers into the array "nums".
		for(int i = 0; i < nums.length; i++){
			nums[i] = Magic.nextInt();
			sum+=nums[i];
		}
		
		//This next statement will calculate the average of "nums".
		avg = sum / nums.length;
		
		//This block of if statements will print out different phrases based off of "avg".
		if(avg < 60){
			Magic.println("You have some problems.");
		}
		else if(avg>=60 && avg<=69){
			Magic.println("Your class average is a D.");
		}
		else if(avg>=70 && avg<=79){
			Magic.println("Your class average is a C.");
		}
		else if(avg>=80 && avg<=89){
			Magic.println("Your class average is a B.");
		}
		else if(avg>=90 && avg<=100){
			Magic.println("Your class average is a A.");
		}
		else{
			Magic.println("You passed with flying rainbows broski!");
		}
		
		//These next 2 statements will reset "avg" and "sum" for reuse.
		sum = 0;
		avg = 0;
		
		/*
		 * This is the beginning of part 3.
		 */
		int userInputVal;
		int count = 0;
		do{
			Magic.println("Please enter a number, preferrably even.");
			userInputVal = Magic.nextInt();
			Magic.println(userInputVal%2);
			if((userInputVal % 2) == 0){
				sum+= userInputVal;
				count++;
			}
		}while((userInputVal % 2) == 0);
		
		if(count==0){
			count++;
		}
		
		avg = sum / count;
		
		Magic.println("The average for the even numbers inputted was: "+avg);
		
		//These statements will again reset "avg" and "sum" for reuse.
		avg = 0;
		sum = 0;
		
		/*
		 * This is the beginning of part 4.
		 */
		int x=0;
		int y=0;
		int width = 0;
		int height = 0;
		String color = "";
		
		while(x>=0 && y>=0){
			Magic.println("Please input 4 values and then a color.");
			x = Magic.nextInt();
			y = Magic.nextInt();
			height = Magic.nextInt();
			width = Magic.nextInt();
			color = Magic.nextLine();
			
			if(x>=0 && y>=0){
				Magic.drawOval(x, y, width, height, color);
			}
		}
		
		/*
		 * This is the beginning of part 5.
		 */
		int myArray[];
		Magic.println("Please enter a file name.");
		
		String fileName = Magic.nextLine();
		
		/*
		 * This if statement will test to see if there is a file name of what
		 * the user inputs. If the statement is true, the sum of the numbers in 
		 * the array will be calculated. Then using the sum, the average will be
		 * calculated and printed.
		 */
		if(Magic.fileExists(fileName)){
			myArray = Magic.simpleIntFileRead(fileName);
			for(int i = 0; i < myArray.length; i++){
				sum+= myArray[i];
			}
			
			Magic.println("The average of the numbers in the file is: "+ (sum / myArray.length));
			
		}
		/*
		 * This "else" statement will create a new file using the user's input since
		 * the file wasn't found.
		 */
		else{
		
		Magic.println("File: "+fileName+" wasn't found.\nHow many numbers do you want for a new file?");
		
		int size = Magic.nextInt();
		
		myArray = new int[size];
		
		Magic.println("Please input "+size+" numbers.");
		for(int i = 0; i < size; i++){
			myArray[i] = Magic.nextInt();
		}
		
		Magic.simpleIntFileWrite(fileName, myArray);
		
		Magic.println("Your new file has been created and saved.");
		}
		
		
	}

}
