import java.util.Scanner;

public class Questions {

    public String question;
    public String answer;
    public int points;

    public Questions(String question, String answer, int points) {
        this.question = question;
        this.answer = answer;
        this.points = points;
    }

    public void outputQuestion() {
        System.out.println(question);
    }

    public void checkAnswer() {
        // Input answer
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isRight = input.toLowerCase().equals(answer);

        // If/else answer is right
        if (isRight) {
            afterRightAnswerOutput();
        } else {
            afterWrongAnswerOutput();
        }
    }

    public void afterRightAnswerOutput() {
        System.out.println("You are right! \n");
        points ++;
    }

    public void afterWrongAnswerOutput() {
        System.out.println("You are wrong! \n");
    }
}
