import java.util.Random;

public class Employee {
    static String name;
    static int id;
    static boolean attendance = false;
    static int normalWorkDay = 8;
    static int partTimeWorkDay = 4;
    static int salPerHour = 20;
    static int totalWorkingDays = 20;
    static int totalWorkingHours = 100;

    static int dailySalary = 0;
    static int monthlyWage = 0;

    public Employee(String name, int id) {
        Employee.name = name;
        Employee.id = id;
    }

    public static void computeEmployeeWage() {
        Random r = new Random();
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < totalWorkingHours && totalDays < totalWorkingDays) {
            totalDays++;
            int workHours;

            int i = r.nextInt(3);
            switch (i) {
                case 1 -> {
                    workHours = normalWorkDay;
                    System.out.println("Day " + totalDays + ": Full-time work");
                }
                case 2 -> {
                    workHours = partTimeWorkDay;
                    System.out.println("Day " + totalDays + ": Part-time work");
                }
                default -> {
                    workHours = 0;
                    System.out.println("Day " + totalDays + ": Absent");
                }
            }

            totalHours += workHours;
            int wage = workHours * salPerHour;
            monthlyWage += wage;

            System.out.println("Wage for Day " + totalDays + ": " + wage);
            System.out.println("Total Hours Worked So Far: " + totalHours);
        }

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Total Monthly Wage: " + monthlyWage);
    }
}
