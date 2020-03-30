package State;

public interface ICoffeeMachine {

  void Deposit(int MoneyAmount) throws Exception; // принять деньги

  void PrepareCoffee() throws Exception; // приготовить кофе

  void DeliverCoffee() throws Exception; // выдать кофе клиенту
    void GiveChange(int MoneyAmount); // отдать сдачу

    void dispatchError(); // обработчик ошибок (например написать сообщение об ошибке клиенту)

    void init(); // инициализация
    void stop(); // остановить и больше не принимать команды
}
