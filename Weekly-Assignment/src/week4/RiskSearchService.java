package week4;

public class RiskSearchService {

    // 🔵 Linear Search (unsorted)
    public static int linearSearch(int[] arr, int target) {
        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == target) {
                System.out.println("Linear Found at index: " + i +
                        " (Comparisons: " + comparisons + ")");
                return i;
            }
        }

        System.out.println("Linear: Not found (Comparisons: " + comparisons + ")");
        return -1;
    }

    // 🟢 Binary Search (find insertion point)
    public static int binaryInsertionPoint(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;

            if (arr[mid] == target) {
                System.out.println("Exact match at index: " + mid);
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Insertion index: " + low +
                " (Comparisons: " + comparisons + ")");
        return low;
    }

    // 🔥 Floor (largest ≤ target)
    public static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // 🔥 Ceiling (smallest ≥ target)
    public static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}