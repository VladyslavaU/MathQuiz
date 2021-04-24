import java.util.ArrayList;

public class Student {
    private String name;
    private int numberOfTries;
    private int bestScore;
    private ArrayList<Integer> allScores = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBestScore(int score) {
        this.bestScore = Math.max(this.bestScore, score);
    }

    public int getBestScore() {
        return this.bestScore;
    }

    public void addTries() {
        this.numberOfTries++;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void printScores() {
        System.out.println(allScores);
    }

    public void addScore(int score) {
        this.allScores.add(score);
    }
}
