package homework3;

import java.util.ArrayList;

public class Director extends Employee{

    public Director(String surname, String name, String lastname, String post, long phone, Integer age, Integer salary) {
        super(surname, name, lastname, post, phone, age, salary);
    }

    public static void salaryApp(ArrayList<Employee> employees){
        for (Employee emp : employees) {
            if (emp.getClass() != Director.class){
                if (emp.age > 45) {
                    emp.salary += 5000;
                }
            }
        }
    }
}
