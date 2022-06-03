package Factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class DriverCSVTest {

    @Test
    public void readFunctional() {
        IDriver csvDriver = new DriverCSV();
        String filenameCsv =  csvDriver.read("./csv_filename");
        assertTrue(filenameCsv.length() >0);
    }
}