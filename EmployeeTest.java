public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Myers", 17899, "Accountig", "Vicepresident" );

        Employee employee2 = new Employee("Mark Jones", 39119, "IT0", "Programmer");

        Employee employee3 = new Employee("Joy Rogers", 81774, " Manufacturing", "Engineer");

        employee1.DisplayInfo();
        employee2.DisplayInfo();
        employee3.DisplayInfo();
    }
}
