package AdressBookEnt;
public class AddressBookEntry {
    private String name;
    private String address;
    private String telephoneNum;
    private String email;


    //Constructor
    public AddressBookEntry() {
        this.name = " ";
        this.address = " ";
        this.telephoneNum = " ";
        this.email = " ";
    }
    
    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public void setEmailAddress(String email) {
        this.email = email;
    }

    // getters 
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNum;
    }

    public String getEmailAddress() {
        return email;
    }

/** */
    @Override
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address + "\nTelephone: " + telephoneNum + "\nEmail: " + email;
    }
}




