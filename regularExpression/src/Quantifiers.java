import javax.naming.MalformedLinkException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        String alphaNumeric= "abcDeeeeeeF12Ghhiiiiiiijlk23429999";
        System.out.println(alphaNumeric.replaceAll("^abcDeee", "X"));

        // Using quantifier the above can be written as
        System.out.println(alphaNumeric.replaceAll("^abcDe{3}", "Z"));

        //  starts with abcDe and 1 or more e after e
        System.out.println(alphaNumeric.replaceAll("^abcDe+", "Z"));

        //  starts with abcD and have or not have e
        System.out.println(alphaNumeric.replaceAll("^abcDe*", "X"));

        // between 2 and 5 e
        System.out.println(alphaNumeric.replaceAll("^abcDe{2,5}", "Y"));

        // one or more h, hence use + followed by 0 or more i hence use * ,  followed by j
        System.out.println(alphaNumeric.replaceAll("h+i*j", "»»»»"));


        // Patterns and Matchers
        StringBuilder htmlTexxt= new StringBuilder("<h1>My Heading </h1>");
        htmlTexxt.append("<h2>Sub Heading </h2>");
        htmlTexxt.append("<p> This is my paragraphs</p>");
        htmlTexxt.append("<h2>Another heading </h2>");
        htmlTexxt.append("<p> Another paragraph of mine </p>");
        htmlTexxt.append("<h2>Summary </h2>");
        htmlTexxt.append("<p>This is summary </p>");

        // patter anything before 0 or more times .*<h2>*. and anything after
        String h2pattern= "<h2>"; //
        Pattern pattern= Pattern.compile(h2pattern );  // to case ignore, pass as argument Pattern.CASE_INSENSITIVE
        Matcher matcher= pattern.matcher(htmlTexxt);
        System.out.println(matcher.matches());

        // how many times
        // matcher has to be reset to run again, as line 40 already sets it to true
        matcher.reset();
        int count=0;
        while (matcher.find()){
            count++;
            System.out.println("Occurance "+ count+ ": "+ matcher.start()+ " to "+ matcher.end());
        }

        System.out.println("=======Using Grouping ============");

        // Group Patter ()
        String h2groupPattern= "(<h2>.*?</h2>)"; // Greedy Quantifiers, and adding ? makes it lazy quantifiers
        Pattern groupPattern = Pattern.compile(h2groupPattern);
        Matcher groupMatcher= groupPattern.matcher(htmlTexxt);
        System.out.println(groupMatcher.matches());

        // reset matcher
        groupMatcher.reset();

        // count the matches at indexes
        int count2=0;
        while (groupMatcher.find()){
            count2++;
            System.out.println("Occurance "+ count2+ ": "+" Group: "+groupMatcher.group(1)+ "\t" +groupMatcher.start()+ " to "+ groupMatcher.end());
        }

        // Multiple Groups
        // Wanted the text between tags and not actually tags themselves

        String h2TextGroups= "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern= Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher= h2TextPattern.matcher((htmlTexxt));

        while (h2TextMatcher.find()){
            System.out.println("Occurrence: "+ h2TextMatcher.group(2)); // .group(1) <h2> .group(2) all inside .group(</h2)
        }

        // "abc" "a" and "b" and "c"
        // [Hh]arry -> [H|h]arry -> H or h
        // [^abc] -> not abc
        //  to NotV RexEXp -> t[^V] or "t(?!v)"
        // all matches followed by v  "t(?=v)


        System.out.println("=========US Sample Phone Number ========");
        // Sample Us Phone Number
        String phone1= "123456789"; // should not match
        String phone2 = "(800) 123-4567"; // should  match
        String phone3 = "123 456-2342"; // should not match
        String  phone4 = "(123) 345-2342"; // should  match
        // "^([\(]{1}(0-9){3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$";

        System.out.println("Phone1 = "+ phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone2 = "+ phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone3 = "+ phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone4 = "+ phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));


        // VISA CARD
        // visa card starts with 4 and have 16 digits
        // ^4[0-9]{12}([0-9]{3})?$ -> Final 3 digits are optional group for new cards,
        String visa1= "444423424234234"; // should not match
        String visa2 = "4123456789011"; // should  match
        String visa3 = "567890123456"; // should not match
        String  visa4 = "4567890987678988"; // should  match

        System.out.println("Visa 1 = " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("Visa 2 = " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("Visa 3 = " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("Visa 4 = " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));

    }
}
