package Decorator;

public class Matrioshka extends AMatrioshka implements IMatrioshka {

  String name = "matrioshka";

  @Override
  public String getName() {
    return name;
  }
}
