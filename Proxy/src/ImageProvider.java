import java.util.HashMap;

public class ImageProvider implements IImageAccessor{

    public HashMap<String, Image> images(){
        establishConnection("https://source.com/pop");
        return getImages();
    }
    public HashMap<String, Image> getImages() {
        System.out.println("Images .... ");
        experienceNetworkLatency();
        HashMap<String, Image> hmap = new HashMap<String, Image>();
        hmap.put("./1.png", new Image("cheese", "food"));
        hmap.put("./2.png", new Image("wine", "drink"));
        hmap.put("./3.png", new Image("fight", "racy"));
        hmap.put("./4.png", new Image("family", "people"));
        hmap.put("./5.png", new Image("blue sky", "sky"));

        System.out.println("Done!");
        return hmap;
    }

    private void establishConnection(String route) {
        System.out.println("Connecting to " + route + "... ");
        experienceNetworkLatency();
        System.out.println("Connected!");
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }



}
