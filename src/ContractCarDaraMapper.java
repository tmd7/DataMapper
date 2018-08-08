import java.util.Optional;

public interface ContractCarDaraMapper {

  Optional<Car> find(int carId);

  void insert(Car car);

  void update(Car car);

  void delete(Car car);
}
