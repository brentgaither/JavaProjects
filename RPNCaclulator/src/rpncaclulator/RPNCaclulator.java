package rpncaclulator; 
// *******************************************************************
//                           Calculator.java 
// This is the client program to create the CalcGUI Calculator object
// whose code written by Fred Swartz, modified in 2004 by Rodenbach, 
// modified in 2013 by J. Walters and updated by Travis 
// Morrison and Brent Gaither in 2014.

//     Level     : Intermediate.
//     Structure : Three files: main, GUI (subclass of JFrame), logic.
//     Components: JButton, JTextField (right justified).
//     Containers: JFrame, several JPanels.
//     Layouts   : BorderLayout to put the other panels together.
//                 Two GridLayout panels for the buttons.
//     Listeners : One ActionListener which is shared by all 
//                 numeric key buttons.  Similarly share
//                 an ActionListener for all operator buttons.
//                 ActionListener for Clear button.
//     Other     : Use Font to enlarge font for components.
//               : try...catch for NumberFormatExceptions.

// *********************************************************************

import javax.swing.*;

class RPNCalculator
{
    public static void main(String[] args)
    {
       JFrame window = new CalcGUI();
    }//end main
     
}//end Calculator client class
