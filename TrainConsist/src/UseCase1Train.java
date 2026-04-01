import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */
public class UseCase1Train {

    public static void main(String[] args) {

        // Create train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("====================================");
        System.out.println(" Train Consist Management System ");
        System.out.println("====================================");

        // 🔹 ADD bogies (Create)
        System.out.println("\nAdding passenger bogies...");
        trainConsist.add("Sleeper Coach S1");
        trainConsist.add("Sleeper Coach S2");
        trainConsist.add("AC Coach A1");
        trainConsist.add("General Coach G1");

        displayTrainConsist(trainConsist);

        // 🔹 REMOVE bogie (Delete)
        System.out.println("\nRemoving a bogie (AC Coach A1)...");
        trainConsist.remove("AC Coach A1");

        displayTrainConsist(trainConsist);

        // 🔹 CHECK availability (Read)
        System.out.println("\nChecking bogie availability...");
        if (trainConsist.contains("Sleeper Coach S1")) {
            System.out.println("Sleeper Coach S1 is available in the train.");
        } else {
            System.out.println("Sleeper Coach S1 is NOT available.");
        }

        // 🔹 FINAL STATE
        System.out.println("\nFinal Train Consist:");
        displayTrainConsist(trainConsist);
    }

    /**
     * Method to display train consist
     */
    public static void displayTrainConsist(List<String> consist) {

        System.out.println("\nCurrent Train Consist:");
        System.out.println("--------------------------------");

        if (consist.isEmpty()) {
            System.out.println("No bogies attached. Train is EMPTY.");
        } else {
            for (int i = 0; i < consist.size(); i++) {
                System.out.println("Bogie " + (i + 1) + " : " + consist.get(i));
            }
        }

        System.out.println("--------------------------------");
    }
}