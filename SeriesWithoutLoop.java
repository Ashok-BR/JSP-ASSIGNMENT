public class SeriesWithoutLoop {
    static int i=1;
       
       public static void main1() {
        if(i<7)
        {
            System.out.print(i++ +" ");
            main1();
        }
        
    }   
    public static void main(String[] args) {
        main1();
    }
    
}
