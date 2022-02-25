package com.icarus.designPattern.builder;

import com.icarus.designPattern.builder.builders.ConcreteHouseBuilder;
import com.icarus.designPattern.builder.builders.HouseBuilder;
import com.icarus.designPattern.builder.builders.PrefabricatedHouseBuilder;
import com.icarus.designPattern.builder.director.ConstructionEngineer;
import com.icarus.designPattern.builder.product.House;
import org.junit.jupiter.api.Test;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);

        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}
