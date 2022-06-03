import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSanitizer extends SanitizerHandler {
    private String email;

    public EmailSanitizer(String email) {
        this.email = email;
    }

    public Outputs sanitize(Inputs request) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.email);
        if(!matcher.matches()){
            request.sanitizerInput("email", "");
        }
        return super.sanitize(request);

    }
}
