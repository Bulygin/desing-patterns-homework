package Decorator;

import java.util.Objects;

public class Matrioshka extends AMatrioshka implements IMatrioshka {

  private String name = "matrioshka";

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Matrioshka)) {
      return false;
    }
    Matrioshka that = (Matrioshka) o;
    return Objects.equals(getName(), that.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public String getName() {
    return name;
  }
}
