package State.Machines;

import State.ICoffeeMachine;
import java.util.Objects;

public class Apparatus {

  private ICoffeeMachine machine;

  public Apparatus() {
    machine = new WaitingMachine();
  }

  private void changeState(ICoffeeMachine machine) {

    this.machine = machine;
  }

  private void changeState(String state) {
    if (machine instanceof WaitingMachine) {
      switch (state) {
        case ("Latte"):
          machine = new LatteMachine(45);
          break;
        case ("Espresso"):
          machine = new EspressoMachine(35);
          break;
        case ("Russiano"):
          machine = new RussianoMachine(30);
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + state);
      }
    } else {
      machine = new WaitingMachine();
    }
  }

  public void makeCoffee(String type, int amount) {
    changeState(type);
    try {
      machine.Deposit(amount);
      machine.PrepareCoffee();
      machine.DeliverCoffee();
      changeState(type);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Apparatus)) {
      return false;
    }
    Apparatus apparatus = (Apparatus) o;
    return Objects.equals(machine, apparatus.machine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machine);
  }
}
