package Decorator;

import Decorator.decorators.ColourMatrioshkaDecorator;
import Decorator.decorators.SizeColourMatrioshkaDecorator;
import org.junit.Assert;
import org.junit.Test;

public class MatrioshkaDecoratorTest {

  @Test
  public void getName_CreateVariableMatrioskas_MustBeSame() {
    IMatrioshka matrioshka = new Matrioshka();
    IMatrioshka matrioshka1 = new ColourMatrioshkaDecorator(new Matrioshka(), "blue");
    IMatrioshka matrioshka2 = new ColourMatrioshkaDecorator(new Matrioshka(), "red");
    IMatrioshka matrioshka3 = new ColourMatrioshkaDecorator(new Matrioshka(), "violet");
    IMatrioshka matrioshka4 = new SizeColourMatrioshkaDecorator(
        new ColourMatrioshkaDecorator(new Matrioshka(), "red"), "big");
    IMatrioshka matrioshka5 = new SizeColourMatrioshkaDecorator(
        new ColourMatrioshkaDecorator(new Matrioshka(), "green"), "big");

    Assert.assertEquals(matrioshka, new Matrioshka());
    Assert.assertEquals(matrioshka1, new ColourMatrioshkaDecorator(new Matrioshka(), "blue"));
    Assert.assertEquals(matrioshka2, new ColourMatrioshkaDecorator(new Matrioshka(), "red"));
    Assert.assertEquals(matrioshka3, new ColourMatrioshkaDecorator(new Matrioshka(), "violet"));
    Assert.assertEquals(matrioshka4,
        new SizeColourMatrioshkaDecorator(new ColourMatrioshkaDecorator(new Matrioshka(), "red"),
            "big"));
    Assert.assertEquals(matrioshka5,
        new SizeColourMatrioshkaDecorator(new ColourMatrioshkaDecorator(new Matrioshka(), "green"),
            "big"));
  }
}