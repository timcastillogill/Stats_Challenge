import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class StatsCalculator {
    private ArrayList<Integer> stats;

    StatsCalculator(ArrayList<Integer> stats) {
        this.stats = stats;
    }

    public String printCalculations() {
        Integer minimumValue = Integer.MAX_VALUE;

        for (int i = 0; i < this.stats.size(); i++) {
            if (this.stats.get(i) < minimumValue) {
                minimumValue = this.stats.get(i);
            }
        }

        Integer maximumValue = Integer.MIN_VALUE;
        for (int i = 0; i < this.stats.size(); i++) {
            if (this.stats.get(i) > maximumValue) {
                maximumValue = this.stats.get(i);
            }
        }

        return "o) minimum value = " + minimumValue + "\n" +
               "o) maximum value = " + maximumValue + "\n";
    }
}
