package Decorator.decorators;

import Decorator.IMatrioshka;
import Decorator.MatrioshkaDecorator;

public class SizeColourMatrioshkaDecorator extends MatrioshkaDecorator {

  String name = "matrioshka";
  String size;

  public SizeColourMatrioshkaDecorator(IMatrioshka matrioshka, String size) {
    super(matrioshka);
    this.size = size;
  }

  @Override
  public String getName() {
    return size + " " + super.getName();
  }
}
