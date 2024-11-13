import components.map.Map;
import components.map.Map1L;

/**
 * Tracker1L is a kernel implementation for the Tracker component.
 *
 * <p>Representation Selection and Justification:
 * This implementation uses a `Map<String, Double>` to represent each tracking entry,
 * where:
 * - `String` (key) represents a unique tracking type (e.g., "Income", "Rent").
 * - `Double` (value) represents the amount associated with each type.
 *
 * This representation is chosen because it provides efficient lookups, insertions,
 * and deletions for unique keys, making it straightforward to manage and manipulate
 * different tracking types and their associated amounts.
 *
 * <p>Convention:
 * - `trackMap` should not contain null keys or values.
 * - Each key in `trackMap` represents a unique tracking type and corresponds to an
 *   associated non-null Double value (the amount).
 *
 * <p>Correspondence:
 * - Each entry in `trackMap` corresponds to a specific tracking category and amount
 *   in the abstract concept of a Tracker.
 * - The key represents the type of item being tracked (e.g., "Income" or "Expense"),
 *   and the value represents the numerical amount associated with that item.
 */
public class Tracker1L extends TrackerSecondary {


    private Map<String, Double> trackMap;

    /**
     * Creator of initial representation
     */
    private void createNewRep() {
        this.trackMap = new Map1L<>();
    }



    /**
     * No-argument constructor.
     * Calls createNewRep() to initialize the trackMap.
     */
    public Tracker1L() {
        this.createNewRep();
    }

    /*
     * Kernel Methods
     */

    /**
     * Retrieves the current map holding track data.
     *
     * @return The Map holding the track data entries.
     */
    @Override
    protected Map<String, Double> getMap() {
        return this.trackMap;
    }

    /**
     * Clears all entries from the trackMap.
     */
    @Override
    protected void clearMap() {
        this.trackMap.clear();
    }

    /**
     * Adds a key-value pair to the trackMap.
     *
     * @param key   The type of track (must be unique in the map).
     * @param value The amount associated with this track type.
     */
    @Override
    protected void addMapEntry(String key, Double value) {
        this.trackMap.add(key, value);
    }

    /*
     * Other Methods (Implemented in TrackerSecondary)
     */

    /**
     * Sorts the trackMap by amount in ascending order.
     * Logging is done to indicate start and completion of sorting.
     */
    public void sortTrack() {

        super.sortTrack();
    }

    /**
     * Returns a string representation of trackMap entries.
     *
     * @return String representation of the Tracker contents.
     */
    @Override
    public String toString() {

        return super.toString();
    }

    /**
     * Checks if another object is equal to this Tracker instance.
     *
     * @param obj The object to compare against.
     * @return True if the obj is a TrackerSecondary with identical map contents.
     */
    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    /**
     * Computes a hash code for the trackMap.
     *
     * @return The hash code for this instance.
     */
    @Override
    public int hashCode() {
        
        return super.hashCode();
    }
}
