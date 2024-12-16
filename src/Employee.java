public class Employee {
    String name;
    int id;
    boolean attendance = false;
    int normalWorkDay = 8;
    int salPerHour = 20;
    double dailySalary = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void attendance(boolean a) {
        if (a) {
            attendance = true;
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }

    public int calculateWage() {
        if (attendance) {
            dailySalary = normalWorkDay * salPerHour;
        } else {
            dailySalary = 0;
        }
        System.out.println("Daily Salary: " + dailySalary);
        return (int) dailySalary;
    }
}
