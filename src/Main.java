import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Property property = null;
        boolean paid = false;
        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println(" COMMERCIAL PROPERTY SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Register Property");
            System.out.println("2. Enter Utility Usage");
            System.out.println("3. View Monthly Bill");
            System.out.println("4. Mark Bill as Paid");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- REGISTER PROPERTY ---");

                    System.out.print("Enter tenant name: ");
                    String tenantName = input.nextLine();
                    System.out.print("Enter property name/unit: ");
                    String propertyName = input.nextLine();
                    System.out.print("Enter monthly rent: ");
                    double monthlyRent = input.nextDouble();
                    System.out.print("Enter lease duration in months: ");
                    int leaseMonths = input.nextInt();

                    property = new Property(tenantName, propertyName, monthlyRent, leaseMonths);
                    paid = false;
                    System.out.println("\nProperty registered successfully!");

                    break;

                case 2:
                    if (property == null) {
                        System.out.println( "\nPlease register a property first.");

                    } else {
                        System.out.println("\n--- ENTER UTILITY USAGE ---");

                        System.out.print("Enter electricity usage (kWh): ");
                        double electricity = input.nextDouble();

                        System.out.print("Enter water usage (m³): ");
                        double water = input.nextDouble();

                        if (electricity < 0 || water < 0) {
                            System.out.println("Usage cannot be negative.");

                        } else {
                            property.setUtilityUsage(electricity, water);

                            paid = false;

                            System.out.println("\nUtility usage recorded!");
                        }
                    }
                    break;

                case 3:
                    if (property == null) {
                        System.out.println("\nPlease register a property first.");
                    } else {
                        property.displayBill(paid);
                    }
                    break;

                case 4:
                    if (property == null) {
                        System.out.println("\nPlease register a property first.");
                    } else {
                        paid = true;
                        System.out.println("\nBill has been marked as PAID.");
                    }
                    break;

                case 5:
                    System.out.println("\nThank you for using the system!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 5);
        input.close();
    }
}