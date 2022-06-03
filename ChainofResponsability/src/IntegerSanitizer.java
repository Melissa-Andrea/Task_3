import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerSanitizer extends SanitizerHandler{
    private String integer;

    public IntegerSanitizer(String integer) {
        this.integer = integer;
    }

    public Outputs sanitize(Inputs request) {

        if(!this.integer.matches("[0-9]*")){
            request.sanitizerInput("integer"," ");
        }
        return super.sanitize(request);

    }
}
