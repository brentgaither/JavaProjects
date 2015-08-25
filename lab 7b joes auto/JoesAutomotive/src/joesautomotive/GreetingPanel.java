package joesautomotive;

/**
 * ****************************************************************
 * Brent Gaither Joes Automotive (GreetingPanel class) This class creates the
 * greeting panel for Joe's Automotive. This is set up as the north panel.
 ******************************************************************
 */
import javax.swing.*;
import java.awt.*;

public class GreetingPanel extends JPanel {

    final private JLabel greeting;

    /* 
     Constructor
     */
    public GreetingPanel() {
        greeting = new JLabel("Welcome to Joe's Automotive");
        add(greeting);
    }
}
