package components.tracker;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tracker1LTest {
    @Test
    public void testAddTrack() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        assertEquals("Type: Rent, Amount: 1200.0\n", tracker.toString());
    }

    @Test
    public void testRemoveTrack() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        tracker.removeTrack("Rent");
        assertEquals("", tracker.toString());
    }

    @Test
    public void testLengthTrack() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        tracker.addTrack("Groceries", 450.0);
        assertEquals(2, tracker.lengthTrack());
    }
      @Test
    public void testAddDuplicateKeys() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        tracker.addTrack("Rent", 1500.0);
        assertEquals("Type: Rent, Amount: 1500.0\n", tracker.toString());
    }
    @Test
    public void testRemoveNonExistentKey() {
        Tracker tracker = new Tracker1L();
        tracker.addTrack("Rent", 1200.0);
        tracker.removeTrack("Groceries");
        assertEquals("Type: Rent, Amount: 1200.0\n", tracker.toString());
    }

    @Test
    public void testEmptyMapOperations() {
        Tracker tracker = new Tracker1L();
        assertEquals(0, tracker.lengthTrack());

        tracker.removeTrack("Rent");
        assertEquals(0, tracker.lengthTrack()); 
        assertEquals("", tracker.toString());
    }
}
