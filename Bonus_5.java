
import java.util.Scanner;
public class Bonus_5 {
    
    
    public static void give_bonus()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Year of Experience");
        int yos=s.nextInt();
        System.out.println("Enter your salary");
        float sal=s.nextInt();
        if(yos>5)
        {
            sal=sal+sal*5.0f/100;
            System.out.println("Salary is "+sal);
        }
        else
        {
            System.out.println("Salary is "+sal);
        }
        s.close();
            

    }
    public static void main(String[] args) {
        give_bonus();
    }

    
}
