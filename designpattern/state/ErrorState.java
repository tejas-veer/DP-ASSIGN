class ErrorState implements CalculatorState {
    private final Calculator calculator;

    public ErrorState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void input(Character c) {
        if (c.equals('C')) {
            calculator.changeState(new ClearState(calculator));
        }
    }
}