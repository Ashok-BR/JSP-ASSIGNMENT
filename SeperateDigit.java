public class SeperateDigit {
    public static void print(int n)
    {
        int count=0;
        System.out.println("Odd digits");
        while(n>0)
        {
            int rem=n%10;
            // System.out.println(rem);
            // if(rem%2==0)
            // {
            //     System.out.println(rem+" ");
            //     count++;
            // }
            // if(rem%2!=0)
            // {
            //     System.out.println(rem+" ");
            //     count++;
            // }
            n=n/10;
            
        }
        System.out.println("No.of Digits: "+count);
    }
    public static void main(String[] args) {
        print(85443);
    }
    
}
