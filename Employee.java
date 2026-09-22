public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee (String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public void DisplayInfo (){
        System.out.println(name + "\t" + idNumber + "\t" + department + "\t" + position);
    }

}
    