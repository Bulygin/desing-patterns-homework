package Factory.Transport;

import Factory.IProduct;
import Factory.ITransport;
import java.util.Objects;

public class Ship implements ITransport {

  public int id;

  public Ship(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Ship)) {
      return false;
    }
    Ship ship = (Ship) o;
    return id == ship.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
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
