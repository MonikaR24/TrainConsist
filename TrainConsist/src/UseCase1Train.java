import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * @author Developer
 * @version 7.0
 */
public class UseCase1Train {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String id;
        int seatingCapacity;

        public Bogie(String id, int seatingCapacity) {
            this.id = id;
            this.seatingCapacity = seatingCapacity;
        }

        @Override
        public String toString() {
            return id + " (Seats: " + seatingCapacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("S1", 72));
        trainConsist.add(new Bogie("A1", 48));
        trainConsist.add(new Bogie("S2", 72));
        trainConsist.add(new Bogie("G1", 90));

        // Step 2: Display unsorted bogies
        System.out.println("Unsorted Train Consist:");
        trainConsist.forEach(System.out::println);

        // Step 3: Sort bogies by seating capacity using Comparator
        trainConsist.sort(Comparator.comparingInt(b -> b.seatingCapacity));

        // Step 4: Display sorted bogies
        System.out.println("\nSorted Train Consist by Seating Capacity:");
        trainConsist.forEach(System.out::println);
    }
}