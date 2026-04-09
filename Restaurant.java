class Restaurant {
    String restaurantName;
    String location;
    int numberOfTables;
    int seatingCapacity;
    String managerName;
    boolean hasAC;
    boolean hasDelivery;
    double averageCost;
    int establishedYear;
    String cuisineType;

    static String country = "India";
    static String serviceType = "Food";

    public String takeOrder(String item) {
        System.out.println("Order Taken: " + item);
        return item;
    }

    public String cancelOrder(String item) {
        System.out.println("Order Cancelled: " + item);
        return item;
    }

    public String serveFood(String item) {
        System.out.println("Food Served: " + item);
        return item;
    }

    public double collectBill(double amount) {
        System.out.println("Bill Collected: " + amount);
        return amount;
    }

    public boolean openRestaurant(boolean status) {
        System.out.println("Restaurant Open: " + status);
        return status;
    }

    public boolean closeRestaurant(boolean status) {
        System.out.println("Restaurant Closed: " + status);
        return status;
    }

    public int countCustomers(int total) {
        System.out.println("Total Customers: " + total);
        return total;
    }

    public boolean provideService(boolean status) {
        System.out.println("Service Provided: " + status);
        return status;
    }

    public String assignTable(String tableNo) {
        System.out.println("Table Assigned: " + tableNo);
        return tableNo;
    }

    public boolean maintainHygiene(boolean status) {
        System.out.println("Hygiene Maintained: " + status);
        return status;
    }
}