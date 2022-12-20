public class Email extends Message {

    private String messageSubject;
    private String recipentAddress;
    
    public String getMessageSubject() {
        return messageSubject;
    }
    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }
    public String getRecipentAddress() {
        return recipentAddress;
    }
    public void setRecipentAddress(String recipentAddress) {
        this.recipentAddress = recipentAddress;
    }
    
    public Email(String text, String messageSubject, String recipentAddress) {
        super(text);
        this.messageSubject = messageSubject;
        this.recipentAddress = recipentAddress;
    }
    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Sending to: "+recipentAddress+
        "\nSubject: "+messageSubject+"\n"+super.getText()
        +"\nNumber of characters: "+super.charNumber());
        
    }

    
}
