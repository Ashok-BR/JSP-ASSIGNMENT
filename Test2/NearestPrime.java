package Test2;

import java.util.Scanner;

public class NearestPrime {
    public static void nearPrime(int a)
    {
        int temp1=a;
        int temp2=a;
        if(check(a)==1){
            System.out.println("Nearest Prime " +a);
        }
        else
        {
            while (check(temp1)!=1) {
                // count1++;
                // temp1=a++;
                temp1++;
                
            }
            while (check(temp2)!=1) {
                // count2++;
                // temp2=a--;
                temp2--;
            }
            int res= (temp1 - a < a - temp2) ? temp1 : temp2;
            System.out.println("Nearest Prime: "+res);
        }
        
    }

    public static int check(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2||n==3)
        {
            return 1;
        }
        if (n % 2 == 0 || n % 3 == 0)
            return 0;
        for(int i=5;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a=0;
        Scanner s=new Scanner(System.in);
        // while (true) {
            System.out.println("Enter a number");
            a=s.nextInt();
            nearPrime(a);

        // }
    }
}
