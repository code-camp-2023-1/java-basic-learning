package com.jirengu.java.oop.inheritance;


import java.util.Objects;

public class Vehicle {
    private String name;
    private String color;

    private int year;

    private String model;

    private int maxSpeed;

    static {
        System.out.println("Loading Vehicle");
    }

    public Vehicle(String name,
                   String color,
                   int year,
                   String model,
                   int maxSpeed) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle() {
        System.out.println("Init Vehicle");
    }

    protected void printInformation() {
        System.out.println("### Vehicle Information ###");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
        System.out.println("Model: " + this.model);
    }

    void start(String name) {
        System.out.println("Press button by " + name);
        System.out.println("Starting....");
    }

    Vehicle getInstance() { //package-level
        return new Vehicle();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        boolean result = vehicle instanceof Car;
        System.out.println("result: " + result);

        vehicle.start("XIAOMING");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && maxSpeed == vehicle.maxSpeed && Objects.equals(name, vehicle.name) && Objects.equals(color, vehicle.color) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, year, model, maxSpeed);
    }
}

class Train extends Vehicle {

}

class BigTrain extends Train {

}
