package components.tracker;

/**
 * {@code TrackerKernel} enhanced with secondary methods.
 */
public interface Tracker extends TrackerKernel {

    /**
     * Sorts the tracks by type or amount in {@code this}.
     *
     * @updates this
     * @ensures tracks are sorted according to the specified criteria (e.g., by type or amount)
     */
    void sortTrack();

    /**
     * Converts the tracks in {@code this} to a human-readable string representation.
     *
     * @return a string representation of all tracks
     * @ensures toString = a readable representation of tracks in this
     */
    @Override
    String toString();
}
