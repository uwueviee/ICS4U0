package Classes.Modifiers.Abstract;

public class MyClass {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);

        myObj.study();
    }
}
