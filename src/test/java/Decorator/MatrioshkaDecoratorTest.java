package Decorator;

import Decorator.decorators.ColourMatrioshkaDecorator;
import Decorator.decorators.SizeColourMatrioshkaDecorator;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MatrioshkaDecoratorTest {

  @Test
  public void getName_CreateVariableMatrioskas_NotError() {
    List<IMatrioshka> matrioshkas = new ArrayList<>();
    matrioshkas.add(new Matrioshka());
    matrioshkas.add(new ColourMatrioshkaDecorator(new Matrioshka(), "blue"));
    matrioshkas.add(new ColourMatrioshkaDecorator(new Matrioshka(), "red"));
    matrioshkas.add(new ColourMatrioshkaDecorator(new Matrioshka(), "violet"));
    matrioshkas.add(
        new SizeColourMatrioshkaDecorator(new ColourMatrioshkaDecorator(new Matrioshka(), "red"),
            "big"));
    matrioshkas.add(
        new SizeColourMatrioshkaDecorator(new ColourMatrioshkaDecorator(new Matrioshka(), "green"),
            "big"));

    for (IMatrioshka matrioshka : matrioshkas) {
      System.out.println(matrioshka.getName());
    }
  }
}