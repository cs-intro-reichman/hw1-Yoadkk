// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Declare my variables current value and rate at type integer 
		// Their value will be assigned by the user via the terminal 
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		// Declare the futureValue variable
		// It's value is the resault of the relevant formula
		// Create a new variable that converts rate to percentage to match the formula
		
		double ratePercentage = rate/100;
		double futureValue = currentValue*(Math.pow((1+ratePercentage), n));

		// Print the calculation message. I will also cast on the variable "futureValue" to make it an integer
		System.out.println("After " + n + " years, " + "$"+ currentValue + " saved at " + rate +"% will yield $" + (int)futureValue);

	}
}