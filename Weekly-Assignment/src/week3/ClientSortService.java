package week3;

public class ClientSortService {

    // 🔵 Bubble Sort (Ascending riskScore)
    public static void bubbleSort(Client[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getRiskScore() > arr[j + 1].getRiskScore()) {

                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.print("Bubble Sort (Asc): ");
        printArray(arr);
        System.out.println("Swaps: " + swaps);
    }

    // 🟢 Insertion Sort (Descending riskScore + accountBalance)
    public static void insertionSort(Client[] arr) {

        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 &&
                    (arr[j].getRiskScore() < key.getRiskScore() ||
                            (arr[j].getRiskScore() == key.getRiskScore() &&
                                    arr[j].getAccountBalance() < key.getAccountBalance()))) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.print("Insertion Sort (Desc): ");
        printArray(arr);
    }

    // 🔥 Top N highest risk clients
    public static void topRisks(Client[] arr, int topN) {
        System.out.print("Top " + topN + " risks: ");

        for (int i = 0; i < Math.min(topN, arr.length); i++) {
            System.out.print(arr[i].name + "(" + arr[i].riskScore + ") ");
        }

        System.out.println();
    }

    // helper
    public static void printArray(Client[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
