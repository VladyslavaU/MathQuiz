import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the name of student");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(scanner.next());
        startQuiz(student);
    }

    public static void startQuiz(Student student) {
        int currentScore = 0;
        Scanner scanner = new Scanner(System.in);
        MathQuiz mathQuiz = new MathQuiz();
        for (int i = 0; i < 10; i++) {
            System.out.println(mathQuiz.getQuestions()[i]);
            System.out.println("Enter the answer");
            int correctAnswer = mathQuiz.getAnswers()[i];
            currentScore += checkAnswer(correctAnswer, 1);
            student.setBestScore(currentScore);
            student.addScore(currentScore);
            student.addTries();
        }
        System.out.println("You scored " + currentScore);
        System.out.println("Would you like to try again?");
        String reply = scanner.next().toUpperCase();

        if (reply.equals("Y") || reply.equals("YES")) {
            startQuiz(student);
        }
    }

    public static int checkAnswer(int correctAnswer, int attempt) {
        if (attempt == 3) {
            return 0;
        }
        Scanner scanner = new Scanner(System.in);
        double answer = scanner.nextInt();
        if (answer == correctAnswer) {
            System.out.println("Correct");
            return attempt == 1 ? 2 : 1;
        } else {
            System.out.println("Incorrect.");
            if (attempt == 1) {
                System.out.println("You have one more try");
            }
            ++attempt;
            checkAnswer(correctAnswer, attempt);
        }
        return 0;
    }

}
