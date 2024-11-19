import java.util.Scanner;

public class DaysMonthChecker {
    public static void main(String[] args) {
        try (Scanner accept = new Scanner(System.in)) {
            int noofD=0;
            String Mname=" ";
            System.out.println("Enter the month (As a Number) : ");
            int m =accept.nextInt();
            System.out.println("Enter the year : ");
            int y =accept.nextInt();
            switch(m)
            {   
                case 1:
                    Mname="January";
                    noofD=31;
                    break;
                
                case 2:
                    Mname="February";
                    if ((y%400==0) || (( y% 4 ==0) && (y % 100!=0))){
                        noofD=29;
                    } else {
                        noofD=28;
                    }
                    break;

                case 3:
                    Mname="March";
                    noofD=31;
                    break;

                case 4:
                    Mname="April";
                    noofD=30;
                    break;
                
                case 5:
                    Mname="May";
                    noofD=31;
                    break;

                case 6:
                    Mname="June";
                    noofD=30;
                    break;

                case 7:
                    Mname="July";
                    noofD=31;
                    break;

                case 8:
                    Mname="August";
                    noofD=31;
                    break;

                case 9:
                    Mname="September";
                    noofD=30;
                    break;

                case 10:
                    Mname="October";
                    noofD=31;
                    break;

                case 11:
                    Mname="November";
                    noofD=30;
                    break;

                case 12:
                    Mname="December";
                    noofD=31;
                    break;

                }
   System.out.println(Mname + " "+ y+ " has " + noofD+ " days.");
        }      
    }    
}
