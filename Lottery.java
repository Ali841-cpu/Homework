
package lottery;
import java.util.*;

public class Lottery {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomnumber1 = (int) (Math.random() * 10);
        int randomnumber2 = (int) (Math.random() * 10);
        System.out.println("please enter the golden numbers");
        int golden1, golden2;
        System.out.println("please enter the golden number1");
        golden1 = input.nextInt();
        System.out.println("please enter the golden number2");
        golden2 = input.nextInt();
        if(golden1 == randomnumber1 && golden2 == randomnumber2){
            System.out.println("Congratulation you have won 1000$");
        }else if(golden1 == randomnumber2 || golden2 == randomnumber1){
            System.out.println("Congratulation you have 2000$ ");  
        }else if(golden1 == randomnumber1 || golden2 == randomnumber2){
            System.out.println("Congratulation you have 1000");
        }else{
              System.out.println("sorry, you have no thing , please try again");
        }
          
        
                
        
                
    }
    
}
