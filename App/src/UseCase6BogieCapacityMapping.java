/**
 * =========================================================
 * MAIN CLASS - UseCase6BogieCapacityMapping
 * =========================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class demonstrates how to associate each bogie with its
 * seating or load capacity using a HashMap.
 *
 * At this stage, the application:
 * - Maps bogie names to capacity
 * - Stores data using key–value pairs
 * - Iterates through entries
 * - Displays capacity details
 *
 * This use case introduces HashMap and Map concepts.
 *
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class UseCase6BogieCapacityMapping {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC6: Bogie Capacity Mapping ===");
        System.out.println("=======================================\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie capacities
        System.out.println("Adding bogie capacity details...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100); // example load capacity

        // Display mapping
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }

        // Example lookup
        System.out.println("\nChecking capacity of 'Sleeper'...");
        int capacity = bogieCapacityMap.get("Sleeper");
        System.out.println("Sleeper Capacity: " + capacity);

        System.out.println("\nNote:");
        System.out.println("HashMap enables fast lookup and efficient mapping of bogies to capacity.");
    }
}