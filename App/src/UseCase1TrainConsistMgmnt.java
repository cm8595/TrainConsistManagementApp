/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 * =========================================================
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
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=======================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current state of train
        System.out.println("\nCurrent Train Consist: " + trainConsist);

        // Adding sample bogies (for demo purpose)
        trainConsist.add("Engine");
        trainConsist.add("Passenger Coach 1");
        trainConsist.add("Passenger Coach 2");

        // Display updated consist
        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Updated Bogie Count: " + trainConsist.size());
        System.out.println("Train Consist: " + trainConsist);
    }
}