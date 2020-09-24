package Classes.Modifiers;

public class Final {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Final myObj = new Final();

        // myObj.x = 50; Cannot assign a value to a final variable
        // myObj.PI = 25; Cannot assign a value to a final variable

        System.out.println(myObj.x);
        System.out.println(myObj.PI);
    }
}
