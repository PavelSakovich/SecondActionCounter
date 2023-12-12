import java.util.*;
/*
делал согласно примера:
    - алгоритмическая сложность O(n);
 */

public class ActionCounter {
    private static List<Integer> timestampList = new ArrayList<>();

    public ActionCounter() {
    }

    public void call(int timestamp) {
        timestampList.add(timestamp);
    }

    public int getActions(int timestamp) {
        if (timestampList.get(timestampList.size() - 1) < timestamp)
            return timestampList.size();
        int minTime = timestamp - 300;
        return (int) timestampList.stream().filter(value -> value >= minTime && value < timestamp).count();

    }
}
