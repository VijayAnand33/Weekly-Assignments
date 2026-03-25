package week4;

import java.util.Arrays;

public class Problem5Main {

    public static void main(String[] args) {

        TransactionLog[] logs = {
                new TransactionLog("accB"),
                new TransactionLog("accA"),
                new TransactionLog("accB"),
                new TransactionLog("accC")
        };

        // 🔵 Linear Search
        SearchService.linearFirst(logs, "accB");
        SearchService.linearLast(logs, "accB");

        // 🟢 Sort for Binary Search
        Arrays.sort(logs, (a, b) ->
                a.getAccountId().compareTo(b.getAccountId()));

        System.out.println("Sorted Logs: " + Arrays.toString(logs));

        // 🟢 Binary Search
        SearchService.binarySearch(logs, "accB");

        // 🔥 Count duplicates
        SearchService.countOccurrences(logs, "accB");
    }
}