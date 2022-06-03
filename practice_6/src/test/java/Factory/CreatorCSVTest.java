package Factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreatorCSVTest {

    @Test
    public void createObject() {
        ICreator creator = new CreatorCSV();
        IDriver objectCSV = creator.createDriver();

        assertNotNull(objectCSV);
    }
}