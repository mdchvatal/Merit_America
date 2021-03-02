package LectureExamples1;

public class StringProc {

    public static void main(String[] args) {
        StringReplacer StrRepl = new StringReplacer();
        String str = "Some string, don't fucking worry about it.";
        System.out.println(StrRepl.stringReplacer(str, "fucking", "****"));
    }

}
