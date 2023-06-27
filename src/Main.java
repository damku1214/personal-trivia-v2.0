// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Assigning questions
        Questions question1 = new Questions("What month did Jacob graduate? (1 point)", "june", 0);
        TwoPointQuestions question2 = new TwoPointQuestions("What is Jacob's favorite game? (2 points)", "minecraft", 0);
        ThreePointQuestions question3 = new ThreePointQuestions("What did Jacob eat this morning? (2023/06/27) (3 points)", "sandwich", 0);
        Questions question4 = new Questions("What grade did Jacob get for math on his report card? (1 point)", "100", 0);
        TwoPointQuestions question5 = new TwoPointQuestions("What is the console out of the big 3 that Jacob doesn't have? (2 points)",
                "playstation", 0);

        // The quiz
        question1.outputQuestion();
        question1.checkAnswer();
        question2.outputQuestion();
        question2.checkAnswer();
        question3.outputQuestion();
        question3.checkAnswer();
        question4.outputQuestion();
        question4.checkAnswer();
        question5.outputQuestion();
        question5.checkAnswer();

        // Results
        int totalPoints = question1.points + question2.points + question3.points + question4.points + question5.points;
        System.out.println("Congratulations! You have finished the quiz. Your final score is " + totalPoints + " points.");
    }
}