package Test2;

public class CheckFib {
    public static boolean isPerfectSquare(int x){
        int s=(int)Math.sqrt(x);
        return(s*s==x);    
    }
    public static boolean isFib(int n)
    {
        
        return(isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4));
        
    }
    public static void main(String[] args) {
        System.out.println(isFib(13));
    }
    
    
}
