

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.of items");
        int items=s.nextInt();
        int cost=100*items;
        if(cost>1000)
        {
            float amt=cost-cost*10.0f/100;
            System.out.println(amt);

        }
        else{
            System.out.println(cost);
        }
        s.close();

    }

}
    

