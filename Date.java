public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year) {
        if (month >= 1 && month <= 12){
            this.month = month;
        } else {
            System.out.println("Invalid date");
        }
        if (day >= 1 && day <= 31){
            this.day = day;
        } else{
            System.out.println("Invalid date");
        }
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
