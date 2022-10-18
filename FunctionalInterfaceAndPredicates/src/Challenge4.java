import java.util.function.Function;

public class Challenge4 {
    public static void main(String[] args) {

        Function<String, String> everySecond=s->{
            StringBuilder returnVal= new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i%2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        everySecondCharacter(everySecond, "1234567890");
    }
    public  static void everySecondCharacter(Function<String, String> fn, String s){
        String returnedVal= fn.apply(s);
        System.out.println("Returned Val: " +returnedVal);
    }

}
