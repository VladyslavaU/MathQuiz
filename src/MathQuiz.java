public class MathQuiz {

    private String[] questions = new String[10];
    private int[] answers = new int[10];


    public MathQuiz() {
        for (int i = 0; i < 10; i++) {
            Question question = new Question();
            this.questions[i] = question.getQuestion();
            this.answers[i] = (int) question.getResult();
        }
    }

    public String[] getQuestions() {
        return this.questions;
    }

    public int[] getAnswers() {
        return this.answers;
    }


}
