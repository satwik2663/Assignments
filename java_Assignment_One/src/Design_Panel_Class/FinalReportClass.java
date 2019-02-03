package Design_Panel_Class;

public class FinalReportClass 
{
    //Instance Variables
    private DemographicClass demographic;
    private AddressClass address;
    private AccountClass savingAccount;
    private AccountClass checkingAccount;
    private LicenseClass license;
    private MedicalClass medical;
    
    //constructor to assign instance variable to the created object
    public FinalReportClass() {
        demographic = new DemographicClass();
        address = new AddressClass();
        savingAccount = new AccountClass();
        checkingAccount = new AccountClass();
        license = new LicenseClass();
        medical = new MedicalClass();   
    }
    
    //getter and setter for the Instance Variables
    public DemographicClass getDemographic() {
       
        return demographic;
    }

    public void setDemographic(DemographicClass demographic) {
        this.demographic = demographic;
    }

    public AddressClass getAddress() {
        return address;
    }

    public void setAddress(AddressClass address) {
        this.address = address;
    }

    public AccountClass getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(AccountClass savingAccount) {
        this.savingAccount = savingAccount;
    }

    public AccountClass getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(AccountClass checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public LicenseClass getLicense() {
        return license;
    }

    public void setLicense(LicenseClass license) {
        this.license = license;
    }

    public MedicalClass getMedical() {
        return medical;
    }

    public void setMedical(MedicalClass medical) {
        this.medical = medical;
    }
   
}
