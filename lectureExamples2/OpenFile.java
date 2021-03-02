package lectureExamples2;

import acm.program.ConsoleProgram;
import acmx.export.java.io.FileReader;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class OpenFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file pathname:  ");
        String prompt = scanner.nextLine();
        BufferedReader openedFile = fileOpener(prompt);

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
        BufferedReader rd = null;
        while (rd == null) {
            try {
                rd = new BufferedReader(new FileReader(prompt));
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
