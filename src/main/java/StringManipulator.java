
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0788763
 */
public class StringManipulator {
    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog(null, "Please enter your favorite city");
        
        System.out.println("Number of characters: " + city.length());
        System.out.println("In uppercase: " + city.toUpperCase());
        System.out.println("In lowercase: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));
    }
}
