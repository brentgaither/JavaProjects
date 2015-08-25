package rpncaclulator;

import java.text.DecimalFormat;

/*
 RPN class used to do RPN calculations. Written by
 Travis Morrison and Brent Gaither
 */

public class RPN {

    private Stack stack = new Stack();

    public RPN(String expression) {

    }

    /**
     * **********************************************
     *                  Evaluate 
     * This method takes in a string expression and evaluates it.
     * ***********************************************
     */
    public String Evaluate(String expression) {

        String[] token = expression.split(" |  ");
         DecimalFormat format = new DecimalFormat("#.########");

        for (int i = 0; i < token.length; i++) {
            token[i] = token[i].trim();
        }

        char op;
        double right; //Pops first
        double left;// Pops second
        

        for (int i = 0; i < token.length; i++) {
            try { //Tries to parse to a double if not it is used as an operator
                stack.push(Double.parseDouble(token[i]));
            } catch (NumberFormatException ex) {
                if (stack.size() < 2) {
                    stack.emptyOut();
                    return "Invalid RPN expression";
                } else {
                    try { 
                        op = token[i].charAt(0);
                        right = stack.pop();
                        left = stack.pop();
                        switch (op) { //Performes arithmetic
                            case '+':
                                stack.push(left + right);
                                break;
                            case '-':
                                stack.push(left - right);
                                break;
                            case '*':
                                stack.push(left * right);
                                break;
                            case '/':
                                if (right == 0){
                                    return "Divide by 0";
                                }
                                stack.push(left / right);
                                break;
                        }
                    } 
                    catch (java.lang.StringIndexOutOfBoundsException e){
                        return "Only use space between numbers";
                    }
                }//end else
            }//end catch
    }//end for loop

    if (stack.size () 
        != 1) { //Stack is not 1 therefore invalid 
            stack.emptyOut();
        return "Invalid RPN expression";
    }
    double answer = stack.pop ();//Return last item on stack 
    if (answer % 1 ==0) //Checks for int
    {
    return "" +(int) answer;
    }
    else 
        return "" + format.format(answer);
} //End evaluate
} //End RPN 
