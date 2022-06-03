public class PhotoListener implements IListener{
    @Override
    public void notify(User event) {
        System.out.println("Pinterest photo "+ event.getPinterestPhoto());
    }
}
