// public class Rcursive {
//     static int i=1;
//     public static void show()
//     {
//         if(i<7)
//         {
//             System.out.print(i++ +" ");
//             show();
//         }
//     }
//     public static void main(String[] args) {
//         show();
//     }
    
// }
class Rcursive{
    static int i=1;
public static void show()
       {
        // int n=5;
        
        if(i<5){
            System.out.println(i);
            i=i+1;
            show();
        }
    
       }
       public static void main(String[] args) {
        show();
       }
}
