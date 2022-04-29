public class Employee {

    // Ф.И.О., отдел и зарплата сотрудника.
    private String lastName;
    private String name;
    private String patronymic;
    private int department;
    private double salary;
    static int id;


    public Employee(int id, String lastName, String name, String patronymic, int department, double salary) {

        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = (int) Math.round(1 + Math.random() * 4);
        this.salary = Math.round(15000 + Math.random() * 135000);

    }

    public String getLastName() {

        return lastName;
    }

    public String getName() {

        return name;
    }

    public String getPatronymic() {

        return patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "Работник: " + id + " " + lastName + " " + name + " " + patronymic + ", из отдела № " + department + " получает " + salary + " рублей" + ".";
    }
}
