import java.util.LinkedList;

/**
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase1Train {

    public static void main(String[] args) {

        // Create LinkedList for ordered bogies
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add bogies in sequence
        train.add("S1");
        train.add("S2");
        train.add("A1");

        System.out.println("Initial Train: " + train);

        // 🔹 Insert at specific position
        train.add(1, "G1"); // insert at index 1
        System.out.println("After inserting G1 at position 2: " + train);

        // 🔹 Remove from front
        train.removeFirst();
        System.out.println("After removing first bogie: " + train);

        // 🔹 Remove from rear
        train.removeLast();
        System.out.println("After removing last bogie: " + train);

        // 🔹 Final display
        System.out.println("Final Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}