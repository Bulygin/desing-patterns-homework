package Factory.Factories;

import Factory.ITransport;
import Factory.Transport.Train;

public class TrainFactory implements ITransportFactory {

  @Override
  public ITransport createTransport(int id) {
    return new Train(id);
  }
}
