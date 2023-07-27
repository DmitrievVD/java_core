package homework3;

import java.util.ArrayList;

public class Employee {
    protected String surname;
    protected String name;
    protected String lastname;
    protected String post;
    protected long phone;
    protected Integer age;
    protected Integer salary;

    public Employee(String surname, String name, String lastname, String post, long phone, Integer age, Integer salary) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.post = post;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public String info(){
        return String.format("ФИО: %s %s %s\nДолжность: %s\nВозраст: %d\nТелефон: %d\nЗарплата: %d", surname, name, lastname, post, age, phone, salary);
    }

    public static void salaryApp(ArrayList<Employee> employees){
        for (Employee emp : employees) {
            if (emp.age > 45) {
                emp.salary += 5000;
            }
        }
    }

    public static void middle(ArrayList<Employee> employees){
        double midSallary = 0;
        double minAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            midSallary += employees.get(i).salary;
            minAge += employees.get(i).age;
        }
        midSallary = midSallary / employees.size();
        minAge = minAge / employees.size();
        System.out.println("Средняя зарплата: " + midSallary + "\nСредний возраст:" + minAge);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
