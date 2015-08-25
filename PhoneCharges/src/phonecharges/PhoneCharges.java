package phonecharges;

// PHONE CHARGES 
//Brent Gaither 5/13/2014
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PhoneCharges extends JFrame {

    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 300;

    final double dayRate = .17;
    final double eveningRate = .12;
    final double nightRate = .05;

    JPanel northPanel;
    JPanel centerPanel;
    JPanel southPanel;
    JPanel buttonPanel;
    JPanel callLengthPanel;

    JRadioButton dayCall;
    JRadioButton eveningCall;
    JRadioButton nightCall;
    
    JTextField callLength;
    JLabel result;

    // ********************************
    //     Phone Charges Constructor 
    //
    // Creates the window when a 
    // PhoneCharges object is created.
    // ********************************
    public PhoneCharges() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setTitle("Long Distance Call Rate Calculator");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        // Call methods to build the three primary window panels.
        buildNorthPanel();
        buildSouthPanel();
        buildCenterPanel();

        // Add each panel to the proper BorderLayout region.
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // ***********************************
    //          buildNorthPanel
    //
    //  This method builds the north panel,
    //  which contains a company name.
    // ***********************************
    private void buildNorthPanel() {
        JLabel title = new JLabel("Gaither Gateways");
		
        northPanel = new JPanel();

        northPanel.add(title);
		
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
    private void buildSouthPanel() {
        JButton calculate = new JButton("Calculate");
        result = new JLabel();
     
        calculate.addActionListener(new ButtonListener());

        southPanel = new JPanel();

        southPanel.add(calculate);
        southPanel.add(result);
    }
    
    // ***********************************
    //          buildCenterPanel
    // This method builds the center panel 
    // which contains the button panel and 
    // call length panel.
    // ***********************************
    private void buildCenterPanel() {

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1,2));

	buildButtonPanel();
        buildCallLengthPanel();

        centerPanel.add(buttonPanel);
        centerPanel.add(callLengthPanel);
    }
     // ***********************************
    //          buildButtonPanel
    // This method builds the button panel which 
    // contains the JRadiobuttons and groups them.
    // ***********************************
    private void buildButtonPanel() {
        buttonPanel = new JPanel();

        buttonPanel.setLayout(new GridLayout(3,1));
        
        dayCall = new JRadioButton("DayTime   8:00 a.m. - 5:59 p.m.",true);
        eveningCall = new JRadioButton("Evening  6:00 p.m.-11:59 p.m.");
        nightCall = new JRadioButton("OverNight  12:00 a.m.- 7:59 a.m.");
   
        // Format the radio button text. 	
        dayCall.setFont(new Font("Courier New", Font.BOLD, 12));
        eveningCall.setFont(new Font("Courier New", Font.BOLD, 12));
        nightCall.setFont(new Font("Courier New", Font.BOLD, 12));

		//Group the radio buttons
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(dayCall);
        radioButtonGroup.add(eveningCall);
        radioButtonGroup.add(nightCall);

       buttonPanel.add(dayCall);
       buttonPanel.add(eveningCall);
       buttonPanel.add(nightCall);
       buttonPanel.setBorder(BorderFactory.
               createTitledBorder("Rate Categories")); 

    }
    // ***********************************
    //          buildCallLengthPanel
    // This method builds the call length panel
    // which contains the length JLabel call length
     // text field and JLabel minutes.
    // ***********************************
    private void buildCallLengthPanel() {
        callLengthPanel = new JPanel();

       callLengthPanel.setLayout(new GridLayout(3,1));
       
        JLabel blank1 = new JLabel("  ");
        JLabel blank2 = new JLabel("  ");
        JLabel blank3 = new JLabel("  ");
        JLabel blank4 = new JLabel("  ");
        JLabel blank5 = new JLabel("  ");
        JLabel blank6 = new JLabel("  ");

        JLabel len = new JLabel("Call length ");
        callLength = new JTextField(3);

        JLabel minutes = new JLabel("minutes");

        // Fill the top row of the callLengthPanel grid with blanks.	
        callLengthPanel.add(blank1);
        callLengthPanel.add(blank2);
        callLengthPanel.add(blank3);

        callLengthPanel.add(len);
        callLengthPanel.add(callLength);
        callLengthPanel.add(minutes);

        // Fill the bottom row of the callLengthPanel grid with blanks.	
        callLengthPanel.add(blank4);
        callLengthPanel.add(blank5);
        callLengthPanel.add(blank6);
    }

    // ***********************************
    //         RadioButtonListener
    //
    //  This method builds the south panel,
    //  which contains a CALCULATE button 
    //  and a JLabel in which the results 
    //  can be displayed.
    //
    // ***********************************
    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input;           
            double costPerMin = 0;
            double cost = 0;
            DecimalFormat format = new DecimalFormat("#.##");
            input = callLength.getText();
          
            costPerMin = Double.parseDouble(input);
            if (dayCall.isSelected()) {
                cost = costPerMin * dayRate;
                
            } else if (eveningCall.isSelected()) {
                cost = costPerMin * eveningRate;
            } else if (nightCall.isSelected()) {
                cost = Double.parseDouble(input) * nightRate;
            }
           
            String total = format.format(cost);
           
            result.setText("$ "+ total);
        }
    }

	// **************** main ******************
    public static void main(String[] args) {
        PhoneCharges pc = new PhoneCharges();
    }

}// End PhoneCharges class declaration

