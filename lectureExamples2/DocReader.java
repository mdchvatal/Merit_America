package lectureExamples2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocReader {

	public static void main(String[] args) {
		BufferedReader openedFile = fileOpener("Please enter the file pathname: ");

		try {
			while (true) {
				String line = lineReader(openedFile);
				if (line == null) break;
				System.out.println(line);
			}
			openedFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static BufferedReader fileOpener(String prompt) {
		Console console = System.console();
		BufferedReader rd = null;
		while (rd == null) {
			try {
				String name = console.readLine(prompt);
				rd = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				System.out.println("Bad File Name or Path");
			}
		}
		return rd;
	}


	public static String lineReader(BufferedReader rd) {
		while (true) {
			String line = null;
			try {
				line = rd.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return line;
		}
	}
}

