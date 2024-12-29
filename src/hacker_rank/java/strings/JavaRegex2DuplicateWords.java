package hacker_rank.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1)+\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        /*
        \\b(\\w+): Captures a single word in Group 1.
        (\\s+\\1)+: Matches one or more repetitions of the captured word.
        \\b: Ensures the match is at word boundaries.
        */
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("(?i)" + regex, "$1");
                //   Added (?i) to the regex string to explicitly enable case-insensitivity.
                //   $1: Refers to the first capturing group (the original word)
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
