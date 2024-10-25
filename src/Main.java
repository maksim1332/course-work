import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Александр", "Серегей", "Пётр", "Николай", "Инокентий"};
    private final static String[] SURNAMES = {"Иванов", "Александров", "Серегеев", "Пётров", "Николаев", "Инокентьев"};
    private final static String[] PATRONYMIC_NAMES = {"Иванович", "Александрович", "Серегеевич", "Пётрович", "Николаевич", "Инокентьевич"};

    private static EmployeeBook employeeBook = new EmployeeBook();

    public static void main(String[] args) {
        initEmployees();
        employeeBook.printAllEmployees();
    }

    private static void initEmployees() {
        for (int i = 0; i < 10; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(NAMES.length)] + " " +
                    PATRONYMIC_NAMES[RANDOM.nextInt(PATRONYMIC_NAMES.length)];
            Employee employee = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(50_000, 100_000));
            employeeBook.addEmployee(employee);
        }
    }
}