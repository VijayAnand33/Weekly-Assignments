package week2;

import java.util.*;

public class AutoComplete {

    static HashMap<String, Integer> queries = new HashMap<>();

    public static void addQuery(String q) {
        queries.put(q, queries.getOrDefault(q, 0) + 1);
    }

    public static void search(String prefix) {
        queries.entrySet().stream()
                .filter(e -> e.getKey().startsWith(prefix))
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        addQuery("java tutorial");
        addQuery("javascript");
        addQuery("java download");

        search("jav");
    }
}