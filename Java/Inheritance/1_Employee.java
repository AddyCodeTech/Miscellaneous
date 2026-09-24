class Employee {
    String name;
    double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    
    public void displayDepartment() {
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager mn = new Manager("Aditya Kumar Singh", 50000, "B.Tech Department");
        
        System.out.println("--- Manager Profile ---");
        mn.display();    
        mn.displayDepartment(); 
    }
}
