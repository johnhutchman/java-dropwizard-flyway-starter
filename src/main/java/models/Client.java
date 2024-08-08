package models;

public class Client {
    private int clientId;
    private String name;
    private int salesEmpId;

    public Client(int clientId, String name, int salesEmpId) {
        this.clientId = clientId;
        this.name = name;
        this.salesEmpId = salesEmpId;
    }
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalesEmpId() {
        return salesEmpId;
    }
    public void setSalesEmpId(int salesEmpId) {
        this.salesEmpId = salesEmpId;
    }
}
