package Factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class DriverXMLTest {

    @Test
    public void readFunctional() {
        IDriver xmlDriver = new DriverXML();
        String filenameXml =  xmlDriver.read("./xml_filename");
        assertTrue(filenameXml.length() >0);
    }
}