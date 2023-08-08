
class NumberState implements CalculatorState {
    private final Calculator calculator;

    public NumberState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void input(Character c) {
        if (calculator.isDigit(c)) {
            calculator.updateDisplay(calculator.getDisplay() + c);
        } else if (calculator.isOperator(c)) {
            calculator.setCurrentValue(Integer.parseInt(calculator.getDisplay()));
            calculator.setCurrentOperator(c);
            calculator.changeState(new OperatorState(calculator));
        } else if (calculator.isEqualsOperator(c)) {
            calculator.displayError();
        }
    }
}
