public class CompanyEmpWage {
    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalMonthlyWage;

    public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalMonthlyWage = 0;
    }

    public void setTotalMonthlyWage(int totalMonthlyWage) {
        this.totalMonthlyWage = totalMonthlyWage;
    }

    public void displayWageDetails() {
        System.out.println("\n--- Summary for " + companyName + " ---");
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
    }
}