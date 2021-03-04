package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Histograms extends ConsoleProgram {
	private String[][] scoreList = new String[11][2];
	private String file = "Scores.txt";
	
	public void run() {
		setUpScoreList();
		fileOpener(file);
		printHistogram(scoreList);
	}
	
	public void setUpScoreList() {
		int scoreRangeLow = 0;
		int scoreRangeHigh = 9;
		for (int i = 0; i <= (scoreList.length - 2); i++) {
			scoreList[i][0] = scoreRangeLow + " - " + scoreRangeHigh;
			scoreRangeLow += 10;
			scoreRangeHigh += 10;
			scoreList[i][1] = "";
		}
		scoreList[scoreList.length - 1][0] = "100";
		scoreList[scoreList.length - 1][1] = "";
	}
	
	public BufferedReader fileOpener(String fileName) {
		BufferedReader rd = null;
		while (rd == null) {
			try {
				rd = new BufferedReader(new FileReader(fileName));
				readFile(rd);
			} catch (IOException ex) {
				println("Bad File Name or Path");
			}
		}
		return rd;
	}
	
	public void readFile(BufferedReader reader) {
		while (true) {
			try {
				 String score = reader.readLine();
				 if (score == null) {
					 break;
					 } else {
				 readInValues(Integer.parseInt(score));
				 } 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			reader.close();
		} catch (IOException e) {
			print("Something went wrong with closing your file");
		}
	}
	
	public void readInValues(int score) {
		if (score <= 9) {
			scoreList[0][1] += "*";
		} 
		else if (score > 9 && score <= 19) {
			scoreList[1][1] += "*";
		}
		else if (score > 19 && score <= 29) {
			scoreList[2][1] += "*";
		}
		else if (score > 29 && score <= 39) {
			scoreList[3][1] += "*";
		}
		else if (score > 39 && score <= 49) {
			scoreList[4][1] += "*";
		}
		else if (score > 49 && score <= 59) {
			scoreList[5][1] += "*";
		}
		else if (score > 59 && score <= 69) {
			scoreList[6][1] += "*";
		}
		else if (score > 69 && score <= 79) {
			scoreList[7][1] += "*";
		}
		else if (score > 79 && score <= 89) {
			scoreList[8][1] += "*";
		}
		else if (score > 89 && score <= 99) {
			scoreList[9][1] += "*";
		}
		else if (score == 100) {
			scoreList[10][1] += "*";
		}
	}
	
	public void printHistogram(String[][] hist) {
		for (int i = 0; i < hist.length; i++) {
				print(hist[i][0] + ": " + hist[i][1]);
		}
	}
	
}
