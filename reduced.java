/**
 * @(#)reduced.java
 *
 *
 * @author 
 * @version 1.00 2011/11/11
 */


 import javax.swing.JOptionPane;
 
public class reduced {
    
    public static void main(String[] args) {
    	
    	String firstNumber = JOptionPane.showInputDialog( "Enter oprice Double " );
    	String secondNumber = JOptionPane.showInputDialog( "Enter lowperp Double " );
    	
    	// convert string inputs to int values for use in a calculation
        Double oprice = Double.parseDouble( firstNumber );
       	Double lowperp = Double.parseDouble( secondNumber );
        
        Double pprice = lowperp / 100;                        //percentage increased
    
        Double pricep = oprice * pprice ;                   //percentage price     
    
        Double totalp = oprice - pricep;                        // Total price
        
         
    	
    	JOptionPane.showMessageDialog( null, " totalp is " + totalp, "totalp of Two Doubles", JOptionPane.PLAIN_MESSAGE );
    }
    }

    
