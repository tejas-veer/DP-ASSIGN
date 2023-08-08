class ClearState implements CalculatorState {
    private final Calculator calculator;

    public ClearState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void input(Character c) {
        if (c.equals('C')) {
            calculator.updateDisplay("");
            calculator.changeState(new BlankState(calculator));
        }
    }
}