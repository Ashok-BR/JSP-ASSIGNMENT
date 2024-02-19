import java.util.Scanner;

public class Leap_year {
    public static void check(int y)
    {
        if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0) )
        {
            System.out.println(y +" Year is a Leap year");
        }
       
        else 
        {
            System.out.println(y +" is not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year");
        int y=s.nextInt();
        check(y);
        s.close();
    }
    
}
