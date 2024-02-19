public class AlternativePrime {
    public static void print(int start, int end)
    {
        int temp=1;
        for(int i=start;i<=end;i++){
            if(check(i)){
                if(temp%2!=0)
                System.out.println(i+" ");
                temp++;
            }
        }

    }

    public static boolean check(int n)
    {
        if(n==1)
        {
            return false;
        }
        else if(n==2||n==3)
        {
            return true;
        }
        else if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        print(10, 30);
    }

}
