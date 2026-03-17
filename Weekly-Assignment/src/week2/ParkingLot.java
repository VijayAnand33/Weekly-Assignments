package week2;

import java.util.*;

public class ParkingLot {

    static String[] table = new String[10];

    static int hash(String plate) {
        return Math.abs(plate.hashCode()) % table.length;
    }

    public static void park(String plate) {
        int index = hash(plate);

        while (table[index] != null) {
            index = (index + 1) % table.length;
        }

        table[index] = plate;
        System.out.println("Parked at spot " + index);
    }

    public static void main(String[] args) {
        park("ABC123");
        park("XYZ999");
        park("AAA111");
    }
}
