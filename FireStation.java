class FireStation {
    String stationName;
    String location;
    int numberOfFireTrucks;
    int numberOfFirefighters;
    String chiefOfficer;
    boolean hasAmbulance;
    boolean hasRescueTeam;
    double serviceCost;
    int establishedYear;
    String stationType;

    static String country = "India";
    static String serviceType = "Emergency";

    public String reportFire(String place) {
        System.out.println("Fire Reported at: " + place);
        return place;
    }

    public String controlFire(String place) {
        System.out.println("Fire Controlled at: " + place);
        return place;
    }

    public String assignFirefighter(String name) {
        System.out.println("Firefighter Assigned: " + name);
        return name;
    }

    public double collectServiceFee(double amount) {
        System.out.println("Service Fee Collected: " + amount);
        return amount;
    }

    public boolean startRescue(boolean status) {
        System.out.println("Rescue Started: " + status);
        return status;
    }

    public boolean stopRescue(boolean status) {
        System.out.println("Rescue Stopped: " + status);
        return status;
    }

    public int countEmergencies(int total) {
        System.out.println("Total Emergencies: " + total);
        return total;
    }

    public boolean provideHelp(boolean status) {
        System.out.println("Help Provided: " + status);
        return status;
    }

    public String assignVehicle(String vehicle) {
        System.out.println("Vehicle Assigned: " + vehicle);
        return vehicle;
    }

    public boolean maintainEquipment(boolean status) {
        System.out.println("Equipment Maintained: " + status);
        return status;
    }
}