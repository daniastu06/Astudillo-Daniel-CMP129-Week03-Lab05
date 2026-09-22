public class Employee {
    private String name;
    private int idNumber;
    private String deparment;
    private String position;

    public Employee (String name, int idNumber, String deparment, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.deparment = deparment;
        this.position = position;
    }

    public void DisplayInfo (){
        System.out.println(name + "\t" + idNumber + "\t" + deparment + "\t" + position);
    }

}
    