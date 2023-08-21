import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * We can import java.util.regex package to work with regular expressions.
 * The package includes the following classes:
 * - Pattern Class: Defines a pattern (to be used in a search)
 * - Matcher Class: Used to search for the pattern
 * - PatternSyntaxException Class: Indicates syntax error in a regular expression pattern
 */
class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W2Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}