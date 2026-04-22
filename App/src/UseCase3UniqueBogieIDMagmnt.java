/**
 * =========================================================
 * MAIN CLASS - UseCase3UniqueBogieIDMgmnt
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Description:
 * This class demonstrates how to enforce uniqueness of bogie IDs
 * using the Set interface and HashSet implementation.
 *
 * At this stage, the application:
 * - Adds bogie IDs (including duplicates)
 * - Stores them in a HashSet
 * - Automatically removes duplicates
 * - Displays only unique bogie IDs
 *
 * This use case introduces Set and HashSet concepts.
 *
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.HashSet;
import java.util.Set;

public class UseCase3UniqueBogieIDMagmnt{

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC3: Unique Bogie ID Tracking ===");
        System.out.println("=======================================\n");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (with duplicates)
        System.out.println("Adding bogie IDs (including duplicates)...");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIDs);

        // Explanation output
        System.out.println("\nNote:");
        System.out.println("Duplicate bogie IDs are automatically removed using HashSet.");
    }
}