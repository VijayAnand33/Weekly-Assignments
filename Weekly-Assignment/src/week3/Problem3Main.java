package week3;

public class Problem3Main {

    public static void main(String[] args) {

        Trade[] trades = {
                new Trade("trade3", 500),
                new Trade("trade1", 100),
                new Trade("trade2", 300)
        };

        // 🔵 Merge Sort (Ascending)
        MergeSortService.mergeSort(trades, 0, trades.length - 1);

        System.out.print("Merge Sort (Asc): ");
        printArray(trades);

        // 🟢 Quick Sort (Descending)
        QuickSortService.quickSort(trades, 0, trades.length - 1);

        System.out.print("Quick Sort (Desc): ");
        printArray(trades);

        // 🔥 Total Volume
        int total = totalVolume(trades);
        System.out.println("Total Volume: " + total);

        // 🔁 Merge two sorted lists
        Trade[] morning = {
                new Trade("m1", 100),
                new Trade("m2", 300)
        };

        Trade[] afternoon = {
                new Trade("a1", 200),
                new Trade("a2", 400)
        };

        Trade[] merged = mergeTwoSorted(morning, afternoon);

        System.out.print("Merged Lists: ");
        printArray(merged);
    }

    // helper print
    public static void printArray(Trade[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // total volume
    public static int totalVolume(Trade[] arr) {
        int sum = 0;
        for (Trade t : arr) {
            sum += t.getVolume();
        }
        return sum;
    }

    // merge two sorted arrays (ascending)
    public static Trade[] mergeTwoSorted(Trade[] a, Trade[] b) {
        Trade[] result = new Trade[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].getVolume() <= b[j].getVolume()) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length)
            result[k++] = a[i++];

        while (j < b.length)
            result[k++] = b[j++];

        return result;
    }
}