public class SanitizerHandler implements  ISanitization {
    private ISanitization next;
    @Override
    public Outputs sanitize(Inputs request) {
        if(next != null){
            return next.sanitize(request);
        }
        String email = request.getInputs().get("email");
        String integer = request.getInputs().get("integer");
        String date = request.getInputs().get("date");

        return new Outputs(email, integer, date);

    }

    @Override
    public void setNext(ISanitization sanitizer) {
        next= sanitizer;
    }
}
