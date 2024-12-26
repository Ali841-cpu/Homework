
package chinesezodiac;

import java.util.*;
public class Chinesezodiac {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please entered the year to check");
        int year = input.nextInt();
        switch (year%12){
            case 0:
                System.out.println("the entered year is monkey ");
                break;
            case 1:
                System.out.println("the entered year is rooster");
                break;
            case 2:
                System.out.println("the entered year is dog");
                break;
            case 3:
                System.out.println("the entered year is pig");
                break;
            case 4:
                System.out.println("the entered year is rat");
                break;
            case 5:
                System.out.println("the entered year is ox ");
                break;
            case 6:
                System.out.println("the entered year is rabbit");
                break;
            case 7:
                System.out.println("the entered year is dragon");
                break ;
            case 9:
                System.out.println("the entered year is snake");
                break;
            case 10:
                System.out.println("the entered year is horse");
                break;
            case 11:
                System.out.println("the entered year is sheep");
                
                
                
                
                
    }
    }
}