package week4;

public class SearchService {

    // 🔵 Linear Search (first occurrence)
    public static int linearFirst(TransactionLog[] arr, String target) {
        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].getAccountId().equals(target)) {
                System.out.println("Linear First Index: " + i +
                        " (Comparisons: " + comparisons + ")");
                return i;
            }
        }

        System.out.println("Not found (Comparisons: " + comparisons + ")");
        return -1;
    }

    // 🔵 Linear Search (last occurrence)
    public static int linearLast(TransactionLog[] arr, String target) {
        int comparisons = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].getAccountId().equals(target)) {
                index = i;
            }
        }

        System.out.println("Linear Last Index: " + index +
                " (Comparisons: " + comparisons + ")");
        return index;
    }

    // 🟢 Binary Search (any occurrence)
    public static int binarySearch(TransactionLog[] arr, String target) {
        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;

            int cmp = arr[mid].getAccountId().compareTo(target);

            if (cmp == 0) {
                System.out.println("Binary Found at index: " + mid +
                        " (Comparisons: " + comparisons + ")");
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Not found (Comparisons: " + comparisons + ")");
        return -1;
    }

    // 🔥 Count occurrences (using binary)
    public static int countOccurrences(TransactionLog[] arr, String target) {
        int index = binarySearch(arr, target);
        if (index == -1) return 0;

        int count = 1;

        int left = index - 1;
        while (left >= 0 && arr[left].getAccountId().equals(target)) {
            count++;
            left--;
        }

        int right = index + 1;
        while (right < arr.length && arr[right].getAccountId().equals(target)) {
            count++;
            right++;
        }

        System.out.println("Total occurrences: " + count);
        return count;
    }
}