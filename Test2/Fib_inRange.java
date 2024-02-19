package Test2;

public class Fib_inRange {
    public static void print(int n)
    {
        int a=0;
        int b=1;
        int temp=0;
        for(int i=0;i<10;i++)
        {
            if(temp<=n)
                System.out.println(temp+" ");
            temp=a+b;
            // System.out.println(temp+" ");
            a=b;
            b=temp;
           
        }
    }
    public static void main(String[] args) {
        print(15);
    }
    
}
