import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpWageBuilder implements IEmployeeWage {
    private final List<CompanyEmpWage> companyEmpWageList;

    // Constructor initializes ArrayList
    public EmpWageBuilder() {
        this.companyEmpWageList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage); // Add to dynamic list
    }

    @Override
    public void computeEmployeeWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            computeEmployeeWageForCompany(companyEmpWage);
        }
    }

    private void computeEmployeeWageForCompany(CompanyEmpWage companyEmpWage) {
        Random random = new Random();
        int totalHours = 0;
        int totalDays = 0;
        int totalMonthlyWage = 0;

        System.out.println("\n--- Computing wages for: " + companyEmpWage.companyName + " ---");
        System.out.println("Wage Per Hour: " + companyEmpWage.wagePerHour +
                ", Max Days: " + companyEmpWage.maxWorkingDays +
                ", Max Hours: " + companyEmpWage.maxWorkingHours);

        while (totalHours < companyEmpWage.maxWorkingHours && totalDays < companyEmpWage.maxWorkingDays) {
            totalDays++;
            int workHours;

            int attendance = random.nextInt(3);
            switch (attendance) {
                case 1 -> {
                    workHours = 8;
                    System.out.println("Day " + totalDays + ": Full-time work");
                }
                case 2 -> {
                    workHours = 4;
                    System.out.println("Day " + totalDays + ": Part-time work");
                }
                default -> {
                    workHours = 0;
                    System.out.println("Day " + totalDays + ": Absent");
                }
            }

            totalHours += workHours;
            int dailyWage = workHours * companyEmpWage.wagePerHour;
            totalMonthlyWage += dailyWage;

            System.out.println("Wage for Day " + totalDays + ": " + dailyWage);
            System.out.println("Total Hours Worked So Far: " + totalHours);
        }

        companyEmpWage.setTotalMonthlyWage(totalMonthlyWage);
        companyEmpWage.displayWageDetails();
    }
}
