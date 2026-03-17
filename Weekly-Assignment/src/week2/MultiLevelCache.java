package week2;
import java.util.*;

public class MultiLevelCache {

    static LinkedHashMap<String, String> L1 = new LinkedHashMap<>();
    static HashMap<String, String> L2 = new HashMap<>();

    public static String getVideo(String id) {

        if (L1.containsKey(id)) {
            return "L1 Cache HIT";
        }

        if (L2.containsKey(id)) {
            L1.put(id, L2.get(id));
            return "L2 Cache HIT → Promoted to L1";
        }

        String data = "VideoData";
        L2.put(id, data);
        return "Database HIT";
    }

    public static void main(String[] args) {
        System.out.println(getVideo("video123"));
        System.out.println(getVideo("video123"));
    }
}