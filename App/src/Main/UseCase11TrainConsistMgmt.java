import java.util.regex.*;

public class UseCase11TrainConsistMgmt {

    // 🔥 Train ID Validation
    public static boolean isValidTrainID(String trainID) {
        String regex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainID);
        return matcher.matches();
    }

    // 🔥 Cargo Code Validation
    public static boolean isValidCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("=== UC11: Regex Validation ===");
        System.out.println("=======================================\n");

        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainID + " -> " + isValidTrainID(trainID));
        System.out.println("Cargo Code: " + cargoCode + " -> " + isValidCargoCode(cargoCode));
    }
}