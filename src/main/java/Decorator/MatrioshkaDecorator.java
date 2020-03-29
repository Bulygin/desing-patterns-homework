package Decorator;


public class MatrioshkaDecorator implements IMatrioshka {

  IMatrioshka matrioshka;

  public MatrioshkaDecorator(IMatrioshka matrioshka) {
    this.matrioshka = matrioshka;
  }

  @Override
  public String getName() {
    return matrioshka.getName();
  }
}


