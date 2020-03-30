package Prototype;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class HumanoidTest {

  private ICreature Man = new Humanoid("Man", 2, 2);

  @Test
  public void testClone_CreateTenCreaturesLikeMan_NotError() {
    IPlanet planet = new APlanet() {
      List<ICreature> Creatures = new ArrayList<>();

      @Override
      public void addCreature(ICreature creature) {
        Creatures.add(creature);
      }

      @Override
      public long getPopulation() {
        return Creatures.size();
      }
    };

    for (int i = 0; i < 10; i++) {
      ICreature woman = Man.clone("Woman " + i);
      planet.addCreature(woman);
    }
    Assert.assertEquals(planet.getPopulation(), 10);
  }

  @Test
  public void testHumanoid_createNewCreaturesAnaCreaturesLikeMan_MustBeSame() {
    Assert.assertEquals(new Humanoid("Test", 2, 2), Man.clone("Test"));
  }
}