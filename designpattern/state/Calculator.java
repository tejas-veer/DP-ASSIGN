
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private CalculatorState currentState;
    private StringBuilder display;
    private List<Character> operators;

    private Integer currentValue;
    private Character currentOperator;

    public Calculator() {
        display = new StringBuilder();
        operators = new ArrayList<Character>() {
            {
                add('+');
                add('-');
                add('*');
                add('/');
            }
        };
        currentState = new BlankState(this);
    }

    public String getDisplay() {
        return display.toString();
    }

    public void input(Character c) {
        currentState.input(c);
    }

    public boolean isDigit(Character c) {
        return c >= '0' && c <= '9';
    }

    public boolean isOperator(Character c) {
        return operators.contains(c);
    }

    public boolean isEqualsOperator(Character c) {
        return c != null && c.equals('=');
    }

    public void updateDisplay(String value) {
        display = new StringBuilder(value);
    }

    public void displayError() {
        updateDisplay("Error");
        currentState = new ErrorState(this);
    }

    public void changeState(CalculatorState newState) {
        currentState = newState;
    }

    public void calculate(String firstOperand, Character operator, String secondOperand) {
        int result = operate(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand), operator);
        updateDisplay(Integer.toString(result));
        currentState = new ResultState(this);
    }

    public void calculate(String secondOperand) {
        calculate(currentValue.toString(), currentOperator, secondOperand);
    }

    public int operate(int i1, int i2, Character operator) {
        switch (operator) {
            case '+':
                return i1 + i2;
            case '-':
                return i1 - i2;
            case '*':
                return i1 * i2;
            case '/':
                return i1 / i2;
        }
        throw new RuntimeException("Invalid operator");
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public Character getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Character currentOperator) {
        this.currentOperator = currentOperator;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input('1');
        calculator.input('2');
        calculator.input('+');
        calculator.input('3');
        calculator.input('=');

        System.out.println("Result: " + calculator.getDisplay()); // Should display "15"
    }
}