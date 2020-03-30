package Decorator.decorators;

import Decorator.IMatrioshka;
import Decorator.MatrioshkaDecorator;
import java.util.Objects;

public class SizeColourMatrioshkaDecorator extends MatrioshkaDecorator {

  String name = "matrioshka";
  private String size;

  public SizeColourMatrioshkaDecorator(IMatrioshka matrioshka, String size) {
    super(matrioshka);
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SizeColourMatrioshkaDecorator)) {
      return false;
    }
    SizeColourMatrioshkaDecorator that = (SizeColourMatrioshkaDecorator) o;
    return Objects.equals(getName(), that.getName()) && Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), size);
  }

  @Override
  public String getName() {
    return size + " " + super.getName();
  }
}
