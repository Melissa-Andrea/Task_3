public class Demo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Start image app");
        User user = new User("Andres", 20);
        ImageProvider provider = new ImageProvider();
        ImageProxy proxy = new ImageProxy(provider, user);
        Downloader downloader = new Downloader(proxy);
        downloader.renderImages();
        long endTime = System.currentTimeMillis();
        System.out.println("time: "+ (endTime - startTime) + "ms");
        downloader.renderImages();
        System.out.println("time: "+ (System.currentTimeMillis() - endTime) + "ms");
        System.out.println("End image app");
    }
}
