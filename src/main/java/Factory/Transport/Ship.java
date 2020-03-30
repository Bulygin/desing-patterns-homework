package Factory.Transport;

import Factory.IProduct;
import Factory.ITransport;

public class Ship extends ATransport implements ITransport {

  public int id;

  public Ship(int id) {
    this.id = id;
  }

  @Override
  public void answer() {

  }

  @Override
  public void deliver() {

  }

  @Override
  public void putProduct(IProduct product) {

  }

  @Override
  public IProduct getProduct() {
    return null;
  }
}
