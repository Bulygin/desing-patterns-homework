package Prototype;

import java.util.Objects;

public class Humanoid extends ACreature implements ICreature {

  private int numLegs;
  private int numEyes;

  Humanoid(String name, int numLegs, int numEyes) {
    Name = name;
    this.numLegs = numLegs;
    this.numEyes = numEyes;
  }

  @Override
  public void getName() {
    System.out.println(Name);
  }

  @Override
  public ICreature clone(String name) {
    return new Humanoid(name, numLegs, numEyes);
  }

  @Override
  public String toString() {
    return "Humanoid{" + "numLegs=" + numLegs + ", numEyes=" + numEyes + ", Name='" + Name + '\''
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Humanoid)) {
      return false;
    }
    Humanoid humanoid = (Humanoid) o;
    return numLegs == humanoid.numLegs && numEyes == humanoid.numEyes;
  }

  @Override
  public int hashCode() {
    return Objects.hash(numLegs, numEyes);
  }
}
