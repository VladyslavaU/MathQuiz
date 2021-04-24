import java.util.Random;

public class Question {
    private final String QUESTION;
    private int result;
    private int secondNumber;
    private int firstNumber;
    private static final String[] ACTIONS = {"+", "-", "*", "/"};
    private final String ACTION;


    public Question() {
        Random rand = new Random();
        this.firstNumber = 1 + (int) (Math.random() * 50);
        this.secondNumber = 1 + (int) (Math.random() * 50);
        this.ACTION = ACTIONS[rand.nextInt(ACTIONS.length)];
        checkOperation();
        this.QUESTION = this.firstNumber + " " + this.ACTION + " " + this.secondNumber;
        calculateResult();
    }

    public double getResult() {
        return this.result;
    }

    public String getQuestion() {
        return this.QUESTION;
    }

    public void checkOperation() {
        if (this.secondNumber > this.firstNumber) {
            int temp = firstNumber;
            this.firstNumber = secondNumber;
            this.secondNumber = temp;
        }
        if (this.firstNumber % this.secondNumber != 0 && this.ACTION.equals("/")) {
            this.secondNumber = 1 + (int) (Math.random() * 50);
            checkOperation();
        }
    }

    public void calculateResult() {
        switch (this.ACTION) {
            case "+":
                this.result = this.firstNumber + this.secondNumber;
                break;
            case "-":
                this.result = this.firstNumber - this.secondNumber;
                break;
            case "/":
                this.result = this.firstNumber / this.secondNumber;
                break;
            case "*":
                this.result = this.firstNumber * this.secondNumber;
                break;
        }
    }

}
