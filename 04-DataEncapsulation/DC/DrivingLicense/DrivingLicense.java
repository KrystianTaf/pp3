public class DrivingLicense{

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private String yearOfIssue;
    private String licenseCategory;

    public void display(){
        System.out.println(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        name = name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String  getLicenseNumber(){
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    public String getYearOfIssue(){
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }

    public String getLicenseCategory(){
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory){
        this.licenseCategory = licenseCategory;
    }

    public String toString(){
        return "Name: "+name+" Surname: "+surname+" Address: "+address
        +" Postal code: "+postalCode+" City: "+city+" Driving license number: "+licenseNumber
        +" Year of issue: "+yearOfIssue+" Driving license category: "+licenseCategory;
    }
}