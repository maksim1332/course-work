public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Book");

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван Иванович", 70000);
        employees[1] = new Employee("Мурашкин Юрий Викторовичь", 60000);
        employees[2] = new Employee("Байсодыков Руслан Рустамович", 65000);
        employees[3] = new Employee("Поряков Никита Иванович", 65000);
        employees[4] = new Employee("Кудымов Александр Александровичь", 15000);

        System.out.println("Список сотрудников:===========");
        for (Employee emp : employees) {
            System.out.println(emp.name + ": " + emp.salary);
        }

        System.out.println("Общая затрата в месяц на всех сотрудников============");

        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.salary;
        }
        System.out.println("Общая затрата на зп: " + totalSalary);

        System.out.println(" минимальная зп & максимальная зп==========");
        Employee minSalary = employees[0];
        Employee maxSalary = employees[0];

        for (Employee emp : employees) {
            if (emp.salary < minSalary.salary) {
                minSalary = emp;
            }
            if (emp.salary > maxSalary.salary) {
                maxSalary = emp;
            }
        }
        System.out.println("Сотрудньк с зп мин: " + minSalary.name + "(ID-" + minSalary.getId() + ") - " + minSalary.salary);
        System.out.println("Сотрудньк с зп макс: " + maxSalary.name + "(ID-" + maxSalary.getId() + ") - " + maxSalary.salary);

        System.out.println("Средняя зарплата в месяц===============");

        double averageSalary = totalSalary / employees.length;
        System.out.println("Средняя зарплата: " + averageSalary);
    }
}