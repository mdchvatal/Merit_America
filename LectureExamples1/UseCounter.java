package LectureExamples1;

import acm.program.ConsoleProgram;

public class UseCounter extends ConsoleProgram {

    public void run() {
        Lecture9 count = new Lecture9();
        Lecture9 countAgain = new Lecture9(1000);

        println("Count!");
        countFive(count);

        println("Count again!");
        countFive(countAgain);

        println("Count!");
        countFive(count);
    }

    private void countFive(Lecture9 count) {
        for (int i = 0; i < 5; i++) {
            println(count.nextValue());
        }
    }
}
