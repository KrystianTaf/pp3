public class SMS extends Message {
    
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public SMS(String text, String phoneNumber) {
        super(text);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Sending to "+phoneNumber+"\n"
        +super.getText()+"\nNumber of characters: "+super.charNumber());
    }

    
}
