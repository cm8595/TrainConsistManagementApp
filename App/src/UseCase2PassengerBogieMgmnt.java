/**
 * =========================================================
 * MAIN CLASS - UseCase2PassengerBogieMgmnt
 * =========================================================
 *
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Description:
 * This class demonstrates dynamic management of passenger bogies
 * in a train consist using ArrayList.
 *
 * At this stage, the application:
 * - Adds passenger bogies dynamically
 * - Displays bogie list
 * - Removes a bogie
 * - Checks existence of a bogie
 *
 * This use case introduces CRUD operations using ArrayList.
 *
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase2PassengerBogieMgmnt {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC2: Passenger Bogie Management ===");
        System.out.println("=======================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies (CREATE)
        System.out.println("Adding passenger bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies (READ)
        System.out.println("\nCurrent Passenger Bogies:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After Removal:");
        System.out.println(passengerBogies);

        // Check existence (SEARCH)
        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);
    }
}