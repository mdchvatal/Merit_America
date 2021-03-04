package week4;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {
	int charCount = 0;
	int wordCount = 0;
	
	public void run() {
		BufferedReader reader = fileOpener("Enter file name: ");
		int lineCount = lineCounter(reader);
		print("Lines: " + lineCount + "\n");
		print("Words: " + wordCount + "\n");
		print("Characters: " + charCount + "\n");
	}
	
	public BufferedReader fileOpener(String filePath) {
		BufferedReader rd = null;
		while (rd == null) {
			try {
				String name = readLine(filePath);
				rd = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				println("Bad File Name or Path");
			}
		}
		return rd;
	}
	
	public int lineCounter(BufferedReader reader) {
		int lineCount = 0;
		while (true) {
			try {
				 String line = reader.readLine();
				 if (line == null) {break;}
				 String[] wordCounter = line.split("\\s+");
				 wordCount += wordCounter.length;
				 charCounter(line);
				 lineCount++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		closeFile(reader);
		return lineCount;
	}
	
	public void charCounter(String line) {
		for (int i = 0; i < line.length(); i++) {
			charCount++;
		}
	}
	
	public void closeFile(BufferedReader reader) {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
