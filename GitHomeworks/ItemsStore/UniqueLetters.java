import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueLetters {


    public static void main(String[] args) {
        Set <String> linkedStrings = new LinkedHashSet<>();

        linkedStrings.add("This");
        linkedStrings.add(" is");
        linkedStrings.add(" a");
        linkedStrings.add(" text");
        linkedStrings.add(" test.");

        System.out.println(linkedStrings);




        String test = "This is a test text";

        String [] chars = test.split("");
        Set<String> uniqueChars = new LinkedHashSet<>();
        for (String s : chars) {
            uniqueChars.add(s);
        }
        System.out.println(uniqueChars);


        }


    }



