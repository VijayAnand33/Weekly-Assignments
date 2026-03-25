package week3;

public class Problem2Main {

    public static void main(String[] args) {

        Client[] clients = {
                new Client("clientC", 80, 5000),
                new Client("clientA", 20, 3000),
                new Client("clientB", 50, 4000)
        };

        // Bubble Sort (ascending)
        ClientSortService.bubbleSort(clients);

        // Insertion Sort (descending)
        ClientSortService.insertionSort(clients);

        // Top risks
        ClientSortService.topRisks(clients, 3);
    }
}