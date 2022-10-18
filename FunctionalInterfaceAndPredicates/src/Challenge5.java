import java.util.function.Function;
import java.util.function.Supplier;

public class Challenge5 {
    public static void main(String[] args) {

        Function<String, String> lambdaFunction= s->{
            StringBuilder returnVal= new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i%2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        /** » »»»»»»»  Challenge No 6 */
        // Lambda Function maps to java.util.Supplier Interface
        Supplier<String> iLoveJava=()->"I Love Java!";

        /**   »»» Challenge No 7 »»»   Using supplierResult of Challenge no6 .*/
        String supplierResult= iLoveJava.get();
        System.out.println(supplierResult);

        System.out.println(everySecondCharacter(lambdaFunction, "01234567890"));
    }
    public static String everySecondCharacter(Function<String, String>fn, String source){
        return fn.apply(source);
    }
}
