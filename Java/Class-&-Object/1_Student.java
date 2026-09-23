class Student {
    String name;
    int rollNo;
    double marks;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.rollNo = 2515010036;
        s1.marks = 85.5;
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);
    }
}
