package Factory.Factories;

import Factory.ITransport;

public interface ITransportFactory {

  ITransport createTransport(int id);
}
