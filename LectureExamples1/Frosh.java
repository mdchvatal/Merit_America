package LectureExamples1;

public class Frosh extends Student{

    public Frosh(String name, int id) {
        super(name, id);
        setCredits(0);
    }

    @Override
    public String toString() {
        return ("Frosh: " + getName() + "(#" + getId() + ")");
    }

}
