public class Outputs {
    private String email;
    private String integer;
    private String date;

    public Outputs(String email, String integer, String date) {
        this.email = email;
        this.integer = integer;
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInteger() {
        return integer;
    }

    public void setInteger(String integer) {
        this.integer = integer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
