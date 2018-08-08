import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarDataMapper implements ContractCarDaraMapper {

  /*Note: for an example this list would be return from a database */
  private List<Car> cars = new ArrayList<>();

  public List<Car> getCars() {
    return this.cars;
  }

  @Override
  public Optional<Car> find(int carId) {

    for (Car car : this.getCars()) {

      if (car.getCarId() == carId) {

        return Optional.of(car);
      }
    }

    return Optional.empty();
  }

  @Override
  public void insert(Car carToBeInserted) {

    if (!this.getCars().contains(carToBeInserted)) {

      this.getCars().add(carToBeInserted);

    } else {

      System.out.println("This car already exist");
    }
  }

  @Override
  public void update(Car carToBeUpdated) {

    if (this.getCars().contains(carToBeUpdated)) {

      int index = this.getCars().indexOf(carToBeUpdated);

      this.getCars().set(index, carToBeUpdated);

    } else {

      System.out.println("This car is not found!!!");
    }
  }

  @Override
  public void delete(Car carToBeDeleted) {

    if (this.getCars().contains(carToBeDeleted)) {

      this.getCars().remove(carToBeDeleted);

    } else {

      System.out.println("This car is not found!!!");
    }
  }
}
