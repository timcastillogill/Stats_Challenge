import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculatorTest {

    @Test
    @DisplayName("Example Test for ")
    void printCalculations() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(6, 9, 15, -2, 92, 11));
        StatsCalculator statsCalculator = new StatsCalculator(stats);

        String expected = "o) minimum value = -2\n" +
                "o) maximum value = 92\n" +
                "o) number of elements in the sequence = 6\n" +
                "o) average value = 21.833333";
        String assert = statsCalculator.printCalculations();
        assertEquals(expected, assert);
    }
}