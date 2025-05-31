import java.lang.classfile.instruction.StoreInstruction;
import java.util.Arrays;

public class array {
    public static  void main(String[] args){
         int age=20;
         int eng=87;
         int chem=85;
         int math=88;
          int[] marks=new int[3];
          marks[0]=87;
          marks[1]=85;
          marks[2]=88;
          //length

          //System.out.println(marks.length);
          //sort
          System.out.println(marks[0]);
          Arrays.sort(marks);
          System.out.println(marks[0]);


    }
    
}