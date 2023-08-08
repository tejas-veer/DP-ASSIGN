
class OperatorState implements CalculatorState {
    private final Calculator calculator;

    public OperatorState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void input(Character c) {
        if (calculator.isDigit(c)) {
            calculator.updateDisplay(c.toString());
            calculator.changeState(new NumberState(calculator));
        } else if (calculator.isOperator(c)) {
            // Evaluate the previous expression
            calculator.calculate(calculator.getCurrentValue().toString(), calculator.getCurrentOperator(), calculator.getDisplay());
            calculator.setCurrentOperator(c);
        } else if (calculator.isEqualsOperator(c)) {
            // Evaluate the expression and transition to the ResultState
            calculator.calculate(calculator.getDisplay());
            calculator.changeState(new ResultState(calculator));
        }
    }
}