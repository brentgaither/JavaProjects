// PHONE CHARGES INITIAL FILE -- REPLACE THIS LINE WITH THE PROGRAM NAME.
// PUT YOUR NAME(S) AND THE PROGRAM COMPLETION DATE HERE.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PhoneCharges extends JFrame
{
	private final int WINDOW_WIDTH = 550;
	private final int WINDOW_HEIGHT = 200;
	
	final double dayRate = .17;
	final double eveningRate = .12;
	final double nightRate = .05;
	
	// CREATE 5 JPanel VARIABLES (i.e. VARS THAT CAN REFERENCE A Jpanel OBJECT)
	// NAME THEM northPanel, centerPanel, southPanel, buttonPanel, AND callLengthPanel.
	
	// CREATE 3 JRadioButton VARIABLES THAT WILL BE USED TO DETERMINE THE CALL TYPE.
	// NAME THEM dayCall, eveningCall, AND nightCall.
	        
	// CREATE A JTextField VARIABLE NAMED callLength and a JLabel VARIABLE NAMED result.
		
	// ********************************
	//     Phone Charges Constructor 
	//
	// Creates the window when a 
	// PhoneCharges object is created.
	// ********************************
	public PhoneCharges()
	{
		// WRITE A LINE OF CODE TO SET THE WINDOW SIZE. 
		
		// WRITE A LINE OF CODE TO SET THE WINDOW TITLE    
		// TO BRIEFLY DESCRIBE THE WINDOW'S FUNCTION. 
		
		// WRITE A LINE OF CODE TO TELL THE PROGRAM WHAT TO DO WHEN THE WINDOW IS CLOSED.
				
		// WRITE A LINE OF CODE TO SET THE WINDOW LAYOUT TO A BORDER LAYOUT. 
	
		// Call methods to build the three primary window panels.
		buildNorthPanel();
		buildSouthPanel();
		buildCenterPanel();
	
		// Add each panel to the proper BorderLayout region.
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(centerPanel, BorderLayout.CENTER);
		
		// WRITE A LINE OF CODE TO MAKE THE WINDOW VISIBLE.
	}
	
	// ***********************************
	//          buildNorthPanel
	//
	//  This method builds the north panel,
	//  which contains a company name.
	// ***********************************
	private void buildNorthPanel()
	{
		// WRITE A LINE OF CODE TO CREATE A NEW JLabel REFERENCED BY
		// A JLabel VARIABLE NAMED title. THE STRING DISPLAYED IN THE
		// LABEL SHOULD HAVE A CATCHY COMPANY NAME THAT INCLUDES YOUR NAME.
		// IF YOU ARE WORKING WITH A PARTNER, IT SHOULD INCLUDE BOTH NAMES.
		// I NAMED MINE "Walters Wireless".
		
		// WRITE THE LINES OF CODE TO ACTUALLY CREATE THE JPanel OBJECT POINTED 
		// TO BY THE northPanel VARIABLE AND THEN TO ADD title TO THAT PANEL.
		// LET THE LAYOUT OF THIS PANEL DEFAULT TO A FLOW LAYOUT.
	}

	// ***********************************
	//          buildSouthPanel
	//
	//  This method builds the south panel,
	//  which contains a CALCULATE button 
	//  and a JLabel in which the results 
	//  can be displayed.
	//
	// ***********************************
	private void buildSouthPanel()
	{				
		// WRITE THE LINE OF CODE TO CREATE A JButton VARIABLE NAMED  
		// calculate THAT POINTS TO A NEW JButton OBJECT WITH THE
		// WORD "Calculate" ON IT.
		
 		// WRITE THE LINE OF CODE TO CREATE A NEW JLabel OBJECT POINTED TO
		// BY GLOBAL CLASS VARIABLE result. THE NEW JLabel SHOULD DISPLAY
		// A BLANK STRING. 
		
		// WRITE THE LINE OF CODE TO ASSOCIATE AN ACTION LISTENER CALLED
		// RadioButtonListener WITH THE calculate BUTTON. 
						
		// WRITE THE LINES OF CODE TO ACTUALLY CREATE THE JPanel OBJECT POINTED 
		// TO BY THE southPanel VARIABLE AND THEN TO ADD calculate AND result
		// TO THAT PANEL. LET THE LAYOUT OF THIS PANEL DEFAULT TO A FLOW LAYOUT.

	}

	// USING buildNorthPanel AND buildSouthPanel AS MODELS, CREATE
	// A BOXED HEADER FOR THE REST OF THE METHODS IN THE PROGRAM.
	
	private void buildCenterPanel()
	{
	   // WRITE THE LINES OF CODE TO CREATE THE JPanel OBJECT POINTED 
		// TO BY THE centerPanel VARIABLE AND TO GIVE IT A GRID LAYOUT
		// WITH ONE ROW AND TWO COLUMNS.
		
		// WRITE THE LINES OF CODE TO CALL THE buildButtonPanel AND
		// buildCallLengthPanel METHODS.
		 
		// WRITE THE LINES OF CODE TO	ADD buttonPanel AND callLengthPanel
		// TO THE centerPanel. 
	}
		
	private void buildButtonPanel()
	{	
  		// WRITE THE LINES OF CODE TO CREATE A NEW JPanel OBJECT POINTED AT
		// BY THE GLOBAL buttonPanel VARIABLE. LOOK AT THE SAMPLE SCREEN IN
		// THE PROGRAM SPECS TO DETERMINE WHAT LAYOUT THIS PANEL SHOULD HAVE.
		
   	// WRITE THE LINES OF CODE TO CREATE THE 3 JRadioButton OBJECTS 
		// POINTED AT BY THE GLOBAL VARIABLES dayCall, eveningCall, AND nightCall.  
		// LOOK AT THE SAMPLE SCREEN IN THE PROGRAM SPECS TO SEE WHAT LABEL
		// SHOULD APPEAR NEXT TO EACH BUTTON. SET THE dayCall BUTTON TO BE
		// THE INITIALLY SELECTED BUTTON.
		
      // Format the radio button text. 	
		dayCall.setFont(new Font ("Courier New", Font.BOLD, 12));
		eveningCall.setFont(new Font ("Courier New", Font.BOLD, 12));
		nightCall.setFont(new Font ("Courier New", Font.BOLD, 12));
				
		//Group the radio buttons
		// WRITE THE CODE TO CREATE A ButtonGroup AND TO THEN ADD 
		// THE 3 BUTTON OBJECTS YOU JUST CREATED TO THIS ButtonGroup.
		// THIS IS WHAT MAKES THESE BUTTONS A MUTUALLY EXCLUSIVE GROUP.
				
		// WRITE THE LINES OF CODE TO ADD THE THREE RADIO BUTTONS TO
		// THE buttonPanel.
		
   	// MAKE A TITLED BORDER AROUND THAT buttonPanel THAT HAS THE TITLE
		// "Rate Categories".
   }

	private void buildCallLengthPanel()
	{
	   // WRITE THE LINES OF CODE TO CREATE A NEW JPanel OBJECT POINTED 
		// AT BY THE GLOBAL callLengthPanel VARIABLE. GIVE IT A 3 x 3 GRID LAYOUT. 	
			
		JLabel blank1 = new JLabel("  ");
		JLabel blank2 = new JLabel("  ");
		JLabel blank3 = new JLabel("  ");
		JLabel blank4 = new JLabel("  ");
		JLabel blank5 = new JLabel("  ");
		JLabel blank6 = new JLabel("  ");

		JLabel len = new JLabel("      Call length ");
 		
		// WRITE THE LINE OF CODE TO CREATE A NEW JTextField POINTED TO BY THE callLength
		// VARIABLE. THE FIELD SHOULD PERMIT THE USER TO ENTER A MAXIMUM OF 3 CHARACTERS.
		
		// WRITE THE LINE OF CODE TO CREATE A NEW JLabel HOLDING THE STRING "minutes.".
		
		// Fill the top row of the callLengthPanel grid with blanks.	
		callLengthPanel.add(blank1);
		callLengthPanel.add(blank2);
		callLengthPanel.add(blank3);
		
		// WRITE THE LINES OF CODE TO ADD THE 3 LABELS AND TEXT FIELDS JUST CREATED
		// TO THE MIDDLE ROW OF THE callLengthPanel IN THE PROPER ORDER 
				
		// Fill the bottom row of the callLengthPanel grid with blanks.	
		callLengthPanel.add(blank4);
		callLengthPanel.add(blank5);
		callLengthPanel.add(blank6);
	}

 	// REPLACE THE ____ IN THE CLASS DECLARATION BELOW WITH THE NEEDED WORDS.	
	
	private class RadioButtonListener _____________________
	{
	 	// WRITE THE actionPerformed METHOD FOR THIS ActionListener.
      // IT WILL NEED SOME LOCAL VARIABLES.
		
		// IT MUST INCLUDE CODE FOR ALL THE ACTIONS TO BE CARRIED OUT
		// WHENEVER A Calculate BUTTON CLICK EVENT OCCURS (I.E.
		// WHENEVER THE USER CLICKS THE Calculate BUTTON).
		
		// THIS INCLUDES RETRIEVING CALL LENGTH INFORMATION FROM THE APPROPRIATE 
		// TEXT FIELD, DETERMINING THE PRICE-PER-MINUTE BASED ON WHICH RADIO BUTTON 
		// IS SELECTED, PERFORMING ANY NEEDED CALCULATIONS, AND CAUSING THE NICELY
		// FORMATTED ANSWER TO DISPLAY IN THE result TEXT FIELD.
	}
		
	// **************** main ******************
	
	public static void main (String[] args)
	{
		PhoneCharges pc = new PhoneCharges();
	}

}// End PhoneCharges class declaration

