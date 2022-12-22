import java.util.HashMap;
import java.util.Map;


public class Map7 {
    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        input.put("c", "cake");

        Map<String, String> res = mapAB2(input);
        System.out.println(res);
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
	if((map.containsKey("a") && map.containsKey("b"))&&(map.get("a").equals(map.get("b")))){	
      map.remove("a");
      map.remove("b");// your code goes here
    }
       return map;

}
       }      