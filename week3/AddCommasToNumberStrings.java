package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string:  ");
			if (digits.length() == 0) break;
			if (digits.length() > 3) {
				println(addCommasToNumericString(digits));
			}
		}
	}

	private String addCommasToNumericString(String numString) {
		String tempString = "";
			for (int i = 1; i <= numString.length(); i++) {
				tempString = numString.charAt(numString.length()-i) + tempString;
				if (i%3==0 && i != numString.length()) {
					tempString = "," + tempString;
				}
			}
		return tempString;
	}
}
