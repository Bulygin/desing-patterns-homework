package Decorator.decorators;

import Decorator.Matrioshka;
import Decorator.MatrioshkaDecorator;

public class ColourMatrioshkaDecorator extends MatrioshkaDecorator {

  String name = "matrioshka";
  String colour;


  public ColourMatrioshkaDecorator(Matrioshka matrioshka, String colour) {
    super(matrioshka);
    this.colour = colour;
  }

  @Override
  public String getName() {
    return colour + " " + super.getName();
  }
}
