Hello this is group 5's collaboration project.

=================================

  Steps on how to run the program:
  
  1#: Run the program - The program creates the scanner so it can accept user input.
  
  2#: Register the property - The program will ask for tenant name, property name/unit, monthly bill, and leas duration in months.
    Ex: Enter tenant name: Gowin's computer shop
        Enter property name/unit: Unit 001
        Enter monthyy rent: 20000
        Enter lease duration in months: 12 months
  
  3#: Enter utility usage - The menu will appear again then choose "2". The program will ask for the electricity and water usage.
    Ex: Enter electricity usage (kWh): 100
        Enter water usage (m3): 10
        
        -But if someone enters: -100, the program will say "Usage cannot be negative."
  
  4#: Calculate the utility bills - The Property.java class file will handle the calculations. which gets us to the next step, View monthly bill.
  
  5#: View the monthly bill - In the menu, choose "3". Here the program will display the "commercial property bill"
  
  6#: Mark the bill as paid - After the tenant pays, in the menu, choose "4" This will mark the bill as paid and displays "Bill has been marked as PAID."

=================================

NOTE: that the primary user is the property administrator/property staff who manages tenant information and billing. The system primarily assist property administrators in managing the leases and monthly bills of commercial-property tenants.

NOTE: With this current version of our code, the system can only manage one tenant/property at a time.

=================================

FUTURE PLANS: We're planning on adding a data base via the usage of SQLite so that we can permanently store the tenant data permanently. And, we're also planning on creating arrays so the program can handle multiple tenants at a time and record them. But for now, we're going to stick with this prototype as the means of guiding us on what to add next.
 -Group 5
