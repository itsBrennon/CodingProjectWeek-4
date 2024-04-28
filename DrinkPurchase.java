package week04;

public class DrinkPurchase {

	    public static void main(String[] args) {
	        // willBuyDrink method
	        boolean canBuyDrink = willBuyDrink(true, 11.00);
	        System.out.println("Can buy drink: " + canBuyDrink);

	        // Method isWeekend
	        boolean isWeekend = isWeekend("Saturday");
	        System.out.println("Is it the weekend? " + isWeekend);
	    }

	    //12. Method to determine if the user will buy a drink
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }

	    // 13. Customized method that solves a problem
	    /**
	     * Method checks if a given day is part of the weekend.
	     * This method will help plan activities whether it is a weekday or the weekend
	     * @param day The day of the week.
	     * @return true if it's Saturday or Sunday, false otherwise.
	     */
	    public static boolean isWeekend(String day) {
	        return day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
	    }
	}



