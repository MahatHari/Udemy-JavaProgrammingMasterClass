import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> langauges= new HashMap<>();

        langauges.put("Java", " a complied high level, object oriented platform independent language");
        langauges.put("Python", " an interpreted, object-oriented, high-level programming language");

        System.out.println(langauges.get("Java"));

        for(String key: langauges.keySet()){
            System.out.println(key + " : "+ langauges.get(key));
        }
    }
}
