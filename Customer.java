import java.util.Scanner;

public class Customer {
    String name;
    int pin;
    String Bcode;
    int phno;
    boolean pan;
    int bal;
    Customer(String n,int p,String bc,boolean isPan)
    {
        this.name=n;
        this.pin=p;
        this.Bcode=bc;
        this.pan=isPan;
    }
    public int Deposit(int p,int amt)
    {
        if(p>999 && p<10000)
        {
            if(p==this.pin)
            {
                this.bal=bal+amt;
            }
        }
        else{
            System.out.println("Please Enter valid pin");
        }
        return this.bal;
    }
    public int Withdrawl(int p,int amt)
    {
        if(p==this.pin)
        {
            this.bal=bal-amt;
            System.out.println(amt+" withdrwal Successfully");
        }
        return this.bal;
    }
    public void balanceenq(int p)
    {
        if(p==this.pin)
        {
            System.out.println("Amount: "+this.bal);
        }
    }

    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        // System.out.println("1.Deposit 2.Withdrawl 3.Balance Enquiry");
        Customer c1=new Customer("ASHOK", 3824, "b2c1",true);
        c1.Deposit(3824, 5000);
        c1.balanceenq(3824);
        Customer c2 = new Customer("KUMAR", 6281,"b4c3",true);
        c2.Deposit(54327, 10000);
        c2.balanceenq(6281);

    }
}
