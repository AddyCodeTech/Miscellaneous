class Student {
    String name;
    int rollNo;
    // Default Constructor
    Student() {
        name = "Aditya";
        rollNo = 101;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
    }
}
