
import java.util.Scanner;

public class Attendence {
    public static void check()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total of classes");
        int tot_class=s.nextInt();
        System.out.println("Total no.of classes Attended");
        int Att_class=s.nextInt();
        if((Att_class/tot_class)*100<75)
        {
            System.out.println("You are not allowed to Exam");

        }
        else
        {
            System.out.println("You can write Exam");
        }
        s.close();
    }
    public static void main(String[] args) {
        
        check();
    }
    
}
