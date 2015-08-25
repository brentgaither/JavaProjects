package joesautomotive;

import javax.swing.*;
import java.awt.*;

/******************************************************************
 *Brent Gaither
 * Joes Automotive (PricingPanel class)
 * This class creates the pricing panel for Joe's Automotive. This is
 * set up as the east panel.
 *******************************************************************/
public class PricingPanel extends JPanel {

    final private JRadioButton weekDay;
    final private JRadioButton weekEnd;
    final private ButtonGroup bg;
    /*
    Constructor
    */
    public PricingPanel()
    {
        weekDay = new JRadioButton("weekday",true);
        weekEnd = new JRadioButton("weekend");

        setLayout(new GridLayout(2,1));
        bg = new ButtonGroup();
        bg.add(weekDay);
        bg.add(weekEnd);

        setBorder(BorderFactory.createTitledBorder("Rate"));
        add(weekDay);
        add(weekEnd);
    }
    /****************************************************************
                    getPricingCost
    This method uses the JRadioButtons to find the rate to be paid.
*****************************************************************/
    public double getPricingCost()
    {
        double rate = .2;

        if (weekEnd.isSelected())  // Adds extra 20% for weekend
            return rate + 1;
        else
        return 1;
    }
    /****************************************************************
                    clearPricing
    This method sets back the JRadioButtons to their original setting.
*****************************************************************/
    public void clearPricing(){

        weekDay.setSelected(true);
        weekEnd.setSelected(false);
    }
}