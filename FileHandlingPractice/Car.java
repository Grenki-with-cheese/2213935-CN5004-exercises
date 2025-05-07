public class Car {
    private String registration;
    private String make;
    private Double price;

    public Car(String registrationIn, String makeIn, Double priceIn) {
        registration = registrationIn;
        make = makeIn;
        price = priceIn;
    }

    public String getRegistration() {
        return registration;
    }

    public String getMake() {
        return make;
    }

    public Double getPrice() {
        return price;
    }
    
    
}
