package week1;

import java.util.*;

public class FlashSale {
    static HashMap<String, Integer> stock = new HashMap<>();
    static Queue<Integer> waitingList = new LinkedList<>();

    public static void purchaseItem(String product, int userId) {
        int count = stock.getOrDefault(product, 0);

        if (count > 0) {
            stock.put(product, count - 1);
            System.out.println("Success. Remaining: " + (count - 1));
        } else {
            waitingList.add(userId);
            System.out.println("Added to waiting list");
        }
    }

    public static void main(String[] args) {
        stock.put("IPHONE15", 2);

        purchaseItem("IPHONE15", 1);
        purchaseItem("IPHONE15", 2);
        purchaseItem("IPHONE15", 3);
    }
}