import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - UseCase9TrainConsistMgnnt
 *
 * Use Case 9: Group Bogies by Type
 *
 * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy().
 *
 * @author Developer
 * @version 9.0
 */
public class UseCase1Train {

    // Reusing Bogie model from UC7 / UC8
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Capacity -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("========================================\n");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Display all bogies
        System.out.println("ALL Bogies:");
        bogies.forEach(b -> System.out.println(b.name + " -> " + b.capacity));

        // Step 3: Group bogies by type using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 4: Display grouped structure
        System.out.println("\nGrouped Bogies:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("\nBogie Type: " + type);
            list.forEach(b -> System.out.println(b));
        });

        System.out.println("\nUC9 grouping completed.");
    }
}