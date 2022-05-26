import Creator.UserFileParser;
import Creator.UserFileParserCSV;
import Product.IFileDriver;

public class main {
    public static void main(String[] args) {
        UserFileParser csv = new UserFileParserCSV();
        IFileDriver csvObject = csv.createDriver();
        csv.getUser(".\1.csv");
    }
}
