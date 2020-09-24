package Classes.Methods;

public class AccessMethodsWithAnObject {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        AccessMethodsWithAnObject myCar = new AccessMethodsWithAnObject();

        myCar.fullThrottle();
        myCar.speed(200);
    }
}
