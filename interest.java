import javax.swing.JOptionPane;

class interest {
  
   public static void main(String[] args) 
      {
     String name = JOptionPane.showInputDialog( "Item" );
     
     String message = String.format( "Word is, %s, is Items", name );
     
JOptionPane.showMessageDialog( null, message ); 
       
     String firstNumber = JOptionPane.showInputDialog( "Enter QuantitySold Double " );
       
     String secondNumber = JOptionPane.showInputDialog( "Enter UnitCost Double " );
       
     String thirdNumber = JOptionPane.showInputDialog( "Enter OriginalPrice Double " );
       
     String fourthNumber = JOptionPane.showInputDialog( "Enter LowedPercentagePrice Double " );
       
     Double QuantitySold = Double.parseDouble( firstNumber );
       
     Double UnitCost = Double.parseDouble( secondNumber );

     Double OriginalPrice = Double.parseDouble( thirdNumber );

     Double LowedPercentagePrice = Double.parseDouble( fourthNumber );
       
     Double TotalCost = QuantitySold * UnitCost ;

 JOptionPane.showMessageDialog( null, " TotalCost is " + TotalCost, "TotalCost of Two Doubles", 
JOptionPane.PLAIN_MESSAGE );
       
     Double PercentagePrice = LowedPercentagePrice / 100;
       
     Double PricePercentage = OriginalPrice * PercentagePrice ; 
       
     Double TotalPrice = OriginalPrice - PricePercentage; 
       
JOptionPane.showMessageDialog( null, " TotalPrice is " + TotalPrice, "TotalPrice of Two Doubles", JOptionPane.PLAIN_MESSAGE );
     }
}