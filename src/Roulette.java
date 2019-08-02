public class Roulette {

	/*
	 * This spins for the user and tests if the roll was the same as the user's choice.
	 */
	public static boolean spin(int slotChoice, int slots ){
		int rand = Magic.random(slots);
		if(rand == 37){
			Magic.println("It rolled: 00");
		}
		else{
			Magic.println("It rolled: "+rand);
		}
		if(rand == slotChoice){
			return true;
		}
		else{
			return false;
		}
	}

	/*
	 * This method will be used to show that the user won, and it will
	 * be used to add the correct amount of money won to the current balance.
	 */
	public static int win(int multiplier, int bet){
		Magic.println("You won!");
		int winPot = bet * multiplier;
		return winPot;
	}

	public static void main(String[] args) {
		Magic.println("Please type how much money you have.\nThis will be your balance.");
		int balance = Magic.nextInt();
		int bet;

		//This "for" statement will allow for multiple rounds until balance goes to or below 0.
		for(int i = 0; i<balance; i+=bet){

			Magic.println("How much will you bet?");
			bet = Magic.nextInt();

			//This "if" statement will make sure the bet is in the range of
			//balance and not below or equal to 0.
			if(bet <= balance && bet >= 1){
				String slotChoice = "";
				int slotChosenInt;

				Magic.println("What slot will you bet on?\nThe slot numbers are from 0 to 36, or the special 00 slot.");
				slotChoice = Magic.nextLine();

				try{
					slotChosenInt = Integer.parseInt(slotChoice);
				}catch(NumberFormatException e){
					slotChosenInt = 1000;
				}

				//This tests for the Red and Black slot numbers.
				if(slotChosenInt>=1 && slotChosenInt<=36){

					if(spin(slotChosenInt, 1)){
						balance+=win(1,bet);
						bet = 0;
						Magic.println("Balance: "+(balance-i));
						Magic.println("Do you want to play again?\n Enter 'no' or 'yes'.");
						String answer = Magic.nextLine();
						if(answer.equals("no")){
							break;
						}
					}
					else{
						Magic.println("You Lost. Hehe");
						Magic.println("Balance: "+ (balance-(bet+i)));
					}
				}
				//This tests for the 00 slot
				else if(slotChoice.equals("00")){
					if(spin(37,37)){
						balance+=win(35,bet);
						bet = 0;
						Magic.println("Balance: "+(balance-i));
						Magic.println("Do you want to play again?\n Enter 'no' or 'yes'.");
						String answer = Magic.nextLine();
						if(answer.equals("no")){
							break;
						}
					}
					else{
						Magic.println("You Lost. Hehe");
						Magic.println("Balance: "+ (balance-(bet+i)));
					}
				}
				//This tests, solely, for the 0 slot.
				else if(slotChosenInt==0){
					if(spin(0,37)){
						balance+=win(35,bet);
						bet = 0;
					}
					else{
						Magic.println("You Lost. Hehe");
						Magic.println("Balance: "+ (balance-(bet+i)));
					}
				}
				else{
					Magic.println("There is no slot under that number.");
					bet = 0;
				}

			}
			else{
				Magic.println("You have to bet within the range of your balance.");
				bet = 0;
			}
		}
		Magic.println("Womp womp...");

	}
}

