package de.das_rsg.cs_workshop.java_app.entities.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EntityTest {
    @Test
    public void testEntity() {
        Entity entity = new Entity();
        assert entity.getId() != null;
    }
    @Test
    public void testEntityEquality() {
        Entity entity1 = new Entity();
        Entity entity2 = new Entity();
        assert entity1.getId() != entity2.getId();
    }
}
