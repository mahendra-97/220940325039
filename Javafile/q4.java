package JavaTest;


class GrandParent{
    String grandFatherName;
    String grandMotherName;
    public GrandParent(String grandFatherName, String grandMotherName) {
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;

        System.out.println("Grand father name : "+this.grandFatherName+"\nGrand mother name : "+this.grandMotherName);
    }
}
class parents extends GrandParent{
    String fatherName;
    String motherName;
    public parents(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName);
        this.fatherName = fatherName;
        this.motherName = motherName;

        System.out.println("\nfather name : "+this.fatherName+"\nmother name : "+this.motherName);
    }
}
class child extends parents{
    public child(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName, fatherName, motherName);
    }
}
public class q4 {
    public static void main(String[] args) {
        child sp = new child("Mahi Grand Father","Mahi Grand Mother","Mahi Father","Mahi Mother");
    }
}
