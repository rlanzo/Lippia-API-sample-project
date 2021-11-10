package api.model;


import java.util.List;

public class CambiarHoras {

    private String start;
    private Boolean billable;
    private String description;
    private String projectId;
    private String end;
    private List<CustomFieldValues> customFieldValues;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }


    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public List<CustomFieldValues> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<CustomFieldValues> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }
}