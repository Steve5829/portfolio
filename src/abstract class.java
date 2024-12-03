import components.map.Map;
import components.map.Map.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public abstract class TrackerSecondary implements Tracker {
    private static final Logger logger = Logger.getLogger(TrackerSecondary.class.getName());

    public void sortTrack() {
        logger.log(Level.INFO, "Sorting trackMap by amount in ascending order...");
        List<Pair<String, Double>> entries = new ArrayList<>();
        for (Pair<String, Double> pair : this.getMap()) {
            entries.add(pair);
        }
        Collections.sort(entries, Comparator.comparingDouble(Pair::value));
        this.clearMap();
        for (Pair<String, Double> pair : entries) {
            this.addMapEntry(pair.key(), pair.value());
        }
        logger.log(Level.INFO, "trackMap sorted by amount.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Pair<String, Double> pair : this.getMap()) {
            result.append("Type: ").append(pair.key())
                  .append(", Amount: ").append(pair.value()).append("\n");
        }
        logger.log(Level.FINE, "Converting trackMap to string: {0}", result.toString());
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerSecondary)) {
            return false;
        }
        TrackerSecondary other = (TrackerSecondary) obj;
        boolean isEqual = this.getMap().equals(other.getMap());
        logger.log(Level.FINE, "Comparing trackMap for equality: {0}", isEqual);
        return isEqual;
    }

    @Override
    public int hashCode() {
        int hash = this.getMap().hashCode();
        logger.log(Level.FINE, "Computed hashCode for trackMap: {0}", hash);
        return hash;
    }

    protected abstract Map<String, Double> getMap();
    protected abstract void clearMap();
    protected abstract void addMapEntry(String key, Double value);
}
