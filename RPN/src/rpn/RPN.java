package rpn;

/*
 RPN class used to do RPN calculations. Written by
 Travis Morrison and Brent Gaither
 */
public class RPN {

    private Stack stack = new Stack();
    
    public RPN(String[] expression) {

    }
    /**
     * ***********************************************
     * Evaluate This method takes in a string expression
     *
     ************************************************
     */
    public String Evaluate(String expression) {

        String[] token = expression.split(" ");
        char op;
        double left;
        double right;
        for (int i = 0; i < token.length; i++) {
            try {
                stack.push(Double.parseDouble(token[i]));
            } catch (NumberFormatException ex) {
                if (stack.size() < 2) {
                    stack.emptyOut();
                    return "invalid";
                } else {
                    op = token[i].charAt(0);
                     right = stack.pop();
                     left = stack.pop();
                    switch (op) {

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
                            stack.push(left / right);
                            break;
                    }
                }
            }
        }
            if (stack.size() != 1) {
                stack.emptyOut();
                return "invalid11";
            }

        
        return "" + stack.pop();
    }
}