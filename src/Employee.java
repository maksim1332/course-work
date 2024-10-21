public class Employee {
    private static int counter = 0;
    private int id;
    String name;
    double salary;

    Employee(String name, double salary) {
        this.id = ++counter;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
}
