package components.tracker;
//component functionaility demonstration
public class ExpenseAnalysis {
    public static void main(String[] args) {
        Tracker tracker = new Tracker1L();

        tracker.addTrack("Rent", 1200.0);
        tracker.addTrack("Groceries", 450.0);
        tracker.addTrack("Utilities", 180.0);

        System.out.println("Tracker Contents: \n" + tracker);

        // Analyze expenses
        double threshold = 500.0;
        tracker.getMap().forEach(pair -> {
            if (pair.value() > threshold) {
                System.out.println(pair.key() + " exceeds the threshold: $" + pair.value());
            }
        });
    }
}
