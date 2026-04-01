import java.util.LinkedHashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase5TrainConsistMgunt
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */
public class UseCase1Train {

    public static void main(String[] args) {

        // LinkedHashSet to store unique bogies in insertion order
        Set<String> trainConsist = new LinkedHashSet<>();

        // 🔹 Attach bogies in order
        trainConsist.add("S1");
        trainConsist.add("S2");
        trainConsist.add("A1");
        trainConsist.add("G1");

        // Attempt to add duplicate
        boolean added = trainConsist.add("S1");
        if (!added) {
            System.out.println("Duplicate bogie 'S1' not added.");
        }

        // 🔹 Display final train formation
        System.out.println("\nFinal Train Consist (Ordered & Unique):");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}