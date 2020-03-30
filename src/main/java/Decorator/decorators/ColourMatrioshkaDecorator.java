package Decorator.decorators;

import Decorator.Matrioshka;
import Decorator.MatrioshkaDecorator;
import java.util.Objects;

public class ColourMatrioshkaDecorator extends MatrioshkaDecorator {

  String name = "matrioshka";
  private String colour;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ColourMatrioshkaDecorator)) {
      return false;
    }
    ColourMatrioshkaDecorator that = (ColourMatrioshkaDecorator) o;
    return Objects.equals(getName(), that.getName()) && Objects.equals(colour, that.colour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), colour);
  }

  public ColourMatrioshkaDecorator(Matrioshka matrioshka, String colour) {
    super(matrioshka);
    this.colour = colour;
  }

  @Override
  public String getName() {
    return colour + " " + super.getName();
  }
}
