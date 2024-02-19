package Test2;

public class EvenFib {
        
        public static void print(int n)
        {
            int a=0;
            int b=1;
            int temp=0;
            // if(n==1)
            // {
            //     System.out.println(a);
            //     return;
            // }
            // else if(n==2){
            //     System.out.println(a+" "+b);
            //     return;
        
            // }
            // else
            // {
            //     System.out.print(a+" "+b+" ");
            // }
            for(int i=1;i<=n;i++)
            {
                temp=a+b;
                if(temp%2==0){
                System.out.print(temp+" ");
                }
                a=b;
                b=temp;
            }
    
        }
    public static void main(String[] args) {
        print(32);
    }
    
    
    
    

}
