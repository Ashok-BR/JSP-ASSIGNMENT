public class Fibonnaic {
    static long n1=0;
    static long n2=1;
    static long n3=0;
    
    public static void  printFib(int n)
    {
        if(n == 1 || n == 2) {
            if(n == 1)
                System.out.println(n - 1);
            else
                System.out.println((n - 2) + " " + (n - 1));
            System.out.println(n - 1);
            return;
        }
        long sum=n1+n2;
        // System.out.println(n1);
        // if(n==1)
        // {
        //     System.out.print(n1);
        // }
        // if(n==2)
        // {
        //     System.out.print(n1+" "+n2);
        // }
        
        System.out.print(n1 + " " + n2 + " ");
        for(int i=0;i<n-2;i++)
        {
            n3=n1+n2;
            sum=sum+n3;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        System.out.println("sum: "+sum);
    }
    public static void main(String[] args) {
        printFib(8);
    }
    
}
