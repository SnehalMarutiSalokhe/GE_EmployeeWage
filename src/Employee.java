public class Employee {
    String name;
    int id;
    boolean attendance = false;

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
}
