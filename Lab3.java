import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the EmployeeID:");
        int id = sc.nextInt();

        System.out.println("Enter the Employee Name:");
        String name = sc.next();

        System.out.println("Enter the Salary:");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);

        System.out.println("Before Salary Increment:");
        e.display();

        System.out.println("Enter the percentage of salary increment:");
        double percentage = sc.nextDouble();

        e.raiseSalary(percentage);

        System.out.println("after Salary Increment:");
        e.display();

        sc.close();
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }
    public void display() {
        System.out.println("EMPLOYEE Name:" + name);
        System.out.println("Id :" + id);
        System.out.println("Salary :" + salary);
    }
}
