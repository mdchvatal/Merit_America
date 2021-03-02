package LectureExamples1;

public class Student {
    public static final int CREDITS_NEEDED = 180;

    private String studentName;
    private int studentId;
    private int credits;

    public Student(String name, int id) {
        studentName = name;
        studentId = id;
    }

    public String getName() {
        return studentName;
    }

    public int getId() {
        return studentId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void addCredits(int earned_cred) {
        credits += earned_cred;
    }

    public boolean hasEnoughCredits() {
        return (credits >= CREDITS_NEEDED);
    }

    public String toString() {
        return studentName + " (#" + studentId +")";
    }


}
