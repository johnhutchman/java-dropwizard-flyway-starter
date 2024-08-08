package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectRequest {
    private String name;
    private double value;
    private int clientId;
    private int techLeadId;
    private int deliveryEmpId;
    private boolean completed;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public int getTechLeadId() {
        return techLeadId;
    }
    public void setTechLeadId(int techLeadId) {
        this.techLeadId = techLeadId;
    }
    public int getDeliveryEmpId() {
        return deliveryEmpId;
    }
    public void setDeliveryEmpId(int deliveryEmpId) {
        this.deliveryEmpId = deliveryEmpId;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @JsonCreator
    public ProjectRequest(@JsonProperty String name,@JsonProperty double value,@JsonProperty int clientId,@JsonProperty int techLeadId,@JsonProperty int deliveryEmpId, @JsonProperty boolean completed) {
        this.name = name;
        this.value = value;
        this.clientId = clientId;
        this.techLeadId = techLeadId;
        this.deliveryEmpId = deliveryEmpId;
        this.completed = completed;
    }
}
