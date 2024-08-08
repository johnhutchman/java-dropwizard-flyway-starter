package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientRequest {
    private String name;
    private int salesId;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalesId() {
        return salesId;
    }
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    @JsonCreator
    public ClientRequest(@JsonProperty String name, @JsonProperty int salesId) {
        this.name = name;
        this.salesId = salesId;
    }
}
