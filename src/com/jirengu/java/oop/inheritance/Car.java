package com.jirengu.java.oop.inheritance;

public class Car extends Vehicle {
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    protected int fuelCapacity; //油箱容量


    public Car(String name,
               String color,
               int year,
               String model,
               int maxSpeed,
               int fuelCapacity) {
        super(name, color, year, model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public Car() {
    }

    public void printCarInformation() {
        welcome();
        super.printInformation();
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
    }

    private void welcome() {
        System.out.println("### Welcome, " + getName() + " ###");
        System.out.println(getColor());
    }

    @Override
    protected void start(String name) {
        super.start(name);
        System.out.println("Car speeding....");
    }

    @Override
    Car getInstance() {
        return new Car();
    }

    @Override
    public String toString() {
        return String.format("Car{name=%s, color=%s, year=%d, model=%s, maxSpeed=%s, fuelCapacity=%d}",
                getName(), getColor(), getYear(), getModel(), getMaxSpeed(), getFuelCapacity());
    }

    public static void main(String[] args) {
        Car car = new Car("XX", "red", 2010, "sport", 150, 200);
        car.printCarInformation();
        car.printInformation();
        System.out.println("Name from Main: " + car.getName());
        System.out.println("Color from Main: " + car.getColor());

        boolean result1 = car instanceof Car;
        System.out.println("car instanceof Car result: " + result1);

        boolean result2 = car instanceof Vehicle;
        System.out.println("car instanceof Vehicle result: " + result2);

        boolean result3 = car instanceof Object;
        System.out.println(result3);


        Car car2 = new Car();
        car2.start("XIAOMING");
    }


    @Override
    public int hashCode() {
        return fuelCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelCapacity == car.fuelCapacity;
    }
}
