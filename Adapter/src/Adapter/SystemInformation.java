package Adapter;

public class SystemInformation {

    private UserInformation userInformation;
    private KardexInformation kardexInformation;

    public SystemInformation(UserInformation userInformation, KardexInformation kardexInformation) {
        this.userInformation = userInformation;
        this.kardexInformation = kardexInformation;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public KardexInformation getKardexInformation() {
        return kardexInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public void setKardexInformation(KardexInformation kardexInformation) {
        this.kardexInformation = kardexInformation;
    }
}
