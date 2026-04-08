class PoliceStation {
    String stationName;
    String location;
    int numberOfOfficers;
    int numberOfCases;
    String inspectorName;
    boolean hasJail;
    boolean hasCCTV;
    double fineAmount;
    int establishedYear;
    String stationType;

    static String country = "India";
    static String serviceType = "Security";

    public String registerCase(String caseName) {
        System.out.println("Case Registered: " + caseName);
        return caseName;
    }

    public String closeCase(String caseName) {
        System.out.println("Case Closed: " + caseName);
        return caseName;
    }

    public String assignOfficer(String officerName) {
        System.out.println("Officer Assigned: " + officerName);
        return officerName;
    }

    public double collectFine(double amount) {
        System.out.println("Fine Collected: " + amount);
        return amount;
    }

    public boolean startPatrol(boolean status) {
        System.out.println("Patrol Started: " + status);
        return status;
    }

    public boolean stopPatrol(boolean status) {
        System.out.println("Patrol Stopped: " + status);
        return status;
    }

    public int countCases(int total) {
        System.out.println("Total Cases: " + total);
        return total;
    }

    public boolean provideSecurity(boolean status) {
        System.out.println("Security Provided: " + status);
        return status;
    }

    public String assignDuty(String duty) {
        System.out.println("Duty Assigned: " + duty);
        return duty;
    }

    public boolean maintainLaw(boolean status) {
        System.out.println("Law Maintained: " + status);
        return status;
    }
}