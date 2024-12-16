public class Employee {
    String name;
    int id;
    boolean attendance = false;
    int normalWorkDay = 8;
    int salPerHour = 20;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void attendance(boolean isPresent) {
        if (isPresent) {
            attendance = true;
            System.out.println("Employee is present");
        } else {
            attendance = false;
            System.out.println("Employee is absent");
        }
    }
    public void calculateWage() {
        if (attendance) {
            int dailySalary = normalWorkDay * salPerHour;
            System.out.println("Daily Wage: " + dailySalary);
        } else {
            System.out.println("No wage, as employee is absent.");
        }
    }
}
