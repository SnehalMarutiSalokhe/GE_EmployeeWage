import java.util.Random;

public class Employee {

    public static void computeEmployeeWageForCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        Random random = new Random();
        int totalHours = 0;
        int totalDays = 0;
        int totalMonthlyWage = 0;

        System.out.println("\n--- Computing wages for: " + companyName + " ---");
        System.out.println("Wage Per Hour: " + wagePerHour + ", Max Days: " + maxWorkingDays + ", Max Hours: " + maxWorkingHours);

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
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
            int dailyWage = workHours * wagePerHour;
            totalMonthlyWage += dailyWage;

            System.out.println("Wage for Day " + totalDays + ": " + dailyWage);
            System.out.println("Total Hours Worked So Far: " + totalHours);
        }

        System.out.println("\nSummary for " + companyName);
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
    }
}
