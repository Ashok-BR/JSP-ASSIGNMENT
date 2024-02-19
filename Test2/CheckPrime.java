package Test2;

import java.util.Scanner;

public class CheckPrime {
    public boolean check(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        else if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    // public static void print()
    // {
    //     if(check(n))
    // }
    
    
      
}
