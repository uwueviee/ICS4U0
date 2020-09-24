package Classes.Constructors;

public class Parameters {
    int x;

    int modelYear;
    String modelName;

    public Parameters(int y, int year, String name) {
        x = y;

        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Parameters myObj = new Parameters(5, 1969, "Mustang");

        System.out.println(myObj.x);
        System.out.println(myObj.modelYear + " " + myObj.modelName);
    }
}
