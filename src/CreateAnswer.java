import java.util.Date;

public class CreateAnswer extends Answer {
    private final boolean isCompleted;

    public CreateAnswer(String templateId, String managerId, Date createdAt, boolean isCompleted) {
        super(null, null, null, null, null, null);
        this.isCompleted = isCompleted;
    }
}