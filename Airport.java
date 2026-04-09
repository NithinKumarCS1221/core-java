class Airport {
    String airportName;
    String location;
    int numberOfTerminals;
    int numberOfFlights;
    String directorName;
    boolean hasInternationalFlights;
    boolean hasCargoService;
    double ticketPrice;
    int establishedYear;
    String airportType;

    static String country = "India";
    static String serviceType = "Transportation";

    public String bookFlight(String passengerName) {
        System.out.println("Flight Booked for: " + passengerName);
        return passengerName;
    }

    public String cancelFlight(String passengerName) {
        System.out.println("Flight Cancelled for: " + passengerName);
        return passengerName;
    }

    public String checkIn(String passengerName) {
        System.out.println("Check-in Done for: " + passengerName);
        return passengerName;
    }

    public double collectFare(double amount) {
        System.out.println("Fare Collected: " + amount);
        return amount;
    }

    public boolean startFlight(boolean status) {
        System.out.println("Flight Started: " + status);
        return status;
    }

    public boolean stopFlight(boolean status) {
        System.out.println("Flight Stopped: " + status);
        return status;
    }

    public int countPassengers(int total) {
        System.out.println("Total Passengers: " + total);
        return total;
    }

    public boolean provideSecurity(boolean status) {
        System.out.println("Security Provided: " + status);
        return status;
    }

    public String assignGate(String gateNo) {
        System.out.println("Gate Assigned: " + gateNo);
        return gateNo;
    }

    public boolean maintainRunway(boolean status) {
        System.out.println("Runway Maintained: " + status);
        return status;
    }
}