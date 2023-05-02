import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        final List<Car> cars = new ArrayList<>();
        Parcheggio p = new Parcheggio();

        for (int i = 1; i <= 8; i++) {
            cars.add(new Car("Car " + i, p));
        }
        for (Car car : cars) {
            car.start();
        }
    }
}
    
