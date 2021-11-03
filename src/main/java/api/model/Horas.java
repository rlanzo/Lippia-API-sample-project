package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Horas {

    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("tagIds")
    private String tagIds;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("billable")
    private Boolean billable;
    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("projectId")
    private String projectId;
    @JsonProperty("timeInterval")
    private String timeInterval;
    @JsonProperty("start")
    private String start;
    @JsonProperty("end")
    private String end;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("workspaceId")
    private String workspaceId;
    @JsonProperty("isLocked")
    private String isLocked;
    @JsonProperty("customFieldValues")
    private String customFieldValues;


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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }


    public String getTagIds() {
        return tagIds;
    }

    public void setTaskIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setprojectId(String projectId) {
        this.projectId = projectId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {this.end = end;}

    public String getisLocked() {
        return isLocked;
    }

    public void setisLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(String customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String projectId) {
        this.timeInterval = timeInterval;
    }

}