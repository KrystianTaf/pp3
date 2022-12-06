public class ComputerFile {

    String name;
    String type;
    int size;
    boolean isHidden;
    String date;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void displayInfo() {
        System.out.println("File name: "+name+"."+type);
        System.out.println("Size: "+size);
        System.out.println("Date: "+date);
        System.out.println("Is hidden: "+isHidden);
    }

    public void changeHiddenAttribute() {
        isHidden = !isHidden;
    }



    public ComputerFile(String name, String type, int size, boolean isHidden, String date) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.isHidden = isHidden;
        this.date = date;
    }

    public static void main(String[] args) {
        ComputerFile c1 = new ComputerFile("123","txt",12,false,"28-11-2021");
        c1.displayInfo();
        c1.changeHiddenAttribute();
        c1.displayInfo();

    }
    
}