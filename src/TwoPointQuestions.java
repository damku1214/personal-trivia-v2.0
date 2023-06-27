public class TwoPointQuestions extends Questions {

    public TwoPointQuestions(String question, String answer, int points) {
        super(question, answer, points);
    }

    @Override
    public void afterRightAnswerOutput() {
        System.out.println("You are right! \n");
        points += 2;
    }
}
