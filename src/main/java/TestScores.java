
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0788763
 */
public class TestScores {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the 3 test scores:");
        
        float testScore1 = keyboard.nextFloat();
        float testScore2 = keyboard.nextFloat();
        float testScore3 = keyboard.nextFloat();
        
        float average = (testScore1 + testScore2 + testScore3)/3;
        
        System.out.println("Test scores were: \n" + testScore1 + "\n" + testScore2 + "\n" + testScore3);
        
        System.out.println("Average was \t" + average);
    }
}
