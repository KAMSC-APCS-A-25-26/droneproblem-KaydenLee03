
public class DroneAssignment {
    public static void main(String[] args) {
        // Initial drone values
        double altitude = 150.7;
        double battery = 87.3;
        int photos = 0;

        System.out.println("=== Drone Flight Simulation ===");
        System.out.println("Initial Status:");
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Photos: " + photos);
        System.out.println();

        int displayAltitude = (int) altitude;
        int batteryRounded = (int) battery;

        altitude += 20;
        battery -= 15;
        photos += 3;
        altitude *= 0.5;
        photos %= 4;

        System.out.println("Photos: " + photos);
        System.out.println("Storage slots used: " + photos + " out of 4");
    }
}
