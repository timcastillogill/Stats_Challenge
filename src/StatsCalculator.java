import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class StatsCalculator {
    private ArrayList<Integer> stats;

    StatsCalculator(ArrayList<Integer> stats) {
        this.stats = stats;
    }

    public String printCalculations() {
        Integer statOne =  this.stats.get(0);
        Integer statTwo = this.stats.get(stats.size()-1);

        Integer minimumValue = statOne;
        if (statTwo < minimumValue) {
            minimumValue = statTwo;
        }
        return "o) minimum value = " + minimumValue + "\n";
    }
}
