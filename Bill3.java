// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name1 = args[0];
		// I will start by adding two more strings which will represent the two remaining diners that will split the bill.
		// Their value will come from the 2nd and 3rd terminal arguments.
	    String name2 = args[1];
		String name3 = args[2];

		// I will also declare an integer that will represent the bill price.
		// The integer's value will come from the 4th argument.
		int bill = Integer.parseInt(args[3]);

		// Now my goal is to split the bill between the diners, round it up and represent them their bill price via the terminal.
		double finalPay = bill/3.0;
		finalPay = Math.ceil(finalPay);

		System.out.println("Dear "+ name3 + ", " + name2 + " and " + name1 + ":" + " Please pay " + finalPay + " Shekels each.");
	}
}
