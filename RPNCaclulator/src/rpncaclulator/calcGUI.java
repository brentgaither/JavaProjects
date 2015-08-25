package rpncaclulator;

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
    private JTextField m_displayField;     // display result  

    //--- Variables representing the state of the calculator
    private String currentOp = "";      //Holds the current operator
    String[] opOrder = {"+", "-", "*", "/", "="};
    String expression;
    JButton space;
    int countDecimal;

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
        String buttonOrder = "789456123.0";

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3, 5, 5));

        //For loop creates and builds buttons
        for (int i = 0; i < buttonOrder.length(); i++) {
            String keyTop = buttonOrder.substring(i, i + 1);

            if (keyTop.equals("")) {
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
        ActionListener SpaceListener = new SpaceListener();
        space = new JButton("space");
        space.addActionListener(SpaceListener);
        space.setFont(BIGGER_FONT);
        buttonPanel.add(space);

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
        m_displayField.setText("0");
        countDecimal = 0; 
    }

    /* *********************************************************
               inner listener class OpListener              
     This class's action performed method is invoked whenever
     an operator button is pressed. 
     ***********************************************************/
    class OpListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //Gets the current operator
            String buttonOp = e.getActionCommand();

            //Displays the expression
            expression = m_displayField.getText();
            m_displayField.setText(expression + " " + buttonOp + " ");

            //Checks for equals operator
            if (buttonOp.equals("=")) {
                RPN RPNs = new RPN(expression);
                m_displayField.setText(RPNs.Evaluate(expression));                
            }
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
            expression = m_displayField.getText();
            

            if (expression.equals("0")) {
                m_displayField.setText(digit);
            } else { //Concatinates number 
                m_displayField.setText(expression + digit);
            }
            if (digit.equals(".") && ++countDecimal > 1) //Counts decimals
                m_displayField.setText("Error more than 1 decimal.");

            space.setEnabled(true);
        }//end actionPerformed method
    }//end NumListener class

    /* ************************************************
                    SpaceListener              
       This class's action performed method is invoked 
       whenever the space button is pressed. 
    **************************************************/
        class SpaceListener implements ActionListener {
            /**
             * ************** actionPerformed ****************
             */
            public void actionPerformed(ActionEvent e) {
                expression =  m_displayField.getText();
                m_displayField.setText(expression + " ");
                space.setEnabled(false);
                countDecimal = 0;
            }//end actionPerformed method
        }
    /************************************************
                inner listener class ClearListener              
         This class's action performed method is invoked 
         whenever the Clear button is pressed. 
     **************************************************/
        class ClearListener implements ActionListener {
        /*************** actionPerformed *************/
            public void actionPerformed(ActionEvent e) {
                action_clear();
            }//end actionPerformed method
        }//end ClearListener class

    }//end CalcGUI class
