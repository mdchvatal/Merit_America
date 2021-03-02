package lectureExamples2;

import acm.program.ConsoleProgram;

public class NameReverser extends ConsoleProgram{
	public void run() {
		while (true) {
			lineRunner(readLine("Enter your name: "));
		}
	}
	
	public void lineRunner(String name) {
		while (name != "stop") {
		nameReverser(name);
		}
	}
	
	public String nameReverser(String name) {
		String tempString = "";
		for (int i = 1; i <= name.length(); i++) {
				tempString += name.charAt(name.length()-i);
		}
		return tempString;
	}
	

}
