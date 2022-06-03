public class SmsListener implements IListener{
    @Override
    public void notify(User event) {
        System.out.println("Sending greetings to: " + event.getPhone());
    }
}
