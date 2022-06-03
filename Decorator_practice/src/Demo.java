public class Demo {
    public static void main(String[] args) {
        ShowUserName userName = new ShowUserName();
        UnderlineName underlineName = new UnderlineName(userName);
        LightModeName lightModeName = new LightModeName(underlineName);
        System.out.println(lightModeName.getUserName("Melissa"));

        ShowUserName userName_1 = new ShowUserName();
        UnderlineName underlineName_1 = new UnderlineName(userName_1);
        DarkModeName darkModeName = new DarkModeName(underlineName_1);
        System.out.println(darkModeName.getUserName("Melissa"));

    }
}
