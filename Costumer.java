public class Costumer {
    private String name;
    private String phone;
    private Car car;

    //If u want to create an object of costumer then u make a object of car firstly...
    public Costumer(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Car getCar() {
        return car;
    }
}