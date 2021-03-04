package week4;

import java.util.List;
import java.util.ArrayList;


import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {
	private static String SENTINEL = "";
	private ArrayList<String> nameArrayList = new ArrayList<String>();
	private String prompt = "Enter a name: ";
	
	public void run() {
		promptForName(prompt);
		printList(nameArrayList);

	}
	
	public void promptForName(String prompt) {
		while (true) {
			String tempName = readLine(prompt);
			if (tempName.equals(SENTINEL)) {
				break;
			}
			addNameOrNot(tempName);
		}
	}
	
	public void addNameOrNot(String name) {
		if (!nameArrayList.contains(name)) {
			nameArrayList.add(name);
		}
	}
	
	public void printList(ArrayList<String> al) {
		println("Unique name list contains: \n");
		al.forEach((i) -> println(i));
	}
	
}
