import java.util.*;

public class UseCase12TrainConsistMgmt {

    // 🔥 Method for safety validation
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                        b.getCargo().equalsIgnoreCase("Petroleum")
                );
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("=== UC12: Safety Compliance Check ===");
        System.out.println("=======================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean isSafe = isTrainSafe(bogies);

        System.out.println("Train Safety Status: " + isSafe);
    }
}