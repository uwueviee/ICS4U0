package Classes.Methods;

public class StaticVsNonStatic {
    public static void main(String[] args) {
        myStaticMethod();

        StaticVsNonStatic myObj = new StaticVsNonStatic();
        myObj.myPublicMethod();
    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
