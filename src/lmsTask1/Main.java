package lmsTask1;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, CarDates> cars = new HashMap<>();
        cars.put(new Car(1, 1934), new CarDates(2004, "Toyota", new BigDecimal(54000), "Blue"));
        cars.put(new Car(2, 8346), new CarDates(2002, "Mercedes", new BigDecimal(45000), "White"));
        cars.put(new Car(3, 9237), new CarDates(2011, "KIA", new BigDecimal(51000), "Black"));
        cars.put(new Car(4, 5195), new CarDates(2009, "Lexus", new BigDecimal(62000), "Red"));
        for (Map.Entry<Car, CarDates> car : cars.entrySet()){
            System.out.println(car);
        }
    }
}
