package State.Machines;

import State.ICoffeeMachine;

public class LatteMachine extends ACoffeeMachine implements ICoffeeMachine {

  LatteMachine(int cost) {
    System.out.println("You chose a Latte that costs " + cost);
    this.cost = cost;
  }

  @Override
  public void PrepareCoffee() {
    if (initialization) {
      System.out.println("Preparing tasty latte");
    }
  }
}
