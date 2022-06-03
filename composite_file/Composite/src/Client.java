public class Client {
    public static void main(String[] args) {
        INameProvider file = new File("|-----> Adapter");
        INameProvider file_1 = new File("|-----> Composite");
        INameProvider file_2 = new File("|--> Documents");
        INameProvider file_3 = new File("|--> Desktop");


        Directory downloadsDirectory = new Directory("|--> Downloads");
        downloadsDirectory.addFile(file);
        downloadsDirectory.addFile(file_1);

        Directory cDirectory = new Directory("-> C");
        cDirectory.addFile(downloadsDirectory);
        cDirectory.addFile(file_2);
        cDirectory.addFile(file_3);

        System.out.println(cDirectory.getName());

    }


}
