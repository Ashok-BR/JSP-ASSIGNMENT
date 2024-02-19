
public class IncOrder_3num {
    public static void arrange(int a, int b,int c)
    {
        int max=0;
        int mid=0;
        int low=0;
        if(a>b&&a>c)
        {
             max=a;
            if(b>c)
            {
                 mid=b;
                 low=c;
            }
            else 
            {
                mid=c;
                low=b;
            }
        }
        else if(b>c&&b>a)
        {
            max=b;
            if(a>c)
            {
                mid=a;
                low=c;
            }
        }
        else if(c>a&&c>b)
        {
            max=c;
            if(a>b)
            {
                mid=a;
                low=b;
            }
        }
        System.out.println("a:"+max);
        System.out.println("b:"+mid);
        System.out.println("c:"+low);
        
    }
    public static void main(String[] args) {
        arrange(54,90,3);
    }
    
}
