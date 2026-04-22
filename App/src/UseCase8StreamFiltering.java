/**
 * =========================================================
 * MAIN CLASS - UseCase8StreamFiltering
 * =========================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class demonstrates how to filter bogies based on
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates Bogie objects
 * - Stores them in a List
 * - Filters bogies using stream()
 * - Displays filtered results
 *
 * This use case introduces Stream API and functional programming.
 *
 * @author Chaitanya Bhargav
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UseCase8StreamFiltering {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC8: Stream Filtering ===");
        System.out.println("=======================================\n");

        // Create bogie list (reuse UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury Coach", 80));

        // Display original list
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal List (Unchanged):");
        bogies.forEach(System.out::println);
    }
}