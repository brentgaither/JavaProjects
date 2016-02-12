package joesautomotive;

/**
 * ****************************************************************
 * Brent Gaither Joes Automotive This program creates a GUI for Joe's
 * Automotive. The program uses 4 classes to set up each panel.
 * *****************************************************************
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class JoesAutomotive extends JFrame {

    final private ServicePanel service;   // Service panel
    final private GreetingPanel greeting;  // Greeting panel
    final private PricingPanel pricing;   // Pricing panel
    private JPanel buttons;   // Button Panel
    private JLabel result;

    public JoesAutomotive() {
        //displays title
        setTitle("Joes Automotive");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        //Creat Panels
        greeting = new GreetingPanel();
        service = new ServicePanel();
        pricing = new PricingPanel();

        buildButtonPanel();

        //Add Panels
        add(greeting, BorderLayout.NORTH);
        add(service, BorderLayout.WEST);
        add(pricing, BorderLayout.EAST);
        add(buttons, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void buildButtonPanel() {
        buttons = new JPanel();

        JButton calcButton = new JButton("Calculate");
        JButton clear = new JButton("Clear");

        calcButton.addActionListener(new CalcButtonListener());
        clear.addActionListener(new ClearButtonListener());

        result = new JLabel("");

        buttons.add(calcButton);
        buttons.add(clear);
        buttons.add(result);
    }

    class CalcButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            DecimalFormat dollar = new DecimalFormat("0.00");

            double total = 0.0;;

            total += (service.getServiceCost()) * pricing.getPricingCost();

            result.setText("$ " + dollar.format(total));

        }
    }
    private class ClearButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            pricing.clearPricing();
            service.clearService();
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new JoesAutomotive();
    }
}// end JoesAutomotive class
