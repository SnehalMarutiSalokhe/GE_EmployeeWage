public class CompanyEmpWage {
    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalMonthlyWage;

    // Constructor
    public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalMonthlyWage = 0;
    }

    // Setter for Total Wage
    public void setTotalMonthlyWage(int totalMonthlyWage) {
        this.totalMonthlyWage = totalMonthlyWage;
    }

    // Display Company Wage Details
    public void displayWageDetails() {
        System.out.println("\n--- Summary for " + companyName + " ---");
        System.out.println("Wage Per Hour: " + wagePerHour);
        System.out.println("Max Working Days: " + maxWorkingDays);
        System.out.println("Max Working Hours: " + maxWorkingHours);
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
    }
}


