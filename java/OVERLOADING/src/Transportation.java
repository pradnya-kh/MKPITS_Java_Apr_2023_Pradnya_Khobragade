
public class Transportation {
    public void travel(int distance) {
        System.out.println("Traveling by default mode of transportation for a distance of " + distance + " miles");
        // Code to travel the specified distance using the default mode of transportation
    }

    public void travel(int distance, int numPassengers) {
        System.out.println("Traveling by default mode of transportation for a distance of " + distance + " miles with " + numPassengers + " passengers");
        // Code to travel the specified distance with the specified number of passengers using the default mode of transportation
    }

    public void travel(int distance, double cargoWeight) {
        System.out.println("Traveling by default mode of transportation for a distance of " + distance + " miles with cargo of weight " + cargoWeight + " kg");
        // Code to travel the specified distance with the specified cargo weight using the default mode of transportation
    }

    public void travel(int distance, int numPassengers, double cargoWeight) {
        System.out.println("Traveling by default mode of transportation for a distance of " + distance + " miles with " + numPassengers + " passengers and cargo of weight " + cargoWeight + " kg");
        // Code to travel the specified distance with the specified number of passengers and cargo weight using the default mode of transportation
    }
}


