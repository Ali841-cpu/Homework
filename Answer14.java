
package answer14;
import java.util.*;

public class Answer14 {

    public static void main(String[] args) {
     Scanner Sc = new Scanner(System.in);
     double P , R = 0, T, SI, simpleinterest;
        System.out.println("the value of P");
     P = Sc.nextDouble();
        System.out.println("the value of R");
        R = Sc.nextDouble();
        System.out.println("the value of T");
     T = Sc.nextDouble();
     SI = (P * R * T ) / 100;
        System.out.println("the value of SI=" +SI);
    }
    
}
