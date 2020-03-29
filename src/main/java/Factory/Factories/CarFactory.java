package Factory.Factories;

import Factory.ITransport;
import Factory.Transport.Car;

public class CarFactory implements ITransportFactory {

  @Override
  public ITransport createTransport(int id) {
    return new Car(id);
  }
}
