
package random.number;

import java.util.*;
public class RandomNumber {

    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
       int number1,number2;
       number1 = (int)(Math.random()*10);
       number2 = (int)(Math.random()*10);
       
       number2 = input.nextInt();
       double sub = number1 - number2;
        System.out.println("what is the answer" +number1+"-" +number2+"?");
        double useranswer = input.nextInt();
        if(sub == useranswer){System.out.println("correct");}
        else{System.out.println("wrong");
        
        }
        
       
    }
    
}
