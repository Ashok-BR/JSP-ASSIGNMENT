import java.util.Scanner;

public class Factor {

    public static void factr(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                count=count+1;
            }       
        }
        System.out.println(" ");
        System.out.println("No.of Factors: "+count);
    }
    public static void primeno(int n)
    {
        int count=0;
        for(int j=1;j<=n;j++)
        {
            if(n%j==0)
            {
                count=count+1;
               
            }     
        }
        if(count==2)
            {
                System.out.print(n);
            }  
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");
        factr(s.nextInt());
    }
    
}
