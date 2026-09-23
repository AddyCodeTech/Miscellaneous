class Student {
    String name;
    int rollNo;
    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 1);
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
    }
}
