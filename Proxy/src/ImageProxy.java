import java.util.HashMap;

public class ImageProxy implements IImageAccessor{
    private ImageProvider provider;
    private User user;
    private HashMap<String, Image> ImageCache = new HashMap<>();

    public ImageProxy(ImageProvider provider, User user) {
        this.provider = provider;
        this.user = user;
    }


    public HashMap<String, Image> images() {
        if(ImageCache.isEmpty()){
            if (user.getUserAge() >= 18)
                ImageCache = provider.images();

        }
        return ImageCache;
    }

}
