import java.util.Map;
import java.util.Set;

public class URLUtils {
    private static String uri = "http://hadoop02/index.html";
    public static String getUrl(Map<String,String> map){
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        String url = "";

        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println("hello world");
        }
        return url;
    }
}
