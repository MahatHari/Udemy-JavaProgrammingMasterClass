public class Main {

    public static void main(String[] args) {
	// write your code here
        StringUtilities utilities= new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length()<10){
            utilities.addChar(sb,'a');
        }
        System.out.println(sb);
        String str="abcdefg";
        String result=utilities.upperAndPrefix(utilities.addSuffix(str));
    }
}
