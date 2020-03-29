package Factory.Factories;

import Factory.ITransport;
import Factory.Transport.Ship;

public class ShipFactory implements ITransportFactory {

  @Override
  public ITransport createTransport(int id) {
    return new Ship(id);
  }
}
