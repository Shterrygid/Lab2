import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String inputString = "abcdefghijklmnopqrstuv18340";
        String patternString = "abcdefghijklmnopqrstuv18340";

        if (isMatch(inputString, patternString)) {
            System.out.println("Строка соответствует заданному шаблону.");
        } else {
            System.out.println("Строка не соответствует заданному шаблону.");
        }
    }

    private static boolean isMatch(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        return m.matches();
    }
}