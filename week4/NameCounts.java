package week4;

import acm.program.ConsoleProgram;

import java.util.HashMap;

public class NameCounts extends ConsoleProgram {

	private HashMap<String, Integer> nameList = new HashMap<>();
	
	public void run() {
		readNames();
		printNames(nameList);
	}

	public void readNames() {
		while (true) {
			String nextName = readLine("Enter a name. " + "\n" +
					"If there are no new names, press \"Enter\": ");
			if (nextName.equals("")) break;
			nameOrIncrement(nextName);
		}
	}

	public void nameOrIncrement(String name) {
		if (!nameList.containsKey(name)) {
			nameList.put(name, 1);
		} else {incrementNameCount(name);}
	}

	public void incrementNameCount(String name) {
		int tempCount = nameList.get(name);
		tempCount++;
		nameList.put(name, tempCount);
	}

	public void printNames(HashMap<String, Integer> list) {
		list.forEach((String, Integer) -> {
			println("Entry " + String + " has count " + Integer);
		});
	}

}
