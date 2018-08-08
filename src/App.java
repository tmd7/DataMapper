import java.util.Optional;

public class App {

  private App() {
  }

  public static void main(String[] args) {

    ContractCarDaraMapper mapper = new CarDataMapper();

    Car car = new Car(1, "BMW", "3");

    mapper.insert(car);

    Optional<Car> carToBeFound = mapper.find(car.getCarId());

    car = new Car(car.getCarId(), "Mercedes", "s5");

    mapper.update(car);

    System.out.println(car.toString());

    mapper.delete(car);
  }

}
