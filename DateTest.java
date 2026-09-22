import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month: ");
        int month = input.nextInt();

        while (month < 1 && month > 12)  {
            System.out.println("Invalid month");
            month = input.nextInt();
        }

        System.out.println("Enter day: ");
        int day = input.nextInt();

        while(day < 1 && day > 31) {
            System.out.println("Invalid day");
            day = input.nextInt();
        }

        System.out.println("Enter year: ");
        int year = input.nextInt();

        Date date = new Date(month, day, year);
            date.dateNumb();
            date.dateLett();
            date.dateLett2();
    
    }
    
}
