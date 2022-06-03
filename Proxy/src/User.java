public class User {
    private String name;
    private int userAge;

    public User(String name, int userAge) {
        this.name = name;
        this.userAge = userAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
