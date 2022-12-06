import java.util.ArrayList;

public class Folder {

    private String name;
    private int size;
    ArrayList<File> files = new ArrayList<File>();


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int NumberOfFiles() {
        return files.size();
    }

    public Folder(String name) {
        this.name = name;
    }

    public void displayFolderContent() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for (File file : this.files) {
            System.out.println(file.getName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public static void main(String[] args) {
        Folder folder1 = new Folder("Studia");
        File file1 = new File("test.txt",13);
        File file2 = new File("Zadanie.pdf",1223);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder1.displayFolderContent();
        
        File file3 = new File("Zadanie_v2.pdf",1341);

        folder1.addFile(file3);
        folder1.displayFolderContent();
        folder1.removeFile(file2);
        folder1.displayFolderContent();

    }

}