public class DanglingElseTester {
    public static void main(String[] args) {
         int a =20;

         if(a>30)
         {
           if (a<60)
           System.out.println("a is greater than 30 but less than 60");
         }
        else             //else belongs to the closest if
           
            System.out.println("??????");
           
    }
    
}
