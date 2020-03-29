package ChainOfResponsibility;


import ChainOfResponsibility.ConcreteHandlers.EvenNumberHandler;
import ChainOfResponsibility.ConcreteHandlers.MultipleThreeNumberHandler;
import ChainOfResponsibility.ConcreteHandlers.PrimeNumberHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;

public class ChainResponsibilityTest {

  Random rnd = new Random();

  @Test
  public void test() {
    List<Request> requests = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Request request = new Request();
      request.value = (10 + rnd.nextInt(100 - 10 + 1));
      requests.add(request);
    }
    IHandler primeNumberHandler = new PrimeNumberHandler();
    IHandler evenNumberHandler = new EvenNumberHandler();
    IHandler multipleThreeNumberHandler = new MultipleThreeNumberHandler();

    primeNumberHandler.setNextHandler(evenNumberHandler);
    evenNumberHandler.setNextHandler(multipleThreeNumberHandler);

    for (Request request : requests) {
      try {
        primeNumberHandler.handle(request);
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}