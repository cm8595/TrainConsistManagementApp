/**
 * =========================================================
 * MAIN CLASS - UseCase5OrderedUniqueFormation
 * =========================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Description:
 * This class demonstrates how to maintain both uniqueness and
 * insertion order of train bogies using LinkedHashSet.
 *
 * At this stage, the application:
 * - Adds bogies to the train formation
 * - Prevents duplicate bogies
 * - Maintains insertion order
 * - Displays final formation
 *
 * This use case introduces LinkedHashSet.
 *
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5OrderedUniqueFormation {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC5: Ordered Unique Formation ===");
        System.out.println("=======================================\n");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        System.out.println("Attaching bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        System.out.println("\nAttempting to add duplicate 'Sleeper'...");
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        // Explanation
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet maintains insertion order and removes duplicates automatically.");
    }
}