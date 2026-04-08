class Mall {
    String mallName;
    String location;
    int numberOfShops;
    int parkingCapacity;
    String managerName;
    boolean hasFoodCourt;
    boolean hasCinema;
    double averageSpending;
    int establishedYear;
    String mallType;

    static String country = "India";
    static String serviceType = "Shopping";

    public String openShop(String shopName) {
        System.out.println("Shop Opened: " + shopName);
        return shopName;
    }

    public String closeShop(String shopName) {
        System.out.println("Shop Closed: " + shopName);
        return shopName;
    }

    public String hostEvent(String eventName) {
        System.out.println("Event Hosted: " + eventName);
        return eventName;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return amount;
    }

    public boolean openMall(boolean status) {
        System.out.println("Mall Open: " + status);
        return status;
    }

    public boolean closeMall(boolean status) {
        System.out.println("Mall Closed: " + status);
        return status;
    }

    public int countVisitors(int total) {
        System.out.println("Total Visitors: " + total);
        return total;
    }

    public boolean provideParking(boolean status) {
        System.out.println("Parking Available: " + status);
        return status;
    }

    public String assignFloor(String floorNo) {
        System.out.println("Floor Assigned: " + floorNo);
        return floorNo;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}