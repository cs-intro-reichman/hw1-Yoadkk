// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		// Declare num - the integer that we will divide to hundreds, tens and ones.
		// The input will come from the terminal
		int num = Integer.parseInt(args[0]);

		int hundreds = num/100; // This just gives me the number of the hundreds without a limit - if a number is 5000 it will give you the number of all the hundreds - in this case - 50
		int tens = (num-(hundreds*100))/10; //Now there must be a 2 digit number and when i devide by 10 i get the numbers of tens
		int ones = (num-(hundreds*100)) - (tens*10); // In this formula i get the last 2 digit and subtract it by the tens to get a single number - and thats my number of ones!

		// Print the message 
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


		

	}
}
