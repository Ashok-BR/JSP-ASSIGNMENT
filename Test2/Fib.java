package Test2;

public class Fib {
    public static void print(int n)
    {
        int a=0;
        int b=1;
        int temp=0;
        if(n==1)
        {
            System.out.println(a);
            return;
        }
        else if(n==2){
            System.out.println(a+" "+b);
            return;
    
        }
        else
        {
            System.out.print(a+" "+b+" ");
        }
        for(int i=1;i<=n-2;i++)
        {
            temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }

    }
    public static void main(String[] args) {
        print(10);
    }
}
