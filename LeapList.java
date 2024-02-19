import java.util.Scanner;

public class LeapList {
    public static void check(int a,int b)
    {
        System.out.println("Leap years are...");
        for(int i=a;i<=b;i++)
        {
            if((i%100==0 && i%400==0) || i%100!=0 && i%4==0 )
            {
                System.out.println(i);
            }
          
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Range1");
        int r1=s.nextInt();
        System.out.println("Enter Range2");
        int r2=s.nextInt();
        check(r1, r2);
        s.close();
    }
    
}
