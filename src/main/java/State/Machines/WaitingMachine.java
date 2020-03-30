package State.Machines;

import State.ICoffeeMachine;

public class WaitingMachine extends ACoffeeMachine implements ICoffeeMachine {

  WaitingMachine() {
    System.out.println("The apparatus is in standby mode");
  }

  @Override
  public void Deposit(int MoneyAmount) throws Exception {
    throw new Exception("Coffee machine is turned off ");
  }

  @Override
  public void DeliverCoffee() throws Exception {
    throw new Exception("Coffee machine is turned off ");
  }

  @Override
  public void PrepareCoffee() throws Exception {
    throw new Exception("Coffee machine is turned off ");
  }
}
