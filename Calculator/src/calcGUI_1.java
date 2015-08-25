package calculator;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.*;

/* ***********************************************************
 calc-ui-model/CalcGUI.java - A GUI for the calculator.
 @author Fred Swartz
 @version 2004-04-20 Rodenbach
 @version 2013 J. Walters
 @version 2014 Brent Gaither & Travis Morrison
 This class provides the user interface for the calculator.
 *************************************************************/
class CalcGUI extends JFrame {

    //============constants============ 
    private final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);

    //===== instance variables ========
    //--- Component referenced during execution
    private JTextField m_displayField;           // display result  

    //--- Variables representing the state of the calculator
    private boolean m_startNumber = true;      // true = num key MUST be next

    private String m_previousOp = "=";       // Holds the previous operator
    private String currentOp = "";           //Holds the current operator
    // --- Reference variable "pointing" to another object
    private CalcLogic m_logic = new CalcLogic(); // A CalcLogic object is a class
    boolean firstOp = true;
    String[] opOrder = {"+", "-", "*", "/", "%", "="};
    String buildNum = "";
    int countDecimal = 0;
    // member. This is aggregation.  
    
    //======== constructor ======== 
    public CalcGUI() {
        // Create the display field
        m_displayField = new JTextField("0", 12);
        m_displayField.setHorizontalAlignment(JTextField.RIGHT);
        m_displayField.setFont(BIGGER_FONT);

        // Create the Clear button
        JButton clearButton = new JButton("CLEAR");
        clearButton.setFont(BIGGER_FONT);
        clearButton.addActionListener(new ClearListener());

        //--- Create an ActionListener for ALL numeric keys
        ActionListener numListener = new NumListener();

        // Lay out the numeric keys in a grid.  Generate the buttons
        // in a loop from the chars in a string and associate the
        // numListener with each of them.
        String buttonOrder = "789456123 0.";

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3, 5, 5));

        //For loop creates and builds buttons
        for (int i = 0; i < buttonOrder.length(); i++) {
            String keyTop = buttonOrder.substring(i, i + 1);

            if (keyTop.equals(" ")) {
                buttonPanel.add(new JLabel(""));
            } else {
                JButton b = new JButton(keyTop);
                b.addActionListener(numListener);
                b.setFont(BIGGER_FONT);
                buttonPanel.add(b);
            }
        }

        // Create an ActionListener for ALL operator buttons.
        ActionListener opListener = new OpListener();

        // Create a panel with a grid layout to hold the operator buttons.
        // Use an array of button names to create the buttons in a loop
        // and associate the OpListener with each of them.
        JPanel opPanel = new JPanel();
        opPanel.setLayout(new GridLayout(5, 1, 5, 5));

        for (int i = 0; i < opOrder.length; i++) {
            JButton b = new JButton(opOrder[i]);
            b.addActionListener(opListener);
            b.setFont(BIGGER_FONT);
            opPanel.add(b);
        }

        // Create the top level panel and add all the
        // objects created above to it.
        JPanel content = new JPanel();

        content.setLayout(new BorderLayout(5, 5));
        content.add(m_displayField, BorderLayout.NORTH);
        content.add(buttonPanel, BorderLayout.CENTER);
        content.add(opPanel, BorderLayout.EAST);
        content.add(clearButton, BorderLayout.SOUTH);

        content.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //--- Finish building the window (JFrame)
        this.setContentPane(content);
        this.pack();
        this.setTitle("Travis and Brent's calculator");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }//end constructor


    /* **********************************************************
     action_clear                         
     This method is called by the Clear button action listener 
     and elsewhere to clear the display screen and reset all
     variables to begin a new calculation.
     **********************************************************/
    private void action_clear() {
        m_startNumber = true;         // Expecting number, not op.
        m_displayField.setText("0");
        m_previousOp = "=";
        m_logic.setTotal("0");
        buildNum = "";                  //Sets number to null
        countDecimal = 0;               //Resets decimal count
    }

    /* *********************************************************
     inner listener class OpListener              
     This class's action performed method is invoked whenever
     an operator button is pressed. 
     ***********************************************************/
    class OpListener implements ActionListener {

        /* *********************************************************
         actionPerformed
         The calculator is always in one of two states.
         1. A number must be entered, in which case this method
         reports that pressing an operator now was an ERROR. 
         2. An operator can be entered. If we are in this state,
         this is a correct choice and the method handles it.
         ***********************************************************/
        DecimalFormat format = new DecimalFormat("#.########");

        public void actionPerformed(ActionEvent e) {

            //Gets the current operator
            String buttonOp = e.getActionCommand();        

            //Displays the expression
           String expression = m_displayField.getText();
           m_displayField.setText(expression + " " + buttonOp + " ");
           
            if (m_startNumber) // Error: number needed, not an operator
            {
                action_clear();
                m_displayField.setText("ERROR - No operator");
            } 
            else // An op was fine. Handle it.
            {
                try {    // Get value from display field. 

              // Do prev op. If this is the FIRST op, m_previousOp will be =.
                  if (m_previousOp.equals("=")) 
                      m_logic.setTotal(buildNum);
                  else if (m_previousOp.equals("+"))
                      m_logic.add(buildNum);                       
                  else if (m_previousOp.equals("-")) 
                      m_logic.subtract(buildNum);
                  else if (m_previousOp.equals("*")) 
                      m_logic.multiply(buildNum);
                  else if (m_previousOp.equals("/")
                          && !m_logic.isZero(buildNum)) 
                      m_logic.divide(buildNum);
                  else if (m_previousOp.equals("%")) 
                      m_logic.mod(buildNum);
                  
                  
                  //Checks for divide by 0 error
                  if (m_logic.isZero(buildNum)) 
                      m_displayField.setText("Divide by 0");
                  
                  //Displays ints
                  else if (buttonOp.equals("=") && /* its an int */
                          m_logic.getTotalString() % 1 == 0) 
                  {
                      m_displayField.setText("" + 
                      (int) m_logic.getTotalString());
                  //Displays doubles to 8 decimal places
                  }               
                  else if(buttonOp.equals("=")) 
                  {
                      m_displayField.setText
                                (format.format(m_logic.getTotalString()));
                  }

                } catch (NumberFormatException ex) {
                    action_clear();
                    m_displayField.setText("Error");
                }
              
                // The CURRENT operator now becomes the PREVIOUS operator.
                m_previousOp = buttonOp;
                countDecimal = 0;
                
               //Checks for equals operator
               if (!buttonOp.equals("="))
               {     // Reset m_startNumber to indicate that
                     //the NEXT key pressed must be a number.
                    m_startNumber = true;              
                    buildNum = "";   
               } 
                else                  
                   buildNum = m_displayField.getText();
            }//endif m_startNumber
        }//end actionPerformed method
    }//end OpListener class

    /* *********************************************************
     inner listener class NumListener              
     This class's action performed method is invoked 
     whenever a number button is pressed. 
     ***********************************************************/
    class NumListener implements ActionListener {

        /**
         * ************ actionPerformed ***************
         */
    
        public void actionPerformed(ActionEvent e) {
            // Get text from button
            String digit = e.getActionCommand();
           String expression = m_displayField.getText();
                
           buildNum += digit; // Adds digit to string

           m_startNumber = false;
            if(expression.equals("0"))         
                m_displayField.setText(digit);
            else
                m_displayField.setText(expression + digit);
            //Counts number of decimals in each number
             if (digit.equals(".") && ++countDecimal > 1) 
                   m_displayField.setText("Error more than 1 decimal.");
       
        }//end actionPerformed method
    }//end NumListener class

    /* ************************************************
     inner listener class ClearListener              
     This class's action performed method is invoked 
     whenever the Clear button is pressed. 
     **************************************************/
    class ClearListener implements ActionListener {

        /**
         * ************** actionPerformed ****************
         */
        public void actionPerformed(ActionEvent e) {
            action_clear();
        }//end actionPerformed method
    }//end ClearListener class

}//end CalcGUI class
