
class ResultState implements CalculatorState {
    private final Calculator calculator;

    public ResultState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void input(Character c) {
        if (calculator.isEqualsOperator(c)) {
            calculator.calculate(calculator.getCurrentValue().toString(), calculator.getCurrentOperator(), calculator.getDisplay());
        } else if (calculator.isDigit(c)) {
            calculator.updateDisplay(c.toString());
            calculator.changeState(new NumberState(calculator));
        }
    }
}
