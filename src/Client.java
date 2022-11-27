//Client - Houses parent of Business and Individuals
//Holds name, locations or address, ordernum, and budget
public class Client {
    private String name;
    private String location;
    private int ordernum;
    private double budget;

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    //Constructor just to quickly make the Client
    public Client(String name, String location, int ordernum, double budget) {
        this.name = name;
        this.location = location;
        this.ordernum = ordernum;
        this.budget = budget;
    }

    public Client() {
        //Basic constructor with undefined variables
    }

    //toString method (or printInfo)
    @Override
    public String toString() {
        return "Client " +
                "name is " + name +
                ", location is " + location +
                ", order number is " + ordernum +
                ", budget is " + budget;
    }
}
