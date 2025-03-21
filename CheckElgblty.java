import java.util.Scanner;

public class CheckElgblty 
{
    static int BTech=1;
    static int BE=1; static int MTECh=2; static int ME=2; static int BCA=3;//qcode
    static int MCA=4; static int BSC=5; static int MSC=6; //qcode
    static int cs=1;static int IS=2; static int it=3;//scode
    static int ec=4; static int ee=5; static int Mec=6; static int civil=7; static int oth=8; //scode
    static boolean isQualfn;
    static boolean isStream;
    static boolean isYop;

    public static boolean checkyop( int yop)
    {
       if(yop == 2023 || yop == 2022 || yop == 2024)
       {
        isYop=true;
        return isYop;

       }
       else
       {
         isYop=false;
         return isYop;
       }
    }
    public static boolean checkQual(int qcode)
    {
        if(qcode == BE || qcode == BTech || qcode == BCA || qcode == MCA)
        {
            isQualfn=true;
            return isQualfn;
        }
        else 
        {
             isQualfn=false;
             return isQualfn;
        }
    }
   public static boolean checkStream(int scode)
   {
    if(scode== cs || scode== IS|| scode == it)
    {
        isStream=true;
        return isStream;
    }
    else
    {
        isStream=false;
        return isStream;
    }
    
   }
   public static void check()
   {
    if(!isYop && !isQualfn && !isStream)
   {
    System.out.println("Your Year of passout,qualification and Stream are not matching");
   }
   else if(!isYop && !isQualfn)
   {
    System.out.println("Your year of passout and qualification are not match");
   }
   else if(!isQualfn && !isStream)
   {
    System.out.println("Your qualification and Stream are not match");
   }
   else if(!isYop && isStream)
   {
    System.out.println("Your year of pass out and Stream are not matching");
   }
   else if(!isYop)
   {
    System.out.println("Your Year of Pass out is not matching");
   }
   else if(!isQualfn)
   {
    System.out.println("Your year Qualification is not matching");
   }
   else if(!isStream)
   {
    System.out.println("Your Stream is not matching");
   }
   else if(isYop && isQualfn && isStream)
   {
    System.out.println("Your elligible for interview");
   }
   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Qualification Code");
        System.out.println("BE=1; MTECh=2; ME=2; BCA=3; MCA=4; BSC=5; MSC=6;");
        System.out.println("Stream code");
        System.out.println("cs=1; IS=2; it=3; ec=4; ee=5; Mec=6; civil=7; oth=8;");
        System.out.println("Enter Year of Pass out");
        int a=s.nextInt();
        System.out.println("Enter Qualification");
        int b=s.nextInt();
        System.out.println("Enter Your Stream");
        int c=s.nextInt();
        checkyop(a);
        checkQual(b);
        checkStream(c);
        check();
        s.close();
    }
}
