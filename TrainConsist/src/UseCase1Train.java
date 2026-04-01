import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 *
 * Use Case 10: Count Total Seats in Train
 *
 * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 *
 * @author Developer
 * @version 10.0
 */
public class UseCase1Train {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("========================================\n");

        // Step 1: Create List of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Step 2: Display all bogies
        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        // Step 3: Aggregate total seating capacity using map() and reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // Extract capacities
                .reduce(0, Integer::sum);   // Sum all capacities

        // Step 4: Display total seating capacity
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed.");
    }
}