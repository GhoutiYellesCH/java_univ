package exo5;

public class Employee {
    public String type;

    public Employee() {
        type = "employee";
    }

    public void type() {
        type = "original grade " + type;
        System.out.println(type);
    }
}
