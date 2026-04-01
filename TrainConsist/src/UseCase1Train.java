import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase1Train
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Ensures no duplicate bogie IDs are added.
 */
public class UseCase1Train {

    public static void main(String[] args) {

        // HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogies
        System.out.println("Adding Bogie IDs...");

        bogieIds.add("S1");
        bogieIds.add("S2");
        bogieIds.add("A1");
        bogieIds.add("S1"); // duplicate

        // Display result
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Check duplicate manually
        boolean added = bogieIds.add("A1");
        if (!added) {
            System.out.println("\nDuplicate Bogie ID 'A1' not added.");
        }
    }
}