import java.util.HashMap;
import java.util.Map;

/**
 * MAIN CLASS - UseCase6TrainConsistMgunt
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * @author Developer
 * @version 6.0
 */
public class UseCase6TrainConsistMgunt {

    public static void main(String[] args) {

        // HashMap to store bogie -> capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // 🔹 Insert bogie capacities
        bogieCapacity.put("S1", 72);   // Sleeper Coach seats
        bogieCapacity.put("S2", 72);
        bogieCapacity.put("A1", 48);   // AC Coach seats
        bogieCapacity.put("G1", 90);   // General Coach capacity
        bogieCapacity.put("L1", 200);  // Load/Parcel Coach capacity

        // 🔹 Display bogie-capacity information
        System.out.println("Train Bogie Capacities:");
        System.out.println("----------------------");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // 🔹 Lookup example
        String lookupBogie = "A1";
        if (bogieCapacity.containsKey(lookupBogie)) {
            System.out.println("\nLookup: Bogie " + lookupBogie + " has capacity " + bogieCapacity.get(lookupBogie));
        } else {
            System.out.println("\nBogie " + lookupBogie + " not found.");
        }
    }
}