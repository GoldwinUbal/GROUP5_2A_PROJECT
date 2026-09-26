public class Property {

    // Property information
    String tenantName;
    String propertyName;
    double monthlyRent;
    int leaseMonths;

    // Utility information
    double electricityUsage;
    double waterUsage;

    // Utility rates
    double electricityRate = 15.00;
    double waterRate = 50.00;

    // Constructor
    public Property(String tenantName, String propertyName, double monthlyRent, int leaseMonths) {

        this.tenantName = tenantName;
        this.propertyName = propertyName;
        this.monthlyRent = monthlyRent;
        this.leaseMonths = leaseMonths;
    }

    // Set utility usage
    public void setUtilityUsage(double electricityUsage, double waterUsage) {

        this.electricityUsage = electricityUsage;
        this.waterUsage = waterUsage;
    }

    // Calculate electricity bill
    public double calculateElectricityBill() {

        return electricityUsage * electricityRate;
    }

    // Calculate water bill
    public double calculateWaterBill() {

        return waterUsage * waterRate;
    }

    // Calculate total bill
    public double calculateTotalBill() {

        return monthlyRent
                + calculateElectricityBill()
                + calculateWaterBill();
    }

    // Display the monthly bill
    public void displayBill(boolean paid) {

        String paymentStatus = paid ? "PAID" : "UNPAID";

        System.out.println("\n====================================");
        System.out.println("       COMMERCIAL PROPERTY BILL");
        System.out.println("====================================");

        System.out.println("Tenant: " + tenantName);
        System.out.println("Property: " + propertyName);
        System.out.println("Lease Duration: " + leaseMonths + " months");

        System.out.println("------------------------------------");

        System.out.printf("Monthly Rent:       PHP %.2f%n", monthlyRent);
        System.out.printf("Electricity Usage:  %.2f kWh%n", electricityUsage);
        System.out.printf("Electricity Bill:   PHP %.2f%n", calculateElectricityBill());
        System.out.printf("Water Usage:        %.2f m³%n", waterUsage);
        System.out.printf("Water Bill:         PHP %.2f%n", calculateWaterBill());
        System.out.println("------------------------------------");
        System.out.printf("TOTAL BILL:         PHP %.2f%n", calculateTotalBill());
        System.out.println("Payment Status:     " + paymentStatus);
        System.out.println("====================================");
    }
}