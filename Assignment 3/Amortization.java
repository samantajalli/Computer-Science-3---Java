/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment.pkg2;

/**
 *
 * @author Saman
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Amortization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Principal;
        String Rate;
        String Term;
        
        int count = 1;
        
        while (count <= 3)
        {
        System.out.println("Please enter the data for " + count + "st mortgage");
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        
        Principal = JOptionPane.showInputDialog("Enter the principal");
        Rate = JOptionPane.showInputDialog("Enter the rate");
        Term = JOptionPane.showInputDialog("Enter the term");
        
        double principal = Integer.parseInt(Principal);
        double rate = Double.parseDouble(Rate) / 1200.0;
        double term = Double.parseDouble(Term) * 12;
        
        double a[] = new double[4];
        a[0] = term; // set 1st index to term
        a[1] = rate; // set next index to rate
        a[2] = principal; // set final index to mortgage amount
        a[3] = (principal * rate) / (1 - Math.pow(rate + 1, -term)); // monthly payment
        System.out.println("Term \t" + "Rate \t" + "\t\tPrincipal \t" + " Monthly Payment");
        System.out.println( a[0] + "\t" + a[1] + "\t" + a[2] + "\t" + a[3]);
        
        count++;
        }
        
        
    }
    
}
