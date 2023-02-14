package no.data;

public class StringUtils {


    public static boolean isSubstringOfAlphabet(String string) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.contains(string.toLowerCase());
    }
}
