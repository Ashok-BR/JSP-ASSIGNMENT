

import java.util.Scanner;

public class Absolute_value {
    public static void check()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        float f= s.nextFloat();
        if(f<0)
        {
            f=(-1)*f;
            System.out.println("Absolute value is :"+f);
        }
        else
        {
            System.out.println("The original value is:"+f);
        }
        s.close();
    }
    public static void main(String[] args) {
        check();
    }
    
}
