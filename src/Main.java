
public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(Employee.id, "Иванов", "Иван", "Иванович", 0, 0);
        employee[1] = new Employee(Employee.id, "Петров", "Петр", "Петрович", 0, 0);
        employee[2] = new Employee(Employee.id, "Фомин", "Фома", "Фомич", 0, 0);
        employee[3] = new Employee(Employee.id, "Кузьмин", "Кузьма", "Кузьмич", 0, 0);
        employee[4] = new Employee(Employee.id, "Ильин", "Илья", "Ильич", 0, 0);
        employee[5] = new Employee(Employee.id, "Хомин", "Хома", "Хомич", 0, 0);
        employee[6] = new Employee(Employee.id, "Степанов", "Степан", "Степанович", 0, 0);
        employee[7] = new Employee(Employee.id, "Ливанов", "Ливан", "Ливанович", 0, 0);
        employee[8] = new Employee(Employee.id, "Ильясов", "Ильяс", "Ильясович", 0, 0);
        employee[9] = new Employee(Employee.id, "Федотов", "Федот", "Федотович", 0, 0);


        dataChange(employee);
        publishEmployees(employee);
        ollSalary(employee);
        maxSalaryEmployees(employee);
        minSalaryEmployees(employee);
        averageSalary(employee);

    }

    public static void dataChange(Employee[] employee) {

        employee[0].setSalary(150_000.0);
        employee[1].setSalary(140_000.0);
        employee[2].setSalary(130_000.0);
        employee[3].setSalary(120_000.0);
        employee[4].setSalary(110_000.0);
        employee[5].setSalary(100_000.0);
        employee[6].setSalary(90_000.0);
        employee[7].setSalary(80_000.0);
        employee[8].setSalary(70_000.0);
        employee[9].setSalary(60_000.0);

        employee[0].setDepartment(1);
        employee[1].setDepartment(1);
        employee[2].setDepartment(2);
        employee[3].setDepartment(2);
        employee[4].setDepartment(3);
        employee[5].setDepartment(3);
        employee[6].setDepartment(4);
        employee[7].setDepartment(4);
        employee[8].setDepartment(5);
        employee[9].setDepartment(5);
    }

    public static void publishEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            Employee.id++;
            System.out.println(employee[i]);

        }
    }

    public static void ollSalary(Employee[] employee) {
        double average = 0;
        for (int i = 0; i < employee.length; i++) {
            average = average + employee[i].getSalary();
        }
        System.out.println("\nСумма затрат на зарплаты: " + average);
    }

    static double max = 0.0;

    public static void maxSalaryEmployees(Employee[] employee) {
        String nameMax = "";
        String lastNameMax = "";
        String patronymicMax = "";
        int departmentMax = 0;
        for (int i = 0; i < employee.length; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
                nameMax = employee[i].getName();
                lastNameMax = employee[i].getLastName();
                patronymicMax = employee[i].getPatronymic();
                departmentMax = employee[i].getDepartment();

            }

        }
        System.out.println("\nМаксимальную плату получил сотрудник: " + lastNameMax + " " + nameMax + " " + patronymicMax + " из " + departmentMax + " отдела. Аж: " + max + " рублей!");
    }

    public static void minSalaryEmployees(Employee[] employee) {
        String nameMin = "";
        String lastNameMin = "";
        String patronymicMin = "";
        int departmentMin = 0;
        double min = max;
        for (int i = 0; i < employee.length; i++) {

            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
                nameMin = employee[i].getName();
                lastNameMin = employee[i].getLastName();
                patronymicMin = employee[i].getPatronymic();
                departmentMin = employee[i].getDepartment();
            }

        }
        System.out.println("\nМинимальную плату получил сотрудник: " + lastNameMin + " " + nameMin + " " + patronymicMin + " из " + departmentMin + " отдела. Всего: " + min + " рублей!");

    }

    public static void averageSalary(Employee[] employee) {
        double average = 0;
        for (int i = 0; i < employee.length; i++) {
            average = average + employee[i].getSalary();
        }
        average = average / employee.length;
        System.out.println("\nСреднее значение зарплат: " + average);
    }
}


