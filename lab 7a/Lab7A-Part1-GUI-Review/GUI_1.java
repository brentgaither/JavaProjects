import javax.swing.*;   // Needed for Swing classes

/** ********************************************************
   GUI Review Exercise 1
   This program displays a simple window with a title. The
   application exits when the user clicks the close button.
 ***********************************************************/
 
// 1. RUN THE PROGRAM TO SEE HOW IT BEHAVES.
// 2. TRY SIZING THE WINDOW.
// 3. NOW TRY MAXIMIZING THE WINDOW.
// 4. NOTE WHAT HAPPENS WHEN YOU CLICK THE X TO CLOSE THE WINDOW.
// 5. NOW MAKE THE TWO CHANGES TO THE CODE ASKED FOR IN THE CAPITALIZED 
//    INSTRUCTIONS WITHIN THE CODE BELOW.
// 6. NOW RUN THE PROGRAM AGAIN TO SEE THE RESULTS.

public class GUI_1
{
   public static void main(String[] args)
   {
      final int WINDOW_WIDTH  = 350;   // Window width in pixels
      final int WINDOW_HEIGHT = 250;   // Window height in pixels
		//CHANGE INITIAL WINDOW SIZE TO 800 by 600
		
      // Create a window.
      JFrame window = new JFrame();
      
      // Set the title.
      window.setTitle("A Simple Window");
		// CHANGE WINDOW TITLE TO "My First Window - Your name"

      // Set the size of the window.
      window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display the window.
      window.setVisible(true);
   }
}
