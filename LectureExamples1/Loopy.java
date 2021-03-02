package LectureExamples1;
import acm.program.*;

public class Loopy extends ConsoleProgram {
    private static final int SENTINEL = 0;

    public void run() {
        int total = 0;

        while (true){
            int val = readInt("Enter val:  ");
            if (val == SENTINEL) break;
            total += val;

        }
        println("Total = " + total);

    }
}
