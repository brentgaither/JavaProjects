package calculator;

// calc-ui-model/CalcLogic.java - 
// This class implements the calculator logic with no user interface.
// Fred Swartz - 2004-11-17 
// Traivs Morrison and Brent Gaither 2014-5-28

/** *****************************************************************
 *                           CalcLogic 
 * This class carries out all the calculator operations. 
 * Separating the model (logic) from the interface has advantages.
 * In this program the model is small, so it may not be as obvious,
 * but in larger programs the advantages can be substantial.
 * 
 * 1. It is simpler for the developer to work with.
 * 2. It can be used with many kinds of interfaces without changes.  Eg,
 *    a GUI interface, a command-line interface, or a web-based interface.
 * 3. The model can be changed (eg, to work with BigInteger) without
 *    changing the user interface.  Of course, some changes require
 *    interface changes, but the separation makes this easier.
 *
 * Suggested Improvements:
 *    Handle floating point inputs and operations.
 *    Add Additional operations, such as change sign, mod, square root, etc.
 * 
 * @author  Fred Swartz
 *************************************************************************/

public class CalcLogic {
    
    // instance variables  
    private double m_currentTotal;     // The current total is all 
	                                 // we need to remember.
    // constructor  
    public CalcLogic() {
        m_currentTotal = 0.0;
    }
    
    // "Get" and "Set" functions 
	 public double getTotalString() {
        return  m_currentTotal;
    }
    
    public void setTotal(String n) {
        m_currentTotal = convertToNumber(n);
    }
    
    // Functions to carry out numberic operations
	 public void add(String n) {
        m_currentTotal += convertToNumber(n);
    }
    
    public void subtract(String n) {
        m_currentTotal -= convertToNumber(n);
    }
     
    public void multiply(String n) {
        m_currentTotal *= convertToNumber(n);
    }
    
    public void divide(String n) {
        m_currentTotal /=  convertToNumber(n);
    }

    public void mod(String n) {
        
        m_currentTotal %=  convertToNumber(n);
    }
    //This method checks for a divide by 0 
         public boolean isZero(String n) {
      double check = convertToNumber(n);
      
      if (check == 0)
        return true;
      else 
          return false;
    }
    // Function to parse a string representation of
	 // a number into an actual number
	 private double convertToNumber(String n) {
        return Double.parseDouble(n);
    }

}// End CalcLogic class/*
