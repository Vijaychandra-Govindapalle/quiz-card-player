public class QuizCard {
    private String question;
    private String answer;

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
