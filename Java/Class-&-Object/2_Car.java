class Car {
    String brand;
    String color;
    double price;
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.color = "Black";
        c1.price = 7500000;
        System.out.println("Car Details:");
        System.out.println("Brand: " + c1.brand);
        System.out.println("Color: " + c1.color);
        System.out.println("Price: " + c1.price);
    }
}
