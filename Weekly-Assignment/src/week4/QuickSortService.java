package week4;

import java.util.Random;

public class QuickSortService {

    public static void quickSort(Asset[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = medianOfThree(arr, low, high); // better pivot
            swap(arr, pivotIndex, high);

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(Asset[] arr, int low, int high) {

        Asset pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (compare(arr[j], pivot)) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // DESC returnRate + ASC volatility
    private static boolean compare(Asset a, Asset b) {
        if (a.getReturnRate() > b.getReturnRate()) return true;
        if (a.getReturnRate() == b.getReturnRate())
            return a.getVolatility() < b.getVolatility();
        return false;
    }

    // Median of 3 pivot
    private static int medianOfThree(Asset[] arr, int low, int high) {
        int mid = (low + high) / 2;

        double a = arr[low].getReturnRate();
        double b = arr[mid].getReturnRate();
        double c = arr[high].getReturnRate();

        if ((a > b && a < c) || (a < b && a > c)) return low;
        if ((b > a && b < c) || (b < a && b > c)) return mid;
        return high;
    }

    private static void swap(Asset[] arr, int i, int j) {
        Asset temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}