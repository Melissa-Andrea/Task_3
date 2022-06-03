import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, String > inputs = new HashMap<>();
        inputs.put("email", "malau@gmail.com");
        inputs.put("integer", "7343650");
        inputs.put("date", "01/01/2011");

        Inputs dataReceived = new Inputs(inputs);

        ISanitization emailSanitizer = new EmailSanitizer(inputs.get("email"));
        ISanitization integerSanitizer = new IntegerSanitizer(inputs.get("integer"));
        ISanitization dateSanitizer = new DateSanitizer(inputs.get("date"));

        emailSanitizer.setNext(integerSanitizer);
        integerSanitizer.setNext(dateSanitizer);

        Outputs outputs = emailSanitizer.sanitize(dataReceived);

        System.out.println(outputs.getEmail());
        System.out.println(outputs.getInteger());
        System.out.println(outputs.getDate());


    }
}
