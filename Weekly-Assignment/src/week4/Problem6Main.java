package week4;

import java.util.Arrays;

public class Problem6Main {

    public static void main(String[] args) {

        int[] risks = {10, 25, 50, 100};

        int target = 30;

        // 🔵 Linear Search (unsorted case)
        RiskSearchService.linearSearch(risks, target);

        // 🟢 Ensure sorted for binary
        Arrays.sort(risks);
        System.out.println("Sorted Risks: " + Arrays.toString(risks));

        // 🟢 Binary insertion point
        RiskSearchService.binaryInsertionPoint(risks, target);

        // 🔥 Floor & Ceiling
        int floor = RiskSearchService.floor(risks, target);
        int ceil = RiskSearchService.ceiling(risks, target);

        System.out.println("Floor(" + target + "): " + floor);
        System.out.println("Ceiling(" + target + "): " + ceil);
    }
}