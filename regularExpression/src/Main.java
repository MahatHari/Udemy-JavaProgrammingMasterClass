public class Main {

    public static void main(String[] args) {
	// write your code here
        /** Basic Regular Expression */
        String str= "I am a string. Yes, I am ";
        System.out.println(str);
        String yourStr= str.replace("I", "You");
        System.out.println(yourStr);

        String alphaNumeric= "abcdefgh1235345";
        // . -> as wild, that matches all character
        System.out.println(alphaNumeric.replaceAll(".", "Y"));

        // ^ ->  boundary, starts with
        String secondString= "abcDeeeasdfasdfwfsadf";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        // String.matches -> checks whole string to match, if complete match returns true otherwise false

        System.out.println(alphaNumeric.matches("^abc"));

        // $ -> boundary, at the end
        System.out.println(alphaNumeric.replaceAll("345$", "AAA"));

        // match and replace
        System.out.println(alphaNumeric.replaceAll("efgh", "The End"));

        // match specific set of characters
        String sentence= "The black fox jumps over the lazy dog";
        System.out.println(sentence.replaceAll("[ae]", "X"));

        // a or e followed by c or z or r, replace ac or az or ar or, ecm ez, or er by Y
        System.out.println(sentence.replaceAll("[ae][czr]", "Y"));
    }
}
