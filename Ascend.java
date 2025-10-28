
import java.time.chrono.MinguoChronology;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Declare and set the limit value
		int lim = Integer.parseInt(args[0]);
		// Declare my three integers and set them to be random numbers between 0 and the limit.
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		// Competition for min.
		int minab = Math.min(a, b);
		int minabc = Math.min(minab , c);
		// Competition for max - checked all options to create middle number.
		int maxab = Math.max(a, b);
		int maxbc = Math.max(b, c);
		int maxac = Math.max(a, c);
		int maxabc = Math.max(maxab, c);
		// Competition for middle number.
		int midNum1 = Math.min(maxab, maxbc);
		int midNum = Math.min(midNum1, maxac);
		//Print the resaults 
		System.out.println(minabc + " " + midNum + " " + maxabc);

		
	}
}
