import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    private List<Bogie> getData() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("Luxury Coach", 80));
        return list;
    }

    @Test
    void testGreaterThanThreshold() {
        var result = UseCase8TrainConsisntMgmt.filterBogies(getData(), 70);
        assertEquals(2, result.size());
    }

    @Test
    void testEqualThreshold() {
        var result = UseCase8TrainConsisntMgmt.filterBogies(getData(), 72);
        assertTrue(result.stream().noneMatch(b -> b.getCapacity() == 72));
    }

    @Test
    void testLessThanThreshold() {
        var result = UseCase8TrainConsisntMgmt.filterBogies(getData(), 100);
        assertTrue(result.isEmpty());
    }

    @Test
    void testAllMatch() {
        var result = UseCase8TrainConsisntMgmt.filterBogies(getData(), 10);
        assertEquals(4, result.size());
    }

    @Test
    void testEmptyList() {
        var result = UseCase8TrainConsisntMgmt.filterBogies(new ArrayList<>(), 50);
        assertTrue(result.isEmpty());
    }
}