import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase1Train {

    public static void main(String[] args) {

        // Step 1: Initialize an empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Step 2: Display initial bogie count
        System.out.println("=== Train Consist Management System ===");
        System.out.println("Initializing train consist...");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Step 3: Display current state of the train
        displayTrainConsist(trainConsist);
    }

    /**
     * Method to display the current state of the train consist
     */
    public static void displayTrainConsist(List<String> consist) {
        System.out.println("\nCurrent Train Consist:");

        if (consist.isEmpty()) {
            System.out.println("No bogies attached. Train is empty.");
        } else {
            for (int i = 0; i < consist.size(); i++) {
                System.out.println("Bogie " + (i + 1) + ": " + consist.get(i));
            }
        }
    }
}