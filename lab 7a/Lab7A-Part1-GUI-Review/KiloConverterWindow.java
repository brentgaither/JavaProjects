import javax.swing.*;    // Needed for Swing classes
import java.awt.*;       // Needed for the AWT toolkit which includes the Color class
import java.awt.event.*; // Needed for ActionListener interface

/** ******************************************************************
                 KiloConverterWindow class declaration
   This class displays a JFrame that converts a user-entered 
   kilometer distance to miles when the Calculate button is clicked. 
 *********************************************************************/

//  1. COMPILE THE GUI_2 PROGRAM, WHICH USES THIS CLASS, 
//     AND SEE WHAT .class FILES IT CREATES. 

//  2. RUN THE PROGRAM, INPUTTING 10 FOR THE NUMBER OF KILOMETERS,
//     AND SEE WHAT HAPPENS.

//  3. LOOK AT THE CODE TO SEE WHICH INSTRUCTIONS CAUSE WHICH RESULTS.

//  4. NOW FOLLOW THE CAPITALIZED INSTRUCTIONS BELOW 
//     AND THEN RE-RUN THE PROGRAM.

public class KiloConverterWindow extends JFrame
{
   private JPanel panel;                   // To reference a panel
   private JLabel messageLabel;            // To reference a label
   private JTextField kiloTextField;       // To reference a text field
   private JButton calcButton;             // To reference a button
   private final int WINDOW_WIDTH = 310;   // Window width
   private final int WINDOW_HEIGHT = 100;  // Window height

   /* ************* Constructor *************/
   public KiloConverterWindow()
   {
      setTitle("Kilometer Converter");

      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /** ***************************************************
                            buildPanel
      The buildPanel method adds a label, a text field, and
      and a button to a panel.
   *******************************************************/
   private void buildPanel()
   {
      // Create a label to display instructions.
      messageLabel = new JLabel("Enter a distance " +
                                "in kilometers");

      // Create a text field 10 characters wide.
      kiloTextField = new JTextField(10);

      // Create a button with the caption "Calculate".
      //calcButton = new JButton("Calculate");
		calcButton = new JButton("Calculate");
      
		// CHANGE THE TEXT ON THE ABOVE BUTTON TO READ "Convert to miles".
		// ADD CODE TO CHANGE THE BACKGROUND COLOR OF THE BUTTON TO BLUE.
		// ADD CODE TO CHANGE THE TEXT COLOR ON THE BUTTON TO WHITE.

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a JPanel object and let the panel reference var "point to" it.
      panel = new JPanel();

      // Add the label, text field, and button components to the panel.
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(calcButton);
      
   }// End buildPanel

   /** *******************************************************
                           CalcButtonListener
       this is an action listener CLASS assocciated with the 
       Calculate button.
   ***********************************************************/
   private class CalcButtonListener implements ActionListener
   {
      /** ***************  actionPerformed ******************
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e is the object that "tiggered" the event.
        *****************************************************/
      public void actionPerformed(ActionEvent e)
      {
         String input;  // To hold the user's input
         double miles;  // The number of miles

         // Get the text entered by the user IN the text field.
         input = kiloTextField.getText();

         // Convert the input to miles.
         miles = Double.parseDouble(input) * 0.6214;
			// ADD A LINE (OR LINES) OF CODE TO CAUSE THE RESULT 
         // STORED IN miles TO DISPLAY WITH 2 DECIMAL PLACES. 
	
	      // Display the result.
         JOptionPane.showMessageDialog(null, input +
                  " kilometers is " + miles + " miles.");
                  
      }// End actionPerformed
		
	}// End CalcButtonListener inner class
   
}// End KiloConverterWindow class