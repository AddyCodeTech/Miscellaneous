class Employee {
    String name;
    int id;
    double salary;
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Aditya";
        e1.id = 001;
        e1.salary = 45000;
        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.id);
        System.out.println("Salary: " + e1.salary);
    }
}
