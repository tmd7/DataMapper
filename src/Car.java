public class Car {

  private int carId;
  private String vendor;
  private String model;

  public Car(int carId, String vendor, String model) {
    this.carId = carId;
    this.vendor = vendor;
    this.model = model;
  }

  public int getCarId() {
    return carId;
  }

  public void setCarId(int carId) {
    this.carId = carId;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  /**
   *
   */
  @Override
  public boolean equals(Object obj) {

    boolean isEqual = false;

    if (this == obj) {

      isEqual = true;

    } else if (obj != null && getClass() == obj.getClass()) {

      Car inputCar = (Car) obj;

      if (this.getCarId() == inputCar.getCarId()) {

        isEqual = true;
      }
    }

    return isEqual;
  }

  /**
   *
   */
  @Override
  public int hashCode() {

    return this.getCarId();
  }

  /**
   *
   */
  @Override
  public String toString() {
    return "Car [carId=" + carId + ", vendor=" + vendor + ", model=" + model + "]";
  }
}
