package week2;
import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	public static final int MAX_TERM_VALUE = 10000;

	public void run() {
		int fib1;
		int fib2 = 1;
		int fib3 = 0;
		int counter = 0;
		println("This program prints numbers in the Fibonacci sequence whose values are less than 10,000.");
		while (fib3 < MAX_TERM_VALUE) {
			print("F" + counter + ":");
			println(fib3);
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1 + fib2;
			counter++;
		}
	}
}
