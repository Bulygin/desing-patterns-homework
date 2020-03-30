package State.Machines;

import State.ICoffeeMachine;
import java.util.Objects;

public abstract class ACoffeeMachine implements ICoffeeMachine {

  int cost;
  boolean initialization = false;
  private int change;


  @Override
  public void Deposit(int MoneyAmount) throws Exception {
    System.out.printf("You deposited %d money%n", MoneyAmount);
    init();
    if (cost > MoneyAmount) {
      dispatchError();
      change = MoneyAmount;
    } else {
      change = MoneyAmount - cost;
    }
  }

  @Override
  public abstract void PrepareCoffee() throws Exception;

  @Override
  public void DeliverCoffee() throws Exception {
    if (initialization) {
      System.out.println("You got your coffee!");
    }
    GiveChange(change);
  }

  @Override
  public void GiveChange(int MoneyAmount) {
    System.out.println("You got excess money " + MoneyAmount);
    initialization = false;
  }

  @Override
  public void dispatchError() {
    System.err.println("Money does not enough");
    initialization = false;
  }

  @Override
  public void init() {
    initialization = true;
  }

  @Override
  public void stop() {
    initialization = false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ACoffeeMachine)) {
      return false;
    }
    ACoffeeMachine that = (ACoffeeMachine) o;
    return cost == that.cost && initialization == that.initialization && change == that.change;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, initialization, change);
  }
}
