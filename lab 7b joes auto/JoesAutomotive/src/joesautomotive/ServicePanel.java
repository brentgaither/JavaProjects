package joesautomotive;

/**
 * ****************************************************************
 * Brent Gaither Joes Automotive (servicePanel class) This class creates the
 * service panel for Joe's Automotive. This is set up as the West panel.
 * *****************************************************************
 */
import javax.swing.*;
import java.awt.*;

public class ServicePanel extends JPanel {

    public final double[] serviceCosts = {26.00, 18.00, 30.00,
        80.00, 15.00, 100.00, 20.00};

    JCheckBox[] serviceTypes = new JCheckBox[8];

    //Declare variables
    final private JLabel L_description;
    final private JLabel L_partTotal;
    final private JLabel L_laborHours;

    final private JTextField description;
    final private JTextField partTotal;
    final private JTextField laborHours;

    /*
     Constructor
     */
    public ServicePanel() {
        String[] serviceLabels = new String[8];
        serviceLabels[0] = "oil change";
        serviceLabels[1] = "lube job";
        serviceLabels[2] = "radiator flush";
        serviceLabels[3] = "transmission flush";
        serviceLabels[4] = "insepection";
        serviceLabels[5] = "muffler replacement";
        serviceLabels[6] = "tire rotation";
        serviceLabels[7] = "other services";

        //creat grid and sets layout
        setLayout(new GridLayout(8,4));

        for (int i = 0; i < 8; i++) {
            serviceTypes[i] = new JCheckBox(serviceLabels[i]);
            add(serviceTypes[i]);
        }

        L_description = new JLabel("description");
        L_partTotal = new JLabel("part total");
        L_laborHours = new JLabel("labor hours");

        description = new JTextField();
        partTotal = new JTextField();
        laborHours = new JTextField();
        add(description);
        add(L_description);

        add(partTotal);
        add(L_partTotal);

        add(laborHours);
        add(L_laborHours);

        /*
         getServiceCost method
         @serviceCost The cost of the selected services
         */
    }
/****************************************************************
                    getServiceCost 
    This method uses the serviceCost array to calculate the 
    total cost.
*****************************************************************/
    public double getServiceCost() {
        double cost = 0;
        double laborCost = 50;
        double hours;
        double parts;
        String inputHours;
        String inputPart;

        for (int i = 0; i < serviceTypes.length - 1; i++) {

            if (serviceTypes[i].isSelected()) {

                cost += serviceCosts[i];
            }
        }
        if (serviceTypes[7].isSelected()) {
            inputPart = partTotal.getText();
            parts = Double.parseDouble(inputPart);
            inputHours = laborHours.getText();
            hours = Double.parseDouble(inputHours);
            cost += (laborCost * hours) + parts;

        }
        return cost;
    }
/****************************************************************
                    clearService 
    This method uses clears the JCheckBoxes 
*****************************************************************/
    public void clearService() {

        for (int i = 0; i < 8; i++) {
            serviceTypes[i].setSelected(false);
        } 
         description.setText("");
         partTotal.setText("");
         laborHours.setText("");
  
    }
}
