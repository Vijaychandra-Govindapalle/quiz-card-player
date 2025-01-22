public class QuizCard {
    private final String question;
    private final String answer;

    QuizCard(String q, String a){
        this.question = q;
        this.answer = a;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }
}
