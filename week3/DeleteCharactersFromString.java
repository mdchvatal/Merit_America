package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String line = readLine("Enter a word or phrase:  ");
			char char1 = readLine("Enter character to be removed:  ").charAt(0);
			print(deleteCharacterFromString(char1, line));
		}
	}

	private String deleteCharacterFromString(char ch, String str) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				newString += str.charAt(i);
			}
		}
		return newString+"\n";
	}

	
}
