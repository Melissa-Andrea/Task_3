public class EmailListener implements IListener {

    @Override
    public void notify(User event) {
        System.out.println("Sending email to WebMaster");
    }
}
