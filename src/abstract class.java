import components.map.Map;
import components.map.Map1L;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public abstract class TrackerSecondary implements Tracker {
    //logging to replace outprint
    private static final Logger logger = Logger.getLogger(TrackerSecondary.class.getName());

    protected Map<String, Double> trackMap;

    public TrackerSecondary() {
        this.trackMap = new Map1L<>();
        logger.log(Level.INFO, "TrackerSecondary instance created.");
    }

    // Secondary method
    public void sortTrack() {
        logger.log(Level.INFO, "Sorting trackMap by amount in ascending order...");

        // Extract entries from trackMap into a list
        List<Map.Pair<String, Double>> entries = new ArrayList<>();
        for (Map.Pair<String, Double> pair : this.trackMap) {
            entries.add(pair);
        }

        // Sort the list of entries by amount in ascending order
        Collections.sort(entries, Comparator.comparingDouble(Map.Pair::value));

        // Clear trackMap and put sorted entries back
        this.trackMap.clear();
        for (Map.Pair<String, Double> pair : entries) {
            this.trackMap.add(pair.key(), pair.value());
        }

        logger.log(Level.INFO, "trackMap sorted by amount.");
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Pair<String, Double> pair : this.trackMap) {
            result.append("Type: ").append(pair.key())
                  .append(", Amount: ").append(pair.value()).append("\n");
        }
        logger.log(Level.FINE, "Converting trackMap to string: {0}", result.toString());
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        String result = "";
        if (this == obj) {
        result = true;
        }
        if (!(obj instanceof TrackerSecondary)) {
            result = false;
        }
        TrackerSecondary other = (TrackerSecondary) obj;
        boolean isEqual = this.trackMap.equals(other.trackMap);
        logger.log(Level.FINE, "Comparing trackMap for equality: {0}", isEqual);
        return result;
    }

    @Override
    public int hashCode() {
        int hash = this.trackMap.hashCode();
        logger.log(Level.FINE, "Computed hashCode for trackMap: {0}", hash);
        return hash;
    }
}
