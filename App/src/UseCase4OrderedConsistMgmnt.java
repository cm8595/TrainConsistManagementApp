/**
 * =========================================================
 * MAIN CLASS - UseCase4OrderedConsistMgmnt
 * =========================================================
 *
 * Use Case 4: Maintain Ordered Train Consist (LinkedList)
 *
 * Description:
 * This class demonstrates how to maintain an ordered train consist
 * using LinkedList, which preserves insertion order and allows
 * efficient insertion and deletion of bogies.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts a bogie at a specific position
 * - Removes bogies from start and end
 * - Displays final ordered train consist
 *
 * This use case introduces LinkedList and node-based structure.
 *
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.LinkedList;

public class UseCase4OrderedConsistMgmnt {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC4: Ordered Train Consist ===");
        System.out.println("=======================================\n");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies (initial order)
        System.out.println("Adding bogies...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");

        // Display after insertion
        System.out.println("After Insertion:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}