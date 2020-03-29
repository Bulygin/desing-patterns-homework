package Factory.Factories;

import Factory.ITransport;
import Factory.Transport.Car;
import Factory.Transport.Helicopter;
import Factory.Transport.Ship;
import Factory.Transport.Train;
import org.junit.Assert;
import org.junit.Test;

public class TransportFactoryTest {


  @Test
  public void createTransport_CreateWithAndWithoutFactory_MustBeEquals() {
    ITransport testCar = new Car(111);
    ITransport testTrain = new Train(222);
    ITransport testShip = new Ship(333);
    ITransport testHelicopter = new Helicopter(444);

    ITransportFactory transportFactory = new CarFactory();
    ITransport car = transportFactory.createTransport(111);

    transportFactory = new TrainFactory();
    ITransport train = transportFactory.createTransport(222);

    transportFactory = new ShipFactory();
    ITransport ship = transportFactory.createTransport(333);

    transportFactory = new HelicopterFactory();
    ITransport helicopter = transportFactory.createTransport(444);

    Assert.assertEquals(testCar, car);
    Assert.assertEquals(testTrain, train);
    Assert.assertEquals(testShip, ship);
    Assert.assertEquals(testHelicopter, helicopter);
  }
}