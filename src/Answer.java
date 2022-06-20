import java.util.Date;

public class Answer {
    public String getId() {
        return id;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    private final String id;
    private final String templateId;
    private final String surveyId;
    private final String title;
    private final Date createdAt;
    private final Date completedAt;


    public Answer(String id, String templateId, String surveyId, String title, Date createdAt, Date completedAt){
        this.id = id;
        this.templateId = templateId;
        this.surveyId = surveyId;
        this.title = title;
        this.createdAt = createdAt;
        this.completedAt = completedAt;
    }
}
