package week3;

import java.util.ArrayList;

public class BubbleSortService {

    public static void sortByFee(ArrayList<Transaction> list) {
        int n = list.size();
        int swaps = 0;
        int passes = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            passes++;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getFee() > list.get(j + 1).getFee()) {

                    Transaction temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Sorted Transactions: " + list);
        System.out.println("Passes: " + passes + ", Swaps: " + swaps);
    }
}