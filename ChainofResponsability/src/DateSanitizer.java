import java.text.SimpleDateFormat;

public class DateSanitizer extends SanitizerHandler{
    private String date;

    public DateSanitizer(String date) {
        this.date = date;
    }

    public Outputs sanitize(Inputs request){
        String regex = "^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$";
        if(!this.date.matches(regex)) {
            request.sanitizerInput("date","1991/01/01");

        }
        return super.sanitize(request);

    }
}
