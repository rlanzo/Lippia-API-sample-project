package api.model;


import java.util.List;

public class ConsultarHoras {


    private String id;
    private String description;
    //private String tagIds;
    private String userId;
    private Boolean billable;
    private String taskId;
    private String projectId;
    private TimeInterval timeInterval;
    private String workspaceId;
    private Boolean isLocked;
    private List<CustomFieldValues> customFieldValues;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public String getTagIds() {
    //    return tagIds;
    //}

    //public void setTagIds(String tagIds) {
    //   this.tagIds = tagIds;
    //}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public List<CustomFieldValues> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<CustomFieldValues> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }
}