package Factory;

import static org.junit.Assert.*;

public class LoggerTest {

    @org.junit.Test
    public void getInstance() {

        Logger logger = Logger.getInstance();
        assertNotNull(logger);
    }
}