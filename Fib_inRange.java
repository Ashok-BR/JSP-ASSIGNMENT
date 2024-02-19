public class Fib_inRange {
    public static void print(int n)
    {
        long n1=0;
        long n2=1;
        long n3=0;
        if(n==1)
        {
            n3=n1+n2;
        }
        else 
        {

        }
        for(int i=1;i<=n;i++)
        {
            n3=n1+n2;
            if(n3<=n)
            {
                System.out.println(n3);
            }
            n1=n2;
            n2=n3;

        }
    


    }
    public static void main(String[] args) {
        print(2);
    }
    
}
