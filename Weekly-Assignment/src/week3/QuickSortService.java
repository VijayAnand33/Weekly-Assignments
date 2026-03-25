package week3;

public class QuickSortService {

    public static void quickSort(Trade[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(Trade[] arr, int low, int high) {

        int pivot = arr[high].getVolume(); // Lomuto
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].getVolume() > pivot) { // DESC
                i++;

                Trade temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Trade temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}