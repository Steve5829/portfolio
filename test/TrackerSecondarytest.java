package components.tracker;

import static org.junit.Assert.*;
import org.junit.Test;

public class TrackerSecondaryTest {
    @Test
    public void testSortTrack() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        tracker.addTrack("Groceries", 450.0);
        tracker.sortTrack();
        assertEquals("Type: Groceries, Amount: 450.0\nType: Rent, Amount: 1200.0\n", tracker.toString());
    }

    @Test
    public void testToString() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        tracker.addTrack("Groceries", 450.0);
        assertEquals("Type: Rent, Amount: 1200.0\nType: Groceries, Amount: 450.0\n", tracker.toString());
    }

     @Test
    public void testSortEmptyMap() {
        Tracker tracker = new Tracker1L();
        tracker.sortTrack();
        assertEquals("", tracker.toString());
    }

    @Test
    public void testToStringEmptyMap() {
        Tracker tracker = new Tracker1L();
        assertEquals("", tracker.toString()); 
    }
}
