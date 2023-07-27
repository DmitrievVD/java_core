package homework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(new Employee("Иванов", "Иван", "Иванович", "Оператор", 899254621L, 57, 55000));
        employes.add(new Employee("Никитин", "Петров", "Алесандрович", "Оператор", 898254621L, 36, 50000));
        employes.add(new Employee("Волков", "Игорь", "Маратович", "Оператор", 899255621L, 58, 45000));
        employes.add(new Employee("Галимов", "Александр", "Александрович", "Оператор", 899255691L, 28, 45000));
        employes.add(new Employee("Сулейманова", "Анна", "Семеновна", "Техничка", 899666691L, 36, 25000));

        employes.add(new Director("Галимов", "Александр", "Александрович", "Начальник", 899255691L, 58, 95000));

        System.out.println("************************");
        for (Employee emp : employes) {
            System.out.println(emp.info() + "\n-------------\n");
        }
        System.out.println("************************");

//        for (Employee emp : employes) {
//            emp.setSalary(salaryApp(emp.getAge(), emp.getSalary()));
//        }

//        Employee.salaryApp(employes);

        Director.salaryApp(employes);

        System.out.println("************************");
        for (Employee emp : employes) {
            System.out.println(emp.info() + "\n-------------\n");
        }
        System.out.println("************************");


        Employee.middle(employes);


        employes.add(new Director("Галимов", "Александр", "Александрович", "Начальник", 899255691L, 58, 95000));

        Director.salaryApp(employes);


    }

    public static Integer salaryApp(Integer age, Integer salary) {
        if (age > 45) return salary + 5000;
        else return salary;
    }



}
