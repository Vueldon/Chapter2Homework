
import java.util.Scanner;
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
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Please enter your number");

        System.out.println("Please enter your favorite number");

        String favoriteNumberAsString = JOptionPane.showInputDialog("Favorite number");

        if (favoriteNumberAsString == null) {
            System.exit(1);
        }

        try {
            float favoriteNumberAsFloat = Float.parseFloat(favoriteNumberAsString);
            System.out.println("Awesome number!");
        } catch (Exception x) {
            System.out.println("Hey, that's not a number!");
        }
    }
}
