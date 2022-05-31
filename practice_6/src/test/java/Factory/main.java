package Factory;

public class main {
    public static void main(String[] args) {
        ICreator fileCSV = new CreatorCSV();
        Application appCSV = new Application(fileCSV);
        System.out.println(appCSV.getUsers("./file_1.csv "));

        ICreator fileXML = new CreatorXML();
        Application appXML = new Application(fileXML);
        System.out.println(appCSV.getUsers("./file_1.xml "));
    }
}
