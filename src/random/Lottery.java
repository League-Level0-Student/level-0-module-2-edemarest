package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10);
		
		
		System.out.println(randomNumber);
		
		int firstNum = randomMaker.nextInt(10);
		System.out.println(randomNumber);
		int secondNum = randomMaker.nextInt(10);
		System.out.println(randomNumber);
		int thirdNum = randomMaker.nextInt(10);
		System.out.println(randomNumber);
		int fourthNum = randomMaker.nextInt(10);
		System.out.println(randomNumber);
		int fifthNum = randomMaker.nextInt(10);
		

			JOptionPane.showMessageDialog(null, "This is your lottery ticket:  " + firstNum + secondNum + thirdNum + fourthNum + fifthNum);

				
				

		
		
		
		
		
		
		
		
		
	}

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
