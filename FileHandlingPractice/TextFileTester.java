import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileTester {
    public static void main(String[] args) {
        Car car1 = new Car("1234567890", "Toyota", 20000.00);
        Car car2 = new Car("1234567891", "Ford", 25000.00);
        Car car3 = new Car("1234567892", "BMW", 30000.00);
        Car car4 = new Car("1234567893", "Mercedes", 35000.00);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        try (FileWriter carFile = new FileWriter("cars.txt",true);
             PrintWriter carWriter = new PrintWriter(carFile)) {
            
            for (Car car : cars) {
                carWriter.println(car.getRegistration() + "," + 
                             car.getMake() + "," + 
                             car.getPrice());
            }
            System.out.println("Cars saved successfully to cars.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
