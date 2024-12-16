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


        int i = r.nextInt(2);
        if (i == 1) {
            e1.attendance(true);
            e1.calculateWage();
        } else {
            e1.attendance(false);
        }
    }
}