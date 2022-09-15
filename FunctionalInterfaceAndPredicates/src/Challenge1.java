import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Challenge1 {
    public static void main(String[] args) {

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                String myString= "Let's split this up into an Array";
                String [] parts= myString.split(" " );
                for(String part:parts ){
                    System.out.println(part);
                }
            }
        };
        /* Converting to Runnable */
        Runnable runnable1=()->{
            String myString= "Let's split this up into an Array";
            String [] parts= myString.split(" " );
            for(String part:parts ){
                System.out.println(part);
            }
        };

        runnable.run();
        runnable1.run();

      Function<String, String>everySecondChar2=(String source)->{
            StringBuilder returnVal= new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if(i%2==1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

      Function<String, String> lambdaFunction=s->{
          StringBuilder returnVal= new StringBuilder();
          for (int i = 0; i < s.length(); i++) {
              if (i % 2 == 1) {
                  returnVal.append(s.charAt(i));
              }
          }
          return  returnVal.toString();
      };

        System.out.println(lambdaFunction.apply("1234567890"));
    }

    public static String everySecondChar(String source){
        StringBuilder returnVal= new StringBuilder();
        for (int i =0; i <source.length() ; i++) {
            if(i%2==1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }




}
