class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Aditya", 201, 50000);
        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.id);
        System.out.println("Salary: " + e1.salary);
    }
}
