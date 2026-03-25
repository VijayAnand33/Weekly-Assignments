package week3;
import java.util.ArrayList;

public class Problem1Main {

    public static void main(String[] args) {

        ArrayList<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("id1", 10.5, "10:00"));
        transactions.add(new Transaction("id2", 25.0, "09:30"));
        transactions.add(new Transaction("id3", 5.0, "10:15"));

        BubbleSortService.sortByFee(transactions);
    }
}