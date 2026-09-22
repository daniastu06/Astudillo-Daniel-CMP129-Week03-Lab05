public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void dateNumb(){
        System.out.println(month + "/" + day + "/" + year);
    }

    public void dateLett(){
        String[] months = {"", "January", "February", "March", "April", "May",
                            "June", "July", "August", "September", "October", 
                            "November", "December"};
        
        System.out.println(months[month] + " " + day + "," + year);                
    }

    public void dateLett2(){
        String[] months = {"", "January", "February", "March", "April", "May",
                            "June", "July", "August", "September", "October", 
                            "November", "December"};
        
        System.out.println(day + " " + months[month] + " " + year);                
    }
}
