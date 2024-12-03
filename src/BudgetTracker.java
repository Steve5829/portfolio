package components.tracker;
//component functionaility demonstration

public class BudgetTracker {
    public static void main(String[] args) {
        Tracker tracker = new Tracker1L();

        // Add tracks
        tracker.addTrack("Rent", 1200.0);
        tracker.addTrack("Groceries", 450.0);
        tracker.addTrack("Utilities", 200.0);

        // Print the tracker
        System.out.println("Tracker Contents: \n" + tracker);

        // Sort the tracker
        tracker.sortTrack();
        System.out.println("Sorted Tracker: \n" + tracker);

        // Remove a track
        tracker.removeTrack("Utilities");
        System.out.println("After Removing Utilities: \n" + tracker);

        // Check the length
        System.out.println("Number of Tracks: " + tracker.lengthTrack());
    }
}
