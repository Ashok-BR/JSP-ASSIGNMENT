package Test2;
public class PrimeCheck {
    public static int check(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2||n==3)
        {
            return 1;
        }
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(check(5));
    }
    
}
