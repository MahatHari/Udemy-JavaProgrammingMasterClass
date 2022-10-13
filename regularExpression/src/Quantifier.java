public class Quantifier {
    public static void main(String[] args) {

        // Either upper or lower case
        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String str= "abcdDeeF12Ghiiiijkl999z";

        // ^Inside square bracket, Negates, matches all that are not ej
        System.out.println(str.replaceAll("[^ej]", "X"));

        // replace all that matches what's inside square brackets

        System.out.println(str.replaceAll("[acde2243]", "Y"));

        // [a-f][3-8, any character in between a and f and any number between 3 and 8
        System.out.println(str.replaceAll("[abcdef345678]", "Z")); // ZZZZDZZF12Ghiiiijkl999z
        System.out.println(str.replaceAll("[a-f3-8]", "Z")); //ZZZZDZZF12Ghiiiijkl999z
        // Ignore Case
        System.out.println(str.replaceAll("(?i)[a-f3-8]", "Y"));

        // replace All numbers, or all digits
        System.out.println(str.replaceAll("[0-9]", "X"));
        System.out.println(str.replaceAll("\\d", "-"));

        // Replace all Non Digit characters
        System.out.println(str.replaceAll("\\D", "*"));

        // remove white spaces
        String hasWhitespaces= " I have balnks and\ta tab, and also a new line \n";
        System.out.println(hasWhitespaces);
        System.out.println(hasWhitespaces.replaceAll("\\s", ""));

        // replace only tab
        System.out.println(hasWhitespaces.replaceAll("\t", "X"));

        // replace all non white characters
        System.out.println(hasWhitespaces.replaceAll("\\S", "-"));

        // replace all alphanumeric characters
        System.out.println(str.replaceAll("\\w", "*"));

        // replace all non alphaNumeric characters
        System.out.println(hasWhitespaces.replaceAll("\\W", "X"));

        // replace space around word
        System.out.println(hasWhitespaces.replaceAll("\\b", "X"));
        String oneWord="hello";
        System.out.println(oneWord.replaceAll("\\b", "X"));


    }
}
