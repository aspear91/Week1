
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double itemPrice = 5.55;
		System.out.println(itemPrice);
		double cashInPocket = 7.86;
		System.out.println(cashInPocket);
		
		float numberOfFriends = 3;
		System.out.println(numberOfFriends);
		int ageInYears = 72;
		System.out.println(ageInYears);
		
		String firstName = "Bruhnhilda";
		System.out.println(firstName);
		String lastName = "Widderschnapps";
		System.out.println(lastName);
		
		char middleInitial = 'O';
		System.out.println(middleInitial);
		
		
		/*This is the equation where the item is bought
		 *and we calculate our remaining cash in our pockets.
		 */
		cashInPocket = cashInPocket - itemPrice;
		System.out.println("After splurging on that rediculously underpriced car, I have $" + cashInPocket + " left to my name and household.");
		
		/*This was originally two int's, but I was getting a
		 *result of zero friends per year. Changing
		 *numberOfFriends to a float made it possible to get
		 *an exact answer.
		 */
		numberOfFriends = numberOfFriends / ageInYears;
		System.out.println("I have made " + numberOfFriends + " friends each year of my life.");
		
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("My full name is " + fullName + ", in case you's was interested!");
	}

}
