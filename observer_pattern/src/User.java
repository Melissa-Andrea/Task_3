public class User {
    private String name;
    private String pinterestPhoto;
    private String phone;

    public User(String name, String pinterestPhoto, String phone) {
        this.name = name;
        this.pinterestPhoto = pinterestPhoto;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinterestPhoto() {
        return pinterestPhoto;
    }

    public void setPinterestPhoto(String pinterestPhoto) {
        this.pinterestPhoto = pinterestPhoto;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
