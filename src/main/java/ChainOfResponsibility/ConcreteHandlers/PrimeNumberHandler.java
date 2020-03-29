package ChainOfResponsibility.ConcreteHandlers;

import ChainOfResponsibility.ABaseHandler;
import ChainOfResponsibility.IHandler;
import ChainOfResponsibility.Request;
import java.math.BigInteger;

public class PrimeNumberHandler extends ABaseHandler {

  IHandler next;

  @Override
  public void setNextHandler(IHandler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) throws Exception {
    if (validate(request)) {
      BigInteger bigInteger = BigInteger.valueOf(request.value);
      if (bigInteger.isProbablePrime((int) Math.log(request.value))) {
        throw new Exception(request.value + " is Prime");
      }
      next.handle(request);
    }
  }

  @Override
  public boolean validate(Request request) {
    if (request.value > 10) {
      return true;
    }
    return false;
  }

}
