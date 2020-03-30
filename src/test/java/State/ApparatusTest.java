package State;

import State.Machines.Apparatus;
import org.junit.Assert;
import org.junit.Test;

public class ApparatusTest {

  @Test
  public void makeCoffee() {
    Apparatus apparatus = new Apparatus();
    apparatus.makeCoffee("Latte", 100);
    apparatus.makeCoffee("Russiano", 1);

    Assert.assertEquals(apparatus, new Apparatus());
  }
}