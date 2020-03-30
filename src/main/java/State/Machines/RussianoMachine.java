package State.Machines;

import State.ICoffeeMachine;

public class RussianoMachine extends ACoffeeMachine implements ICoffeeMachine {

  RussianoMachine(int cost) {
    System.out.println("You chose a Russiano that costs " + cost);
    this.cost = cost;
  }

  @Override
  public void PrepareCoffee() {
    if (initialization) {
      System.out.println("Preparing patriotic russiano");
    }
  }
}
