
public class Large3 {
    public static int check(int a,int b,int c)
    {
        if(a>b&&a>c) 
            return a; 
        else if(b>c&&b>a)
            return b;
        else 
            return c;  
    }
    public static void main(String[] args) {
        System.out.println(check(9, 12, 34));
    }
         
    
}
