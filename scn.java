import java.util.Scanner; 

public class scn {
    public static void main(String[] args) {
        // How to take input?
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input your name:");
        
        // Corrected method for float input
       // Float age = sc.nextFloat(); 
        
       // System.out.println("Your age is: " + age);
       // String  name =sc.next();// it can only take single word as a token 
       // System.out.println(name );
        String  name =sc.nextLine ();
        System.out.println(name );
        sc.close(); // Close scanner to prevent resource leaks
    }
}
