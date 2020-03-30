package Factory.Factories;

import Factory.ITransport;
import Factory.Transport.Helicopter;

public class HelicopterFactory implements ITransportFactory {

  @Override
  public ITransport createTransport(int id) {
    return new Helicopter(id);
  }
}
