import java.util.Scanner;
public class conditional {
    public static void main( String[] args){
        //conditional statement 
        Scanner sc =new Scanner (System.in);
        //pen =10,notebook=40;
         
        int cash =sc.nextInt();
        if(cash<10){//we have to make a block if we have to return more than on e value

            System.out.println("cannot buy anything");
            System.out.println("get more cash");    
        }
        else if (cash>10&& cash <50){
            System.out.println("can get one thing");
        }
        else{
            System.out.println("can get both");
        }

    }
    
}
