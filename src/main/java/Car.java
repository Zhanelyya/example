public class Car {
    String brand;
    String model;
    int year;
    int number ;

    public Car(String brand, String model, int year, int number) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.number = number;
    }
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year + ", Number: " + number);
    }
}
