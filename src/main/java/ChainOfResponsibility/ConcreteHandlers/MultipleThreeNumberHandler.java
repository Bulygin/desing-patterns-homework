package ChainOfResponsibility.ConcreteHandlers;

import ChainOfResponsibility.ABaseHandler;
import ChainOfResponsibility.IHandler;
import ChainOfResponsibility.Request;

public class MultipleThreeNumberHandler extends ABaseHandler {

  IHandler next;

  @Override
  public void setNextHandler(IHandler handler) {
    this.next = handler;
  }

  @Override
  public void handle(Request request) throws Exception {
    if (validate(request)) {
      if (request.value % 3 == 0) {
        throw new Exception(request.value + " is Even");
      }
      if (next instanceof IHandler) {
        next.handle(request);
      } else {
        System.out.println(request.value + " can be processed.");
      }
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
