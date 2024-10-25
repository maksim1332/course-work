import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Александр", "Серегей", "Пётр", "Николай", "Инокентий"};
    private final static String[] SURNAMES = {"Иванов", "Александров", "Серегеев", "Пётров", "Николаев", "Инокентьев"};
    private final static String[] PATRONYMIC_NAEMS = {"Иванович", "Александрович", "Серегеевич", "Пётрович", "Николаевич", "Инокентьевич"};

    private static EmployeeBook employeeBook = new EmployeeBook();

    private static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                    PATRONYMIC_NAEMS[RANDOM.nextInt(0, PATRONYMIC_NAEMS.length)];
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(50_000, 100_000));
        }
    }

    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("Сумма ЗП сотрудников: " + calculateSumOfSalaries());
        System.out.println("Сотрудник с мин ЗП : " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с макс ЗП : " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП : " + calculateAverageOfSalaries());
        printFullNames();

    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / EMPLOYEES.length;
    }

    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

}