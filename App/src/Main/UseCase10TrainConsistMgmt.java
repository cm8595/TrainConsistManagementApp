import java.util.*;
import java.util.stream.*;

public class UseCase10TrainConsistMgmt {

    // 🔥 Method for aggregation (important for testing)
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // sum all
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("=== UC10: Total Seat Calculation ===");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury Coach", 80));

        int total = calculateTotalCapacity(bogies);

        System.out.println("Total Seating Capacity: " + total);
    }
}