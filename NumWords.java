// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		
		// Declare num - the integer that we will divide to hundreds, tens and ones.
		// The input will come from the terminal
		int num = Integer.parseInt(args[0]);
		// I make versions of the numbers where the hundred||ten , and one values are 0 
		int zerosAfterThousand = (num/1000)*1000; // if num = 12331322 -> zerosAfterThousand = 1231000
		int zerosAfterHundreds = (num/100)*100; // if num = 12331322 -> zerosAfterHundred = 1231300

		// I take my zerosAfter values and subtract them from the original number in order to get a 3 or 2 digit number

		int hundreds = (num - zerosAfterThousand)/100; // Now there must be a 3 digit number and when i devide by 100 i get the numbers of hundreds
		int tens = (num - zerosAfterHundreds)/10; // Now there must be a 2 digit number and when i devide by 10 i get the numbers of tens
		int ones = (num - zerosAfterHundreds) - tens*10; // In this formula i get the last 2 digit and subtract it by the tens to get a single number - and thats my number of ones!
		

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


		

	}
}
