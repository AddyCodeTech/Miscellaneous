class Employee {
    String name;
    double salary;
    Employee() {
        name = "Jatin";
        salary = 50000;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
    }
}
