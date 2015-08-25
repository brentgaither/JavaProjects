// PUT YOUR NAME HERE.

import javax.swing.*;       // Needed for Swing classes
import java.awt.*;          // Needed for Color class
import java.awt.event.*;    // Needed for event listener interface

/** ****************************************************************
                   ColorWindow Class Declaration
   This class demonstrates how to set the background color of
   a panel and the foreground color of a label.
 ******************************************************************/

// 1. RUN THIS PROGRAM TO SEE WHAT IT DOES. 
// 2. THEN MODIFY IT TO USE A SINGLE ButtonListener AND ASSOCIATE IT
//    WITH ALL THREE BUTTONS. YOU WILL NEED TO MODIFY ITS CODE TO SET
//    THE CORRECT BACKGROUND AND TEXT COLOR DEPENDING ON WHICH BUTTON
//    WAS "PRESSED" (I.E., ON WHICH BUTTON CLICK EVENT OCCURRED.)

public class ColorWindow extends JFrame
{
   private JLabel messageLabel;            // To display a message
   private JButton redButton;              // Changes color to red
   private JButton blueButton;             // Changes color to blue
   private JButton yellowButton;           // Changes color to yellow
   private JPanel panel;                   // A panel to hold components
   private final int WINDOW_WIDTH = 240;   // Window width
   private final int WINDOW_HEIGHT = 125;  // Window height

   // ******** Constructor *********
   public ColorWindow()
   {
      // Set the title bar text.
      setTitle("Color Buttons Demo");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a label.
      messageLabel = new JLabel("Click a button to " +
                                "select a color.");

      // Create the three buttons.
      redButton = new JButton("Red");
      blueButton = new JButton("Blue");
      yellowButton = new JButton("Yellow");

      // Register an event listener with all 3 buttons.
      redButton.addActionListener(new RedButtonListener());
      blueButton.addActionListener(new BlueButtonListener());
      yellowButton.addActionListener(new YellowButtonListener());

      // Create a panel and add the components to it.
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(redButton);
      panel.add(blueButton);
      panel.add(yellowButton);

      // Add the panel to the content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }
   
   /* *************** RedButtonListener Class **********
      Private inner class that handles the event when
      the user clicks the Red button.
    ****************************************************/
   private class RedButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to red.
         panel.setBackground(Color.red);

         // Set the label's text to blue.
         messageLabel.setForeground(Color.blue);
      }
   }

   /* *************** BlueButtonListener Class **********
      Private inner class that handles the event when
      the user clicks the Blue button.
    ****************************************************/
   private class BlueButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to blue.
         panel.setBackground(Color.blue);

         // Set the label's text to yellow.
         messageLabel.setForeground(Color.yellow);
      }
   }

   /* *************** YellowButtonListener Class **********
      Private inner class that handles the event when
      the user clicks the Yellow button.
    ****************************************************/
   private class YellowButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to yellow.
         panel.setBackground(Color.yellow);

         // Set the label's text to black.
         messageLabel.setForeground(Color.black);
      }
   }
}
