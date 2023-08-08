class BlankState implements CalculatorState {
    private final Calculator calculator;

    public BlankState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void input(Character c) {
        if (calculator.isDigit(c)) {
            calculator.updateDisplay(c.toString());
            calculator.changeState(new NumberState(calculator));
        } else {
            calculator.displayError();
        }
    }
}
