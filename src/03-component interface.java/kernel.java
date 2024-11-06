package components.tracker;

import components.standard.Standard;

/**
 * Tracker kernel component with primary methods. (Note: by package-wide
 * convention, all references are non-null.)
 *
 * @mathsubtypes <pre>
 * TRACKER is a map of String to Double
 *  exemplar t
 * </pre>
 * @mathmodel type TrackerKernel is modeled by TRACKER
 * @initially <pre>
 * ():
 *  ensures
 *   this = empty map
 * </pre>
 */
public interface TrackerKernel extends Standard<Tracker> {

    /**
     * Adds a new track of a certain type and amount to {@code this}.
     *
     * @param type
     *            the type of track (e.g., "Income", "Expense")
     * @param amount
     *            the amount associated with the track
     * @updates this
     * @requires {@code type != null and amount >= 0}
     * @ensures this contains the new track entry (type, amount)
     */
    void addTrack(String type, double amount);

    /**
     * Removes a track by its type from {@code this}.
     *
     * @param type
     *            the type of track to remove
     * @updates this
     * @requires {@code this contains the track type}
     * @ensures the track with the specified type is removed from this
     */
    void removeTrack(String type);

    /**
     * Reports the number of tracks currently in {@code this}.
     *
     * @return the number of tracks
     * @ensures lengthTrack = the number of tracks in this
     */
    int lengthTrack();
}
