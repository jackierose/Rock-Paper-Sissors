/*
 * Project: Rock Paper Sissors
 * @author Jacquelyn Reh
 * @version 2014-26-09
 */

import java.util.Scanner;
import java.util.Random;


public class Rocpapsis {
    
    public static boolean compare(String user, String computer) {
        boolean result;
        if (user == computer) {
            System.out.print("TIE");
            result = false;
        }
        else if (user.equals("paper") && computer.equals("sissor") || user.equals("rock") && computer.equals("paper") || user.equals("sissor") && computer.equals("rock")) {
         result = false;   
        }
        else {
          result = true;  
        }
            
         return result;   
    }//close compare
    
    public static String generate() {
     int num;
     String computer = "";
     num = (int)(Math.random() * ((9-0) +1));
     if (num <= 3) {
         computer =  "paper";
     }//ifloop
     if ( num >3 && num <=6) {
         computer = "rock";
     }//ifloop
     if (num >= 9 ) {
         computer = "sissor";
     }//ifloop
     return computer;
    }//closegenerate
 
    public static void main(String[] args) {
        System.out.println("Rock, paper, sissors Game");
        System.out.println("What is your choice? (i.e. rock, paper, or sissor)");
        Scanner s = new Scanner(System.in);
        String user = s.next();
        String comp = Rocpapsis.generate();
        if (Rocpapsis.compare(user, comp) == true) {
         System.out.println(" The computer had: " + comp + "       " + "You had: " + user);
         System.out.println("CONGRATULATIONS");
        }
        else {
             System.out.println(" The computer had: " + comp + "       " + "You had: " + user);
             System.out.println("OUCH");
        }
        
    }//closemain
    
}//close rocpap...