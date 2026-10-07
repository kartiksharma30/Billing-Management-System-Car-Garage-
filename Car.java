public class Car {
    private String model;
    private String carNumber;

    public Car(String carNumber, String model) {
        this.model = model;
        this.carNumber = carNumber;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarName(String carNumber) {
        this.carNumber = carNumber;
    }
}