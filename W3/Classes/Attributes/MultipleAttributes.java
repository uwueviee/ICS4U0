package Classes.Attributes;

public class MultipleAttributes {
    String fname = "Allan";
    String lname = "Yang";
    int age = 17;

    public static void main(String[] args) {
        MultipleAttributes myObj = new MultipleAttributes();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
