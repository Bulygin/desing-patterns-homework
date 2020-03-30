package State.Machines;

import State.ICoffeeMachine;

public class EspressoMachine extends ACoffeeMachine implements ICoffeeMachine {

  EspressoMachine(int cost) {
    System.out.println("You chose a Espresso that costs " + cost);
    this.cost = cost;
  }

  @Override
  public void PrepareCoffee() {
    if (initialization) {
      System.out.println("Preparing hot espresso");
    }
  }
}
