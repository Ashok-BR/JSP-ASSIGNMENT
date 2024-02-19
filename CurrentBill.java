

public class CurrentBill {
    public static float bill(int units)
    {
        float amt=0;
        if(units>200)
        {
            amt=(units-200)*10;
            amt+=100*5;
            return amt;
        }
        else if(units>100)
        {
            amt=(units-100)*5;
            return amt;
        }
        else 
        {
            return 0;
        }
    }
    public static void main(String[] args) {
       System.out.println( bill(110));
    }
    
}
