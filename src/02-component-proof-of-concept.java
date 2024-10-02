import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.map.Map;

public class Tracker {

    private Map<String, Double> trackMap;

    // Constructor

    public Tracker() {

        this.trackMap = new Map<>();

    }

    // Kernel Method 1: Add a new track (type, amount)

    public void addTrack(String type, double amount) {

        this.trackMap.add(type, amount);

    }

    // Kernel Method 2: Remove a track by type

    public void removeTrack(String type) {

        if (this.trackMap.hasKey(type)) {

            this.trackMap.remove(type);

        } else {

            out.println("Type not found in the tracker.");

        }

    }

    // Kernel Method 3: Get the size of the tracker (number of tracked items)

    public int lengthTrack() {

        return this.trackMap.size();

    }

    // Secondary Method: Sort the tracks

    public void sortTrack() {

        //still thinking about how to do it

        out.println("Sorting trackMap ().");

    }

    // Secondary Method: Convert the trackMap to a string for display

    @Override
    public String toString() {

        String result;

        for (int i = 0; I < this.trackMap.size(),i++) {

            result = "Type:“ +.trackMap.key()" + ", Amount: " + this.trackMap.value();

        }

        return result;

    }



    public static void main(String[] args) {

        Tracker budgetTracker = new Tracker();

        budgetTracker.addTrack("Income", 5000.00);

        budgetTracker.addTrack("Rent", -1500.00);

        budgetTracker.addTrack("Groceries", -200.00);

        // Display the tracker's contents

        out.println("Current Tracker: ");

        out.println(budgetTracker.toString());

        // Removing an item from the tracker

        budgetTracker.removeTrack("Rent");

        System.out.println("After removing Rent: ");

        System.out.println(budgetTracker.toString());

        // Display the size of the tracker

        out.println("Number of items in the tracker: "
                + budgetTracker.lengthTrack());

        budgetTracker.sortTrack();

    }

}

/*Kernel Methods:

addTrack(String type, double amount): Adds a new entry to the tracker.

removeTrack(String type): Removes an entry from the tracker by its type.

lengthTrack(): Returns the number of items being tracked.

Secondary Methods:

sortTrack(): Placeholder for sorting functionality.

toString(): Converts the tracker content into a readable string format.

main() method: This demonstrates the basic use cases for adding, removing, and displaying items in the tracker.*/