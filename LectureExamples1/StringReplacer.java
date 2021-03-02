package LectureExamples1;

public class StringReplacer {

    String stringReplacer(String str, String orig, String replacement) {
        int index = str.indexOf(orig);
        str = str.substring(0, index) + replacement + str.substring(index+orig.length());
        return str;
    }
}
