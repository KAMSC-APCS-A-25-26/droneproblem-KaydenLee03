
public class DroneAssignment {
    public static void main(String[] args) {
        // Initial drone values
        double altitude = 150.7;
        double battery = 87.3;
        int photos = 0;
        int displayAltitude = (int) altitude;
        int batteryRounded = (int) battery;

        
        System.out.println("=== Drone Flight Simulation ===");
        System.out.println("Initial Status:");
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Photos: " + photos);
        System.out.println();
        //System.out.println(displayAltitude);
        //System.out.println(batteryRounded);
        altitude += 20;
        battery *= 0.85;
        photos += 3;
        altitude /= 2;
        photos %= 4;

        System.out.println("Photos: " + photos);
        System.out.println("Storage slots used: " + photos + " out of 4");
    }
}
