package LectureExamples1;

public class Lecture9 {
    private static int counter;

    public Lecture9(int startValue) {
        counter = startValue;
    }

    public Lecture9() {
        counter = 1;
    }

    public int nextValue() {
        int temp =  counter;
        counter++;
        return temp;
    }
}
