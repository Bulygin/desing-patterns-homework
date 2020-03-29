package ChainOfResponsibility.ConcreteHandlers;

import ChainOfResponsibility.ABaseHandler;
import ChainOfResponsibility.IHandler;
import ChainOfResponsibility.Request;
import java.math.BigInteger;

public class EvenNumberHandler extends ABaseHandler {

  IHandler next;

  @Override
  public void setNextHandler(IHandler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) throws Exception {
    if (validate(request)) {
      if (request.value % 2 == 0) {
        throw new Exception(request.value + " is Even");
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
