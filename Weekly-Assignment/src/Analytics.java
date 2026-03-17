import java.util.*;

public class Analytics {

    static HashMap<String, Integer> pageViews = new HashMap<>();
    static HashMap<String, HashSet<String>> uniqueVisitors = new HashMap<>();

    public static void processEvent(String url, String user) {
        pageViews.put(url, pageViews.getOrDefault(url, 0) + 1);

        uniqueVisitors.putIfAbsent(url, new HashSet<>());
        uniqueVisitors.get(url).add(user);
    }

    public static void main(String[] args) {
        processEvent("/news", "user1");
        processEvent("/news", "user2");
        processEvent("/news", "user1");

        System.out.println("Views: " + pageViews);
        System.out.println("Unique Visitors: " + uniqueVisitors);
    }
}