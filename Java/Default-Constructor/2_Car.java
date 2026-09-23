class Car {
    String brand;
    String color;
    Car() {
        brand = "Toyota";
        color = "Red";
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("Car Details:");
        System.out.println("Brand: " + c1.brand);
        System.out.println("Color: " + c1.color);
    }
}
