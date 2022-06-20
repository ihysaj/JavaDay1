import java.util.Date;

public class TestAnswerCreate {
    public static void main(String[] args) {
        Answer answer=new Answer("1", "ira", "userAsk","doc",new Date(),new Date());
        System.out.println(answer.getId());
    }
}
