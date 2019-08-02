
public class BirthDayCalculator {

	public static void main(String[] args) {
		int[] daysInMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		
		Magic.println("Please enter your date of pregnancy. (In the format of 1-1-1999)");
		String[] pregDate = Magic.nextLine().split("-");
		int month = Integer.parseInt(pregDate[0]);
		int days = Integer.parseInt(pregDate[1]);
		int year = Integer.parseInt(pregDate[2]);
		
		int daysToStart = 0;
		
		for(int i = 0; i < month-1; i++){
			daysToStart+=daysInMonth[i];
		}
		daysToStart+=days;
		int daysLeft = 365 - daysToStart;
		int daysToBirth = 0;
		if(280>daysLeft){
			year++;
			daysToBirth = 280 - daysLeft;
		}else{
			daysToBirth = 280 + daysToStart;
		}
		
		
		
	}

}
