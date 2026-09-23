class Car {
    String brand;
    String color;
    double price;
    Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "Black", 5000000);
        System.out.println("Car Details:");
        System.out.println("Brand: " + c1.brand);
        System.out.println("Color: " + c1.color);
        System.out.println("Price: " + c1.price);
    }
}
