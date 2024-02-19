
public class PrimeCheck2 {
    public static int check(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(check(8));
    }
    

    
    
}
