package Classes.Attributes;

public class ModifyAttributes {
    int x;
    int f = 10;
    final int e = 10;

    public static void main(String[] args) {
        ModifyAttributes myObj = new ModifyAttributes();

        myObj.x = 40;
        myObj.f = 25;
        // myObj.e = 25; Cannot assign a value to a final variable

        System.out.println(myObj.x);
        System.out.println(myObj.f);
        System.out.println(myObj.e);
    }
}
