import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Get user input for trip details
        // - Distance (miles)
        System.out.print("Enter trip distance (miles): ");
        double d = sc.nextDouble();
        // - Average speed (mph)
        System.out.print("Enter average speed (mph): ");
        double s = sc.nextDouble();
        // - Fuel efficiency (miles per gallon)
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double g = sc.nextDouble();
        // - Fuel price per gallon
        System.out.print("Enter fuel price per gallon ($): ");
        double p = sc.nextDouble();
        
        // TODO: Calculate travel time using a return method
        double t = calculateTravelTime(d, s);
        // TODO: Calculate fuel needed using a return method
        double f = calculateFuelNeeded(d, g);
        // TODO: Calculate trip cost using a return method
        double c = calculateTripCost(f, p);
        // TODO: Display results using a void method
        displayResults(t, f, c);
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double d, double s) {
        return d / s;
    }
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double d, double g) {
        return d / g;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double f, double p) {
        return f * p;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double t, double f, double c) {
        System.out.println("Results:");
        System.out.printf("Travel Time: %.2f hours\n", t);
        System.out.printf("Fuel Needed: %.2f gallons\n", f);
        System.out.printf("Trip Cost: $%.2f\n", c);
    }
}
