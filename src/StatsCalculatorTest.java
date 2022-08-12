import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculatorTest {

    @Test
    @DisplayName("Final example test")
    void printCalculations() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(6, 9, 15, -2, 92, 11));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String expected = "o) minimum value = -2\n" +
                "o) maximum value = 92\n" +
                "o) number of elements in the sequence = 6\n" +
                "o) average value = 21.833333";

        String result = statsCalculator.printCalculations();

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Prints minimum value")
    void printMinimumValue() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(1));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String minimumValueMessage = "o) minimum value = 1\n";

        String result = statsCalculator.printCalculations();

        assertTrue(result.contains(minimumValueMessage));
    }
    @Test
    @DisplayName("Prints minimum value of an ArrayList of 2 numbers")
    void printMinimumValueOfTwoNumbers() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(2, 3));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String minimumValueMessage = "o) minimum value = 2\n";

        String result = statsCalculator.printCalculations();

        assertTrue(result.contains(minimumValueMessage));
    }

    @Test
    @DisplayName("Prints minimum value of an Array List of 3 numbers")
    void printMinimumValueOfThreeNumbers() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(10, 8, 13));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String minimumValueMessage = "o) minimum value = 8\n";

        String result = statsCalculator.printCalculations();

        assertTrue(result.contains(minimumValueMessage));
    }
    @Test
    @DisplayName("Prints maximum value")
    void printMaximumValue() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(1));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String maximumValueMessage = "o) maximum value = 1\n";

        String result = statsCalculator.printCalculations();

        assertTrue(result.contains(maximumValueMessage));
    }
    @Test
    @DisplayName("Prints maximum value of an ArrayList of 2 numbers")
    void printMaximumValueOfTwoNumbers() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(2, 3));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String maximumValueMessage = "o) maximum value = 3\n";

        String result = statsCalculator.printCalculations();

        assertTrue(result.contains(maximumValueMessage));
    }


    @Test
    @DisplayName("Prints maximum value of an Array List of 3 numbers")
    void printMaximumValueOfThreeNumbers() {
        ArrayList<Integer> stats = new ArrayList<>(Arrays.asList(10, 8, 13));
        StatsCalculator statsCalculator = new StatsCalculator(stats);
        String maximumValueMessage = "o) maximum value = 13\n";

        String result = statsCalculator.printCalculations();

        assertTrue(result.contains(maximumValueMessage));
    }
}