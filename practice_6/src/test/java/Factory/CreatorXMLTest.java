package Factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreatorXMLTest {

    @Test
    public void createObject() {
        ICreator creator = new CreatorXML();
        IDriver objectXML = creator.createDriver();

        assertNotNull(objectXML);
    }
}