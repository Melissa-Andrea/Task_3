import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory  implements INameProvider{

    private List<INameProvider> files = new ArrayList<>();
    private String directoryName;

    public Directory( String directoryName) {
        //this.files = files;
        this.directoryName = directoryName;
    }

    public void addFile(INameProvider file){
        files.add(file);
    }

    public void removeFile(INameProvider file){
        files.remove(file);
    }

    public String getDirectoryName(){
        return directoryName;
    }
    @Override
    public String getName() {
        String n = new String();
        Collections.reverse(files);
        files.forEach((file)-> System.out.println(file.getName()));
        //files.forEach((file)-> System.out.println(file.getName()));
        return getDirectoryName();
    }
}
