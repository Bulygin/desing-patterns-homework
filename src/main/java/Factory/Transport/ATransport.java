package Factory.Transport;

import java.util.Objects;

public abstract class ATransport {

  public int id;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ATransport)) {
      return false;
    }
    ATransport transport = (ATransport) o;
    return id == transport.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
