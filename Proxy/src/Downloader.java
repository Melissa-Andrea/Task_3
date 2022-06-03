import java.util.HashMap;

public class Downloader {
    private IImageAccessor api;

    public Downloader(IImageAccessor api) {
        this.api = api;
    }

    public void renderImages(){
        HashMap<String, Image> list = this.api.images();
        System.out.println("Images available on our app");
        for (Image image : list.values()) {
            System.out.println("Name: "+ image.name +  " / Category: "+ image.category );
        }

        System.out.println("-------------------------------");
    }
}
