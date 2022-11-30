package TESoftware.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class Order {
    private SimpleStringProperty OrderNum;
    private SimpleStringProperty Clients;
    private SimpleStringProperty BudgetPrice;
    private SimpleStringProperty Comments;

    public Order(String OrderNum, String Clients, String BudgetPrice, String Comments){
        this.OrderNum = new SimpleStringProperty(OrderNum);
        this.Clients = new SimpleStringProperty(Clients);
        this.BudgetPrice = new SimpleStringProperty(BudgetPrice);
        this.Comments = new SimpleStringProperty(Comments);
    }

    public String getOrderNum() {
        return OrderNum.get();
    }

    public void setOrderNum(String OrderNum) {
        this.OrderNum.set(OrderNum);
    }

    public SimpleStringProperty getOrderNumProperty() {
        return OrderNum;
    }

    public String getClients() {
        return Clients.get();
    }

    public void setClients(String Clients) {
        this.Clients.set(Clients);
    }

    public SimpleStringProperty getClientsProperty() {
        return Clients;
    }

    public String getBudgetPrice() {
        return BudgetPrice.get();
    }

    public void setBudgetPrice(String BudgetPrice) {
        this.BudgetPrice.set(BudgetPrice);
    }

    public SimpleStringProperty getBudgetPriceProperty() {
        return BudgetPrice;
    }

    public String getComments() {
        return Comments.get();
    }

    public void setComments(String Comments) {
        this.Comments.set(Comments);
    }

    public SimpleStringProperty getCommentsProperty() {
        return Comments;
    }

    public ObservableValue<String> OrderNumProperty() {
        return OrderNum;
    }

    public ObservableValue<String> ClientsProperty() {
        return Clients;
    }

    public ObservableValue<String> BudgetPriceProperty() {
        return BudgetPrice;
    }

    public ObservableValue<String> CommentsProperty() {
        return Comments;
    }

}
