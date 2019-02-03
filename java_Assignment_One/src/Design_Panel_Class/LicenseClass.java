package Design_Panel_Class;

public class LicenseClass 
{
    //Instance Variables
    private String lLicenseNumber;
    private String lDateOfIsuue;
    private String lDateOfExpiration;
    private String lBloodType;
    private String lPhoto;
    
    //Getter and Setter for the Instance Variables
    public String getlPhoto() {
        return lPhoto;
    }

    public void setlPhoto(String lPhoto) {
        this.lPhoto = lPhoto;
    }
    public String getlLicenseNumber() {
        return lLicenseNumber;
    }

    public void setlLicenseNumber(String lLicenseNumber) {
        this.lLicenseNumber = lLicenseNumber;
    }

    public String getlDateOfIsuue() {
        return lDateOfIsuue;
    }

    public void setlDateOfIsuue(String lDateOfIsuue) {
        this.lDateOfIsuue = lDateOfIsuue;
    }

    public String getlDateOfExpiration() {
        return lDateOfExpiration;
    }

    public void setlDateOfExpiration(String lDateOfExpiration) {
        this.lDateOfExpiration = lDateOfExpiration;
    }

    public String getlBloodType() {
        return lBloodType;
    }

    public void setlBloodType(String lBloodType) {
        this.lBloodType = lBloodType;
    }


    
}
