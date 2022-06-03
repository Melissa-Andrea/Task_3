public class Demo {
    public static void main(String[] args) {
        User newUser = new User ("Andrea", "./path_photo", "123456");
        IListener emailListener = new EmailListener();
        IListener photoListener = new PhotoListener();
        IListener smsListener = new SmsListener();

        UserRegistration userRegistration = new UserRegistration(EventName.REGISTER,EventName.UNREGISTER);
        userRegistration.subscribe(emailListener, EventName.REGISTER);
        userRegistration.subscribe(photoListener, EventName.REGISTER);
        userRegistration.subscribe(smsListener, EventName.REGISTER);

        userRegistration.register(newUser);
    }
}
