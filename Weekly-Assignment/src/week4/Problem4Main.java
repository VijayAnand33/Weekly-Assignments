package week4;

public class Problem4Main {

    public static void main(String[] args) {

        Asset[] assets = {
                new Asset("AAPL", 12, 5),
                new Asset("TSLA", 8, 9),
                new Asset("GOOG", 15, 4)
        };

        // 🔵 Merge Sort (ASC)
        MergeSortService.mergeSort(assets, 0, assets.length - 1);
        System.out.print("Merge Sort (Asc): ");
        printArray(assets);

        // 🟢 Quick Sort (DESC + volatility)
        QuickSortService.quickSort(assets, 0, assets.length - 1);
        System.out.print("Quick Sort (Desc): ");
        printArray(assets);
    }

    public static void printArray(Asset[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}