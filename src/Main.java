import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Employee Wage Computation Program");
        Employee e1 = new Employee("Ram", 123);
        Random r = new Random();
        int monthlyWage = 0;
        for (int day = 1; day <= 20; day++) {
            int i = r.nextInt(3);
            switch (i) {
                case 1 -> e1.attendance(true);
                case 2 -> {
                    e1.attendance(true);
                    System.out.println("Part-time today");
                    e1.normalWorkDay = 4;
                }
                default -> e1.attendance(false);
            }
            monthlyWage += e1.calculateWage();
        }
        System.out.println("Total Monthly Wage: " + monthlyWage);
    }
}